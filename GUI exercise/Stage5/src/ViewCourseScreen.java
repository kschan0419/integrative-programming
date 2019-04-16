import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class ViewCourseScreen extends JFrame {
	private MainMenuScreen mainScreen;
	private Student student;
	
	private JButton backBtn = new JButton("Back");
	
	public ViewCourseScreen(Student stu, MainMenuScreen prev) {
		student = stu;
		mainScreen = prev;
		
		// Hardcoded for demonstration purposes!
		student.registerCourse(new Course("TK1114", "Programming 1", 4));
		student.registerCourse(new Course("TK1123", "Programming 2", 3));
		student.registerCourse(new Course("TK2933", "Object-Oriented Programming", 3));
		//
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("UKM Course Registration System");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Register course(s): "+student.getName()+" ("+student.getMatricNum()+")"));
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("==================================="));
		
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(2, 1));
		pNorth.add(p1);
		pNorth.add(p2);
		
		ArrayList<Course> list = student.getAllRegisteredCourses(); 
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(list.size()+1,1));
		
		for (int i=0; i<list.size(); i++) {
			Course course = list.get(i);			
			String courseDetails = (i+1)+". "+course.getCourseCode() +" "+course.getCourseName();
			JLabel courseLbl = new JLabel(courseDetails);
			
			pCenter.add(courseLbl);
		}
		
		JTextField totalHour = new JTextField(5);
		totalHour.setEditable(false);
		totalHour.setText("" + student.getTotalCreditHours());
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("Total credit hours:"));
		p3.add(totalHour);
		
		pCenter.add(p3);
		
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pSouth.add(backBtn);
		
		pane.add(pNorth, BorderLayout.NORTH);
		pane.add(pCenter, BorderLayout.CENTER);
		pane.add(pSouth, BorderLayout.SOUTH);		
	}
}