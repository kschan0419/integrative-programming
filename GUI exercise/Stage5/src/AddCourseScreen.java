import java.awt.*;

import javax.swing.*;

public class AddCourseScreen extends JFrame {
	private MainMenuScreen mainScreen;
	private Student student;
	
	public AddCourseScreen(Student stu, MainMenuScreen prev) {
		student = stu;
		mainScreen = prev;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("UKM Course Registration System");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("Sorry "+student.getName()+", this Add Course feature is still under construction"));
	}
}
