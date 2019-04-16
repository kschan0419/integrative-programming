import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Screen1 extends JFrame implements ActionListener {
	public JTextField txt = new JTextField(10);
	private JButton btn = new JButton("Enter");
	
	public Screen1() {		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("Enter letter 'A'"));
		pane.add(txt);
		pane.add(btn);
		
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String input = txt.getText();
		
		if (input.equals("A")) {
			this.setVisible(false); // make this frame disappears
			new Screen2(); // make next (new) frame appears
		}
		
		else
			JOptionPane.showMessageDialog(this, "You MUST enter letter A"  ,"Error", JOptionPane.ERROR_MESSAGE);
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
