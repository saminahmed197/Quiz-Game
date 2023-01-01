package Login;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.*;

import Quiz_Game.viewQues;

public class QuesMark implements ActionListener {
	JFrame window = new JFrame();
	JButton q = new JButton("See Questions");
	JButton m = new JButton("Check Marks");
	
	//JButton exit = new JButton("exit");
	JButton logout = new JButton("Logout");
	public void initGui() {
		GridLayout gl = new GridLayout(2,2,5,5);
		window.setLayout(gl);
		
		
		window.add(q);
		window.add(m);
		//window.add(exit);
		window.add(logout);
		//window.add(a2);
		//window.add(e2);
		window.setTitle("Teachers' choice");
		window.setSize(400, 200);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		q.setFont(new Font("Arial", Font.BOLD, 13));
		m.setFont(new Font("Arial", Font.BOLD, 13));
		//exit.setFont(new Font("Arial", Font.BOLD, 13));
		logout.setFont(new Font("Arial", Font.BOLD, 13));
		
		q.addActionListener(this);
		m.addActionListener(this);
		//exit.addActionListener(this);
		logout.addActionListener(this);
		
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout) {
			Login l= new Login();
			l.initGui();
			window.dispose();
		
		}
		else if(e.getSource()==q) {
			viewQues v = new viewQues();
			v.initGui();
			window.dispose();
		
		}
		else if(e.getSource()==m) {
			User[] students = new User[100];
			int count = 0;
			
			File file = new File(".\\info.txt");
			try {
				Scanner input = new Scanner(file);
				while(input.hasNext()) {
					String Name = input.next();
					int mark = input.nextInt();
					
					//String name = fName + " " + lName;
				   User s=new User(Name, mark) ;
					
					students[count] = s;
					count++;
				}
				input.close();
				
				//window.dispose();
				InfoDetails info = new InfoDetails();
				info.initGUI(students, count);
				window.dispose();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		
		}
		

	}

}

