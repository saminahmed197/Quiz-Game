package Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Quiz_Game.Questions;

public class CounterTimerGUI  {

	private JFrame frame;
	private JPanel panel;

	private JLabel timeLabel = new JLabel();

	
	private CountTimer cntd;

	 public CounterTimerGUI() {
	        setTimerText("         ");
	        GUI();
	    }
	public void GUI() {
		frame = new JFrame();
		panel = new JPanel();

		panel.setLayout(new BorderLayout());
		timeLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		panel.add(timeLabel, BorderLayout.NORTH);

		JPanel cmdPanel = new JPanel();
		cmdPanel.setLayout(null);

		

		panel.add(cmdPanel, BorderLayout.SOUTH);

		
		
		

		frame.setContentPane(panel);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

		cntd = new CountTimer();
		cntd.start();
		

	}

	
	private void setTimerText(String sTime) {
		timeLabel.setText(sTime);
	}

	
	private class CountTimer implements ActionListener {

		private static final int ONE_SECOND = 100;
		private static final int FIVE_SECOND = 0;
		private int count = 0;
		private boolean isTimerActive = false;
		private Timer tmr = new Timer(ONE_SECOND, this);
		private Timer tm = new Timer(FIVE_SECOND, this);

		public CountTimer() {
			count = 0;
			setTimerText(TimeFormat(count));
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (isTimerActive) {
				count--;
				setTimerText(TimeFormat(count));
				if(count==0)
				{
					count=0;
					tmr.stop();
					
					setTimerText(TimeFormat(count));
					frame.dispose();
					//JOptionPane.showMessageDialog(null, "Sorry,Timed out");
							
					 Questions q=new Questions();
						q.initGui();
					    
					 stuLogout s = new stuLogout();
			    	 s.initGui(count); 
				}
				//setTimerText(TimeFormat(count));		
				
			}
		}

		public void start() {
			count = 100;
			isTimerActive = true;
			tmr.start();
		}
	

	}

	private String TimeFormat(int count) {

		int hours = count / 3600;
		int minutes = (count - hours * 3600) / 60;
		int seconds = count - minutes * 60;
		return String.format("%02d", hours) + " : " + String.format("%02d", minutes) + " : "
				+ String.format("%02d", seconds);
}
	}