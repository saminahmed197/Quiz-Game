package Login;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class stuLogout implements ActionListener {
	JFrame window = new JFrame();
	JLabel msg = new JLabel();
	JLabel msg2 = new JLabel("See you soon");
	JButton logout = new JButton("Logout");
	
	public void initGui(int mark) {
		GridLayout gl = new GridLayout(3,1,2,2);
		window.setLayout(gl);
		
		
		msg.setText("Well done! You got "+mark);
		window.add(msg);
		window.add(msg2);
		window.add(logout);
		
		window.setTitle("Logout window");
		window.setSize(500, 300);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.setFont(new Font("Arial", Font.BOLD, 14));
		msg2.setFont(new Font("Arial", Font.BOLD, 14));
		logout.setFont(new Font("Arial", Font.BOLD, 13));
		
		logout.addActionListener(this);
		
		window.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout) {
			Login l = new Login();
			l.initGui();
			window.dispose();
		
		}
		
	}
	

}
