import java.awt.*;

import javax.swing.*;

public class DropCourseScreen extends JFrame {
	private MainMenuScreen mainScreen;
	private Student student;
	
	public DropCourseScreen(Student stu, MainMenuScreen prev) {
		student = stu;
		mainScreen = prev;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("UKM Course Registration System");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("Sorry "+student.getName()+", this Drop Course feature is still under construction"));
	}
}

