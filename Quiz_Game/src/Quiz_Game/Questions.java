package Quiz_Game;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import Login.CounterTimerGUI;
import Login.stuLogout;



public class Questions implements ActionListener{

	
	int count=0, quesNo=0;
	int q[] = new int[9];
	
	JFrame window = new JFrame();
	JButton next = new JButton("Next"); 
	JButton result = new JButton();
	JLabel l = new JLabel();
	ButtonGroup bg= new ButtonGroup();
	private JLabel timeLabel = new JLabel();
	JRadioButton opt[] = new JRadioButton[4];
	//JRadioButton j = new JRadioButton();                                 
	private JPanel panel;  
public void initGui() {
		
		window.add(l);
		for(int i = 0;i<4;i++) {
			opt[i]=new JRadioButton();
			
			window.add(opt[i]);
			bg.add(opt[i]);
		}
		GridLayout gl = new GridLayout(7,1,2,2);
		window.setLayout(gl);
		window.setTitle("Quiz");
		window.add(next);
		window.add(result);
		//window.add(j);
		questionset();
	
		window.setSize(600,350);
		window.setLocation(250,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		next.addActionListener(this);
		result.addActionListener(this);

		
	
		window.setVisible(true);

	
}
	public void actionPerformed(ActionEvent e) {

        if(e.getSource()==next)  
        {  
            if(check())  
                count=count+1;  
            quesNo++;  
            
            questionset(); 
            
            }
        if(quesNo==4)  
        {  
            next.setEnabled(false);  
            result.setText("Result"); 
            
        }  
        if(e.getSource()==result)  
        {  
            if(check())  
                count=count+1; 
           		
				
			
            File f = new File(".\\info.txt");
    		try {
    		FileWriter output = new FileWriter(f,true);
    			output.write(" "+count+ "\n");

    		
    		output.close();
    		
    		}
    		catch(Exception exc) {
    			exc.printStackTrace();
    			
    			}
           // quesNo++;  
            //System.out.println("correct ans="+count);  
           // JOptionPane.showMessageDialog(null,"correct ans="+count); 
    		
            window.dispose();
            
           
            stuLogout s = new stuLogout();
    		s.initGui(count);
            
        }
		
	}
	void questionset() {
		 if(quesNo==0)  
	        {  
	            l.setText("  Que1: what is a mango?");  
	            opt[0].setText("bird");opt[1].setText("fruit");opt[2].setText("book");opt[3].setText("insect");   
	        }  
	        if(quesNo==1)  
	        {  
	            l.setText("  Que2: name of our country?");  
	            opt[0].setText("india");opt[1].setText("japan");opt[2].setText("bangladesh");opt[3].setText("australia");  
	        } 
	        if(quesNo==2)  
	        {  
	            l.setText("  Que3: java supports multiple inheritance through");  
	            opt[0].setText("interface");opt[1].setText("class");opt[2].setText("variable");opt[3].setText("file");  
	        }
	        if(quesNo==3)  
	        {  
	            l.setText("  Que4: Which one among these is not a primitive datatype?");  
	            opt[0].setText("double");opt[1].setText("boolean");opt[2].setText("int");opt[3].setText("String");  
	        }
	        if(quesNo==4)  
	        {  
	            l.setText("  Que5: Capital of bangladesh?");  
	            opt[0].setText("pabna");opt[1].setText("khulna");opt[2].setText("ctg");opt[3].setText("Dhaka");  
	        }
	       
	      
	}
	boolean check() {
		 if(quesNo==0)  
	            return(opt[1].isSelected());  
	        if(quesNo==1)  
	            return(opt[2].isSelected()); 
	        if(quesNo==2)  
	            return(opt[0].isSelected()); 
	        if(quesNo==3)  
	            return(opt[3].isSelected()); 
	        if(quesNo==4)  
	            return(opt[3].isSelected()); 
	        return false;
	}

	
}

