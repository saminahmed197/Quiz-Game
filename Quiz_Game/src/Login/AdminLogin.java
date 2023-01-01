package Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminLogin implements ActionListener {
	JFrame window = new JFrame();
	JLabel name = new JLabel("Name:");
	JLabel id = new JLabel("ID:");
	JLabel empty = new JLabel();
	JLabel empty1 = new JLabel();
	//JLabel empty2 = new JLabel();
	JTextField nametxt  = new JTextField();
	JTextField idtxt = new JTextField();
	JButton login = new JButton("Login");
	JButton back = new JButton("back");
	public void initGui() {
		GridLayout gl = new GridLayout(4,2,2,2);
		window.setLayout(gl);
		
		window.add(name);
		window.add(nametxt);
		window.add(id);
		window.add(idtxt);
		window.add(empty1);
		window.add(empty);
		//window.add(empty2);
		window.add(back);
		window.add(login);
		
		
		window.setTitle("Admin window");
		window.setSize(500, 300);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		name.setFont(new Font("Arial",Font.PLAIN, 14));
		id.setFont(new Font("Arial",Font.PLAIN, 14));
		login.setFont(new Font("Arial",Font.BOLD, 13));
		back.setFont(new Font("Arial",Font.BOLD, 13));
		
		login.addActionListener(this);
		back.addActionListener(this);
		
		window.setVisible(true);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			Login l = new Login();
			l.initGui();
			
			window.dispose();
		
		}
	    else if(e.getSource() == login ) {
				// String namecurr = nametxt.getText();
				// String idcurr = idtxt.getText();
				// if(namecurr=="sujit" && idcurr=="sujit123") {
					// InfoDetails i= new InfoDetails();
					// i.initGUI();
				// }
				 if((nametxt.getText().equalsIgnoreCase("samin") && idtxt.getText().equalsIgnoreCase("samin123") )
						 || (nametxt.getText().equalsIgnoreCase("prity") && idtxt.getText().equalsIgnoreCase("prity123") )){
					 QuesMark v = new QuesMark();
						v.initGui();
						window.dispose();
				/* Student[] students = new Student[100];
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
					}*/
				 }
				
				}
	}
}
		