import java.awt.*;
import javax.swing.*;

public class LoginScreen extends JFrame{
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JRadioButton rb1 = new JRadioButton("Passport");
	JRadioButton rb2 = new JRadioButton("E-Ticket Number");
	JRadioButton rb3 = new JRadioButton("Booking Reference");
	ButtonGroup grp = new ButtonGroup();
	JButton button = new JButton("Enter");
	
	public LoginScreen(){
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		
		String fileName = "checkin.png";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		pane.add(image);
		
		pane.add(pane1);
		pane1.setLayout(new GridLayout(3,1));
		pane1.add(new JLabel("To begin your check in, please select your preffered method",SwingConstants.CENTER));
		
		pane1.add(pane2);
		pane2.add(rb1);
		pane2.add(rb2);
		pane2.add(rb3);
		grp.add(rb1);
		grp.add(rb2);
		grp.add(rb3);
		
		pane1.add(pane3);
		pane3.add(button);
	}
		
	public static void main(String[] args) {
		LoginScreen frame = new LoginScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Flight Check-In System");
		frame.setSize(450, 350);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
