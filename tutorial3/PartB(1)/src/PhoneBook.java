import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PhoneBook extends JFrame implements ActionListener {
private JPanel pane2 = new JPanel();	
private JPanel pane3 = new JPanel();
private JPanel pane4 = new JPanel();
private JTextField matric = new JTextField();
private JTextField name = new JTextField();
private JTextField phone = new JTextField();
private JTextField email = new JTextField();
private JTextField program = new JTextField();
private JButton save = new JButton("Save");
private JButton clear = new JButton("Clear");
private JTextArea textarea = new JTextArea();

	public PhoneBook() {
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(new JLabel("Phone Book Application", JLabel.CENTER),(BorderLayout.NORTH));
		
		pane.add(pane2,(BorderLayout.CENTER));
		pane2.setLayout(new GridLayout(1,2));
		pane2.add(pane3);
		
		pane3.setLayout(new GridLayout(6,2,10,10));
		pane3.add(new JLabel("Matric Number :"));
		pane3.add(matric);
		pane3.add(new JLabel("Name :"));
		pane3.add(name);
		pane3.add(new JLabel("Mobile Phone :"));
		pane3.add(phone);
		pane3.add(new JLabel("Email :"));
		pane3.add(email);
		pane3.add(new JLabel("Program :"));
		pane3.add(program);
		pane3.add(save);
		save.addActionListener(this); 
		pane3.add(clear);
		clear.addActionListener(this); 
		
		pane2.add(pane4);
		pane4.setLayout(new BorderLayout());
		pane4.add(new JLabel("User Information", JLabel.CENTER),(BorderLayout.NORTH));
		pane4.add(textarea,(BorderLayout.CENTER));
		
	}
	
	public void actionPerformed(ActionEvent e){ 
		Object obj = e.getSource();
		String string [] = {matric.getText(), name.getText(),phone.getText(),email.getText(),program.getText()};

		if (obj == save){
			int test = 0;
			for (int i=0; i<5; i++){
				if(string[i].equals("")){ 
					test ++;
				}
			}
			if(test==0){
			//if(!matric.getText().equals("")&&!name.getText().equals("")&&!phone.getText().equals("")&&!email.getText().equals("")&&!program.getText().equals("")){
			// take note be careful don't use " or " " || "
			// take note print as String not JTextfield 
				textarea.append("Matric Number : "+string[0]+"\n\n");
				textarea.append("Name          : "+string[1]+"\n\n");
				textarea.append("Mobile Phone  : "+string[2]+"\n\n");
				textarea.append("Email         : "+string[3]+"\n\n");
				textarea.append("Program       : "+string[4]+"\n\n");
			}
			else {
				JOptionPane.showMessageDialog(this,"Please enter all infomations.", "Warning", JOptionPane.ERROR_MESSAGE);
			}
		}
		else if (obj == clear){
			textarea.setText(null);
			matric.setText(null);
			name.setText(null);
			phone.setText(null);
			email.setText(null);
			program.setText(null);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook frame = new PhoneBook();
		frame.setTitle("PhoneBook");
		frame.setVisible(true);
		frame.setSize(600, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
