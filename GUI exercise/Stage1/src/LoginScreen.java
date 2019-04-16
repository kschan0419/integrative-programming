import javax.swing.JFrame;

public class LoginScreen extends JFrame{
	
	public LoginScreen(){
		
	}
		
	public static void main(String[] args) {
		LoginScreen frame = new LoginScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("UKM Course Registration System");
		frame.setSize(600, 350);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
