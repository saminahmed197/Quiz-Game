package Login;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

import Quiz_Game.welcomeWindow;

public class Login implements ActionListener {

	JFrame window = new JFrame();

	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	// JLabel empty = new JLabel();
	JTextField usernametxt = new JTextField();
	JPasswordField passwordtxt = new JPasswordField();
	JButton signup = new JButton("sign up");
	JButton login = new JButton("Login");
	JButton exit = new JButton("Exit");
	JButton tl = new JButton("Admin Login");

	public void initGui() {
		GridLayout gl = new GridLayout(4, 2, 2, 2);
		window.setLayout(gl);

		window.add(username);
		window.add(usernametxt);
		window.add(password);
		window.add(passwordtxt);
		window.add(signup);
		window.add(login);
		window.add(tl);
		window.add(exit);

		window.setTitle("Login window");
		window.setSize(500, 300);
		window.setLocation(250, 100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		username.setFont(new Font("Arial", Font.PLAIN, 14));
		password.setFont(new Font("Arial", Font.PLAIN, 14));
		signup.setFont(new Font("Arial", Font.BOLD, 13));
		login.setFont(new Font("Arial", Font.BOLD, 13));
		exit.setFont(new Font("Arial", Font.BOLD, 13));

		signup.addActionListener(this);
		login.addActionListener(this);
		exit.addActionListener(this);
		tl.addActionListener(this);

		window.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exit) {
			window.dispose();
		}

		else if (e.getSource() == signup) {
			Signup s = new Signup();
			s.initGui();
			window.dispose();
		}

		else if (e.getSource() == login) {
			String usernamecurr = usernametxt.getText();
			String passwordcurr = new String(passwordtxt.getPassword());
			// System.out.println("username "+usernamecurr+ "\npassword "+passwordcurr);

			// Signup s = new Signup();
			// s.initGui();
			if (usernamecurr.equals("") || passwordcurr.equals("")) {
				JOptionPane.showMessageDialog(null, "Please insert Username and Password");
			}

			File file = new File(".\\userPass.txt");
			try {
				Scanner input = new Scanner(file);
				while (input.hasNext()) {
					// String name = input.next();
					String user = input.nextLine();
					String pass = input.nextLine();

					// System.out.println(user+ "\n " +pass);

					if (usernamecurr.equals(user) && passwordcurr.equals(pass)) {
						window.dispose();
						welcomeWindow w = new welcomeWindow();
						w.initGui(usernamecurr);
					}
					/*
					 * else if(usernamecurr.equals("") && passwordcurr.equals("")){
					 * JOptionPane.showMessageDialog(null,"Please insert Username and Password"); }
					 * 
					 * else if(!usernamecurr.equals(user) && !passwordcurr.equals(pass)){
					 * 
					 * JOptionPane.showMessageDialog(null,"Wrong Username / Password"); }
					 */
				}

				input.close();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (e.getSource() == tl) {
			window.dispose();
			AdminLogin a = new AdminLogin();
			a.initGui();

		}

	}
}
