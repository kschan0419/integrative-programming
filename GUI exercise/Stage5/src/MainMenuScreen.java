import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenuScreen extends JFrame  implements ActionListener{
	LoginScreen loginScreen;
	Student student;
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JPanel pane4 = new JPanel();
	JPanel pane5 = new JPanel();
	JPanel pane6 = new JPanel();
	JPanel pane7 = new JPanel();
	JButton enter = new JButton("Enter");
	JButton logout = new JButton("Logout");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JRadioButton rb1 = new JRadioButton("View registered course(s)");
	JRadioButton rb2 = new JRadioButton("Add course");
	JRadioButton rb3 = new JRadioButton("Drop course");
	ButtonGroup grp = new ButtonGroup();
	
	public MainMenuScreen(Student stu, LoginScreen prev) {
		student = stu;
		loginScreen = prev;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("UKM Course Registration System");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		pane.add(pane1, BorderLayout.CENTER);
		pane1.setLayout(new GridLayout(6,1));
		pane1.add(pane3);
		pane1.add(pane4);
		pane3.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		pane3.add(new JLabel("Name: "));
		pane3.add(text1);
		text1.setColumns(16);
		text1.setText(student.getName());
		text1.setEditable(false);
		pane4.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		pane4.add(new JLabel("Matric number: "));
		pane4.add(text2);
		text2.setColumns(11);
		text2.setText(student.getMatricNum());
		text2.setEditable(false);
		
		pane1.add(new JLabel("============================================================================",JLabel.CENTER));
		
		pane1.add(pane5);
		pane1.add(pane6);
		pane1.add(pane7);
		pane5.setLayout(new GridLayout(1,3));
		pane5.add(new JLabel(""));
		pane5.add(rb1);
		pane5.add(new JLabel(""));
		pane6.setLayout(new GridLayout(1,3));
		pane6.add(new JLabel(""));
		pane6.add(rb2);
		pane6.add(new JLabel(""));
		pane7.setLayout(new GridLayout(1,3));
		pane7.add(new JLabel(""));
		pane7.add(rb3);
		pane7.add(new JLabel(""));
		grp.add(rb1);
		grp.add(rb2);
		grp.add(rb3);
		
		pane.add(pane2, BorderLayout.SOUTH);
		pane2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pane2.add(enter);
		pane2.add(logout);
		enter.addActionListener(this);
		logout.addActionListener(this);
		
		//pane.add(new JLabel("Welcome "+student.getName()), BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e){
		Object o = e.getSource();
		if(o == logout){
			this.setVisible(false);
			loginScreen.setVisible(true);
		}
		else{
			if(rb1.isSelected()){
				this.setVisible(false);
				new ViewCourseScreen(student, this);
			}
			else if(rb2.isSelected()){
				this.setVisible(false);
				new AddCourseScreen(student, this);
			}
			else if(rb3.isSelected()){
				this.setVisible(false);
				new DropCourseScreen(student, this);
			}
		}
	}
	
}
