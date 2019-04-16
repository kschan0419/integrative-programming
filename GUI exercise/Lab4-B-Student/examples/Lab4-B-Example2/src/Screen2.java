import java.awt.*;
import javax.swing.*;

public class Screen2 extends JFrame {
	public Screen2(Person person) {
		// Notice that Screen 2 does not have main method, 
		// because program execution does not start from this class!
		
		// Set the setting of the frame
		setTitle("Screen 2");
		setSize(600, 300);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("Hi "+person.getName()+"!"));
	}
}
