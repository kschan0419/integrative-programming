
import java.awt.*;
import javax.swing.*;

public class Screen2 extends JFrame {
	public Screen2() {
		// Notice that Screen 2 does not have main method, 
		// because program execution does not start from this class!
		
		// Set the setting of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Screen");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("This is screen 2"));
	}
}
