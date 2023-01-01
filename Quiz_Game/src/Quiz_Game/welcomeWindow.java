package Quiz_Game;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import Login.CounterTimerGUI;

public class welcomeWindow implements ActionListener {
	

	JFrame window = new JFrame();
	private JLabel timeLabel = new JLabel();

	JLabel usermsg = new JLabel();
	JLabel welcomemsg = new JLabel("Welcome to mango quiz program");
	JLabel welcomemsg2 = new JLabel("Good Luck!");
	
	//JButton exit = new JButton("Exit");
	JButton gotoQues = new JButton("Play");
		public void initGui(String name) {
		
		GridLayout gl = new GridLayout(4,1,5,5);
		window.setLayout(gl);
		File f = new File(".\\info.txt");
		try {
		FileWriter output = new FileWriter(f,true);
			output.write(name);

		
		output.close();
		window.dispose();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			}
		
		usermsg.setText("Hi!  " +name);
		window.add(usermsg);
		window.add(welcomemsg);
		window.add(welcomemsg2);
		window.add(gotoQues);
		//window.add(exit);
		
		window.setTitle("Welcome window");
		window.setSize(500, 300);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		usermsg.setFont(new Font("Arial", Font.BOLD, 14));
		welcomemsg.setFont(new Font("Arial", Font.BOLD, 14));
		welcomemsg2.setFont(new Font("Arial", Font.BOLD, 14));
		gotoQues.setFont(new Font("Arial", Font.BOLD, 13));
		
		//exit.addActionListener(this);
		gotoQues.addActionListener(this);
	
		
		window.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==gotoQues) {
			CounterTimerGUI ct=new CounterTimerGUI();
			 {java.awt.EventQueue.invokeLater(new Runnable() {
		       public void run() {
		         new CounterTimerGUI();
		       }
		    });

			 }
			 
			Questions q = new Questions();
			q.initGui();
			
           
		 window.dispose();
		
		
		
		}
		//else if(e.getSource()== exit) {
		//	window.dispose();
		//}
	}
	

}