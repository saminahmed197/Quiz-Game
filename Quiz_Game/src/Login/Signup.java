package Login;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import Quiz_Game.welcomeWindow;


public class Signup implements ActionListener{
	JFrame window = new JFrame();
	
	JLabel firstName = new JLabel("First name:");
	JLabel lastName = new JLabel("Last name:");
	JLabel newusername = new JLabel("New Username:");
	JLabel newpassword = new JLabel("New Password:");
	JLabel empty = new JLabel();
	JLabel empty1 = new JLabel();
	JButton back = new JButton("back");
	//JLabel phoneNo = new JLabel("Phone number:");
	//JLabel joinAs = new JLabel("Join as:");
	//JLabel empty = new JLabel();
	
	JTextField firstNametxt = new JTextField();
	JTextField lastNametxt = new JTextField();
	JTextField newusernametxt = new JTextField();
	JPasswordField newpasswordtxt = new JPasswordField();
	//JTextField phoneNotxt = new JTextField();
	
	//String[] joinTypes = {"Student" , "Teacher"};
	//JComboBox joincombo = new JComboBox(joinTypes);
	
	JButton creatAcc = new JButton("Create my Account");
	//JButton showinfo = new JButton("Show Details");
	
	public void initGui() {
		GridLayout gl = new GridLayout(6,2,2,2);
		window.setLayout(gl);
		
		window.add(firstName);
		window.add(firstNametxt);
		window.add(lastName);
		window.add(lastNametxt);
		//window.add(phoneNo);
		//window.add(phoneNotxt);
		////window.add(joinAs);
		//window.add(joincombo);
		window.add(newusername);
		window.add(newusernametxt);
		window.add(newpassword);
		window.add(newpasswordtxt);
		window.add(empty);
		window.add(empty1);
		window.add(back);
		//window.add(showinfo);
		window.add(creatAcc);
		
		
		window.setTitle("sign up window");
		window.setSize(600, 400);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newusername.setFont(new Font("Arial",Font.PLAIN, 14));
		newpassword.setFont(new Font("Arial",Font.PLAIN, 14));
		firstName.setFont(new Font("Arial",Font.PLAIN, 14));
		lastName.setFont(new Font("Arial",Font.PLAIN, 14));
		creatAcc.setFont(new Font("Arial",Font.BOLD, 13));
		back.setFont(new Font("Arial",Font.BOLD, 13));
		
		creatAcc.addActionListener(this);
		back.addActionListener(this);
		
		window.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			Login qm = new Login();
			qm.initGui();
			window.dispose();
		
		}
		else if(e.getSource()== creatAcc) {
			String firstnamecurr = firstNametxt.getText();
			String lastnamecurr = lastNametxt.getText();
			//int phoneNocurr = Integer.valueOf(phoneNo.getText());
			//String combocurr = joincombo.getSelectedItem().toString();
			String usernamecurr1 = newusernametxt.getText();
			String passwordcurr1 = new String (newpasswordtxt.getPassword());
			
//			System.out.println(firstnamecurr + " " +
//								lastnamecurr + " " +
//								combocurr + " " +
//								usernamecurr + " " +
			//if(firstnamecurr.equals(firstNametxt) && lastnamecurr.equals(lastNametxt) && usernamecurr.equals(newusernametxt) && passwordcurr.equals(newpasswordtxt)) {
	            //JOptionPane.showMessageDialog(null,"account has been successfully created");
			
			
			File file = new File(".\\signup.txt");
			try {
			FileWriter output = new FileWriter(file,true);
				output.write(firstnamecurr+"\n");
				output.write(lastnamecurr+"\n");
				//output.write("phone no:"+phoneNocurr);
				//output.write(combocurr+"\n");
				output.write(usernamecurr1+"\n");
				output.write(passwordcurr1+"\n");

			
			output.close();
			 JOptionPane.showMessageDialog(null,"account has been successfully created");
			welcomeWindow we = new welcomeWindow();
			we.initGui(firstnamecurr);
			window.dispose();
		}
				
			//else if(firstnamecurr.equals("") || lastnamecurr.equals("") || usernamecurr.equals("") || passwordcurr.equals(""))
				//JOptionPane.showMessageDialog(null,"Please fillup fields");
		
			
			catch(Exception ex) {
			ex.printStackTrace();
			
			}
			
		
		File f = new File(".\\userPass.txt");
		try {
		FileWriter output = new FileWriter(f,true);
			output.write(usernamecurr1+ "\n");
			output.write(passwordcurr1+ "\n");

		
		output.close();
		window.dispose();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
			}
		}
		
		/*else if(e.getSource() == showinfo) {
			Student[] students = new Student[10];
			int count = 0;
			
			File file = new File("D:\\PROJECT(JAVA)\\src\\Login\\info.txt");
			try {
				Scanner input = new Scanner(file);
				while(input.hasNext()) {
					String Name = input.next();
					int mark = input.nextInt();
					
					//String name = fName + " " + lName;
					Student s = new Student(Name,mark);
					
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
		}*/
		
	}

}