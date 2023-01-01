package Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InfoDetails implements ActionListener{
	JFrame window = new JFrame();
	JLabel hMark = new JLabel();
	//JButton logout = new JButton("Logout");
	JButton back = new JButton("back");
	
	public void initGUI(User[] students, int size) {
		GridLayout gl = new GridLayout(2,1,0,0);
		window.setLayout(gl);
		Object[][] data = new Object[size][4];
		//int[][] data1 = new int[size][4];
		
		for(int i=0; i<size; i++) {
			data[i][0] = students[i].getName();
			data[i][1] = students[i].getMark();
			data[i][2]= students[i].maxMark(students, size);
		}
		String col[] = {"Name", "Mark","Highest Mark"};
		JTable t = new JTable(data,col);
		window.setTitle("User's Information");
	        t.setBounds(100, 100, 200, 300);
	        //logout.setBounds(100,240,100,30);
	        
	        JScrollPane sp = new JScrollPane(t); 
	        window.add(sp); 
	      // window.add(logout);
			window.add(back);
	        window.setSize(800, 500);
	        window.setLocation(250,100);
	        window.setVisible(true);

			//logout.addActionListener(this);
			back.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource()==logout) {
		    Login l = new Login();
			l.initGui();
			window.dispose();
		
		}
		else*/ if(e.getSource()==back) {
			QuesMark qm = new QuesMark();
			qm.initGui();
			window.dispose();
		
		}

	}
	
	/*File file = new File("D:\\PROJECT(JAVA)\\src\\Login\\info.txt");
	try {
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			//String name = input.next();
			String user = input.nextLine();
			String pass = input.nextLine();
		

		}
	input.close();
	}
	catch(Exception excp) {
		excp.printStackTrace();
		
		}
	
	/*JFrame window = new JFrame();
	
	public void initGUI(Student[] students, int size) {
		int data[][] = new String[size][4];
		
		for(int i=0; i<size; i++) {
			data[i][0] = students[i].getfName();
			data[i][1] = students[i].getlName();
			data[i][2] = students[i].getMark();
			
		}
		
		String col[] = {"fName", "lName", "mark"};
		JTable jt = new JTable(data, col);
		
		window.add(jt);
		window.setTitle("details window");
		window.setSize(600, 400);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
	}*/
}

