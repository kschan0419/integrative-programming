import java.awt.*;
import javax.swing.*;

public class MainMenuScreen extends JFrame {
	LoginScreen loginScreen;
	Student student;
	
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
		
		pane.add(new JLabel("Welcome "+student.getName()), BorderLayout.NORTH);
	}
}
