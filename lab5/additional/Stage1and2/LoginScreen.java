import java.awt.*;
import javax.swing.*;

public class LoginScreen extends JFrame{
	public LoginScreen(){
		
	}
		
	public static void main(String[] args) {
		LoginScreen frame = new LoginScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("");
		frame.setSize(450, 350);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
