import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Screen1 extends JFrame implements ActionListener {
	private JButton btn = new JButton("Go to Screen 2");
	
	public Screen1() {		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("This is screen 1 "));
		pane.add(btn);
		
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false); // make this frame disappears
		new Screen2(this); // make next (new) frame appears, and pass object of this frame to next frame
	}
	
	public static void main(String[] args) {
		Screen1 frame = new Screen1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Screen 1");
		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
