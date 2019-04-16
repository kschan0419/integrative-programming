import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Melati extends JFrame implements ItemListener {
JPanel pane1 = new JPanel();
JPanel pane2 = new JPanel();
JPanel pane3 = new JPanel();
JPanel pane4 = new JPanel();
JPanel pane5 = new JPanel();
JCheckBox box1 = new JCheckBox("Pa & Ma- (RM99.20)");
JCheckBox box2 = new JCheckBox("RASA- (RM104.40)");
JCheckBox box3 = new JCheckBox("Nona- (RM137.40)");
JCheckBox box4 = new JCheckBox("Apartment Impiana- (RM66.80)");
JCheckBox box5 = new JCheckBox("Dapur Impiana- (RM72.50)");
JCheckBox box6 = new JCheckBox("Laman Impiana- (RM66.80)");
ButtonGroup grp = new ButtonGroup();
JRadioButton rb1 = new JRadioButton("Member ");
JRadioButton rb2 = new JRadioButton("Non-member ");
JLabel label1 = new JLabel("Total of subscription : 0",JLabel.CENTER);
JLabel label2 = new JLabel("Total Payment RM : 0",JLabel.CENTER);
	
	public Melati(){
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(new JLabel("##### 1 YEAR MAGAZINE SUBSCRIPTION #####", JLabel.CENTER),(BorderLayout.NORTH));
		
		pane.add(pane1,(BorderLayout.CENTER));
		pane1.setLayout(new GridLayout(2,1));
		
		pane1.add(pane2);
		pane2.setLayout(new GridLayout(4,2));
		
		pane2.add(new JLabel(" FAMILY "));
		pane2.add(new JLabel(" DECORATION "));
		pane2.add(box1);
		box1.addItemListener(this);
		pane2.add(box4);
		box4.addItemListener(this);
		pane2.add(box2);
		box2.addItemListener(this);
		pane2.add(box5);
		box5.addItemListener(this);
		pane2.add(box3);
		box3.addItemListener(this);
		pane2.add(box6);
		box6.addItemListener(this);

		pane1.add(pane3);
		pane3.setLayout(new GridLayout(2,1));
		pane3.add(pane4);
		pane4.add(new JLabel("Enjoy 15% Discount: "));
		pane4.add(rb1);
		rb1.addItemListener(this);
		pane4.add(rb2);
		rb2.addItemListener(this);
		grp.add(rb1);
		grp.add(rb2);
		
		pane3.add(pane5);
		pane5.setLayout(new GridLayout(3,1));
		pane5.add(new JLabel("*************************************",SwingConstants.CENTER));
		pane5.add(label1);
		pane5.add(label2);
	}
	
	public void itemStateChanged(ItemEvent evt){
		int number = 0;
		double amount = 0;
		
		if (box1.isSelected()){
			amount += 99.2;
			number ++;
			
		}
		if (box2.isSelected()){
			amount += 104.4;
			number ++;
		}
		if (box3.isSelected()){
			amount += 137.4;
			number ++;
		}
		if (box4.isSelected()){
			amount += 66.8;
			number ++;
		}
		if (box5.isSelected()){
			amount += 72.5;
			number ++;
		}
		if (box6.isSelected()){
			amount += 66.8;
			number ++;
		}
		int check = 0;
		if (rb1.isSelected()){
			amount = amount*85/100;
			check=1;
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		label1.setText("Total of subscription : "+number);
		if(check==1){
			label2.setText("Total Payment RM : "+df.format(amount)+" (Member)");
		}
		else{
			label2.setText("Total Payment RM : "+df.format(amount));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Melati frame = new Melati();
		frame.setTitle("Subscribe now and enjoy your reading");
		frame.setVisible(true);
		frame.setSize(600, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		
	}

}