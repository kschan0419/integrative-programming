import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
	public Screen() {		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		String fileName = "img/welcome.png";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		
		pane.add(image);
		pane.add(new JLabel("to JAVA GUI world!"));
	}
	
	public static void main(String[] args) {
		Screen frame = new Screen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Screen");
		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
