import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginScreen extends JFrame implements ActionListener{
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JTextField text1 = new JTextField();
	JButton enter = new JButton("Enter");
	StudentRegister register = new StudentRegister();
	
	public LoginScreen(){
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		
		String fileName = "system.jpeg";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		pane.add(image);
		
		pane.add(pane1);
		pane1.add(pane2);
		pane2.setLayout(new GridLayout(2,2,10,0));
		pane2.add(new JLabel("Matric number: "));
		pane2.add(text1);
		text1.addActionListener(this);
		pane2.add(new JLabel(""));
		pane2.add(enter);
		enter.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		String matric = text1.getText();

		if (o == enter) {
			if (register.isRegisteredStudent(matric)) {
				this.setVisible(false); // make this frame disappears
				new MainMenuScreen(register.getStudent(matric),this); // make next (new) frame appears
			}
			else
				JOptionPane.showMessageDialog(this, "Invalid matric number"  ,"Error", JOptionPane.ERROR_MESSAGE);
		} 
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
