import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Screen2 extends JFrame implements ActionListener {
	private Screen1 prev;
	
	private JButton btn = new JButton("Back to Screen 1");
	
	public Screen2(Screen1 p) {
		prev = p;
		
		// Notice that Screen 2 does not have main method, 
		// because program execution does not start from this class!
		
		// Set the setting of the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Screen 2");
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("This is screen 2 "));
		pane.add(btn);
		
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false); // make this frame disappears
		prev.setVisible(true);; // make previous frame appears
	}
}
