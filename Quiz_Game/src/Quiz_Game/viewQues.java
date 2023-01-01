package Quiz_Game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

import Login.Login;
import Login.QuesMark;

public class viewQues implements ActionListener {
	JFrame window = new JFrame();
	JLabel q1 = new JLabel(" Que1: what is a mango?");
	JLabel a1 = new JLabel("correct ans is: A fruit");
	JLabel q2 = new JLabel("Que2: name of our country?");
	JLabel a2 = new JLabel("correct ans is:Bangladesh");
	JLabel q3 = new JLabel("Que3: java supports multiple inheritance through");
	JLabel a3 = new JLabel("correct ans is:interface");
	JLabel q4 = new JLabel("Que4: Which one among these is not a primitive datatype?");
	JLabel a4 = new JLabel("correct ans is:String");
	JLabel q5 = new JLabel("Que5: Capital of bangladesh?");
	JLabel a5 = new JLabel("correct ans is: Dhaka");
	JLabel e1 = new JLabel();
	JLabel e2 = new JLabel();
	JLabel e3 = new JLabel();
	JLabel e4 = new JLabel();
	JButton logout = new JButton("Logout");
	JButton back = new JButton("back");
	public void initGui() {
		GridLayout gl = new GridLayout(16,1,1,0);
		window.setLayout(gl);
		
		
		window.add(q1);
		window.add(a1);
		window.add(e1);
		window.add(q2);
		window.add(a2);
		window.add(e2);
		window.add(q3);
		window.add(a3);
		window.add(e3);
		window.add(q4);
		window.add(a4);
		window.add(e4);
		window.add(q5);
		window.add(a5);
		window.add(logout);
		window.add(back);
		
		window.setTitle("Questions");
		window.setSize(800, 500);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		logout.setFont(new Font("Arial", Font.BOLD, 13));
		
		logout.addActionListener(this);
		back.addActionListener(this);
		
		window.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout) {
			Login l = new Login();
			l.initGui();
			window.dispose();
		
		}
		else if(e.getSource()==back) {
			QuesMark qm = new QuesMark();
			qm.initGui();
			window.dispose();
		
		}

	}
}