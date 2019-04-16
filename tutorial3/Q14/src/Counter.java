import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Counter extends JFrame implements ActionListener {
	private JButton btnMultiply;
	private JButton btnDevide;
	private JButton btnReset;
	private JTextField tdisplay;
	private int value = 2;
	
	public Counter() {
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(2,1));
		
		tdisplay = new JTextField(""+value);
		pane.add(tdisplay);
		
		//JComboBox <String> sidedish = new JComboBox <String>();
		//sidedish.addItem("Fries");
		//pane.add(sidedish);
		//sidedish.addItem("Salad");
		//sidedish.addItem("Fruit");     //Q10
		
		//JLabel label = new JLabel("Label");
		//pane.add(label);
		
		//JCheckBox feeWaived = new JCheckBox("Fee Waived");
		//pane.add(feeWaived);     //Q11
		
		JPanel panel1 = new JPanel();
		pane.add(panel1);
		
		panel1.setLayout(new GridLayout(1,3));
		btnMultiply = new JButton("Multiply");
		btnDevide = new JButton("Devide");
		btnReset = new JButton("Reset");
		panel1.add(btnMultiply);
		panel1.add(btnDevide);
		panel1.add(btnReset);
		
		btnMultiply.addActionListener(this);
		btnDevide.addActionListener(this);
		btnReset.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if (obj == btnMultiply){
			value *= 4;
			tdisplay.setText(""+value);
		}
		else if (obj == btnDevide){
			value /= 2;
			tdisplay.setText(""+value);
		}
		else {
			value = 2;
			tdisplay.setText(""+value);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter frame = new Counter();
		frame.setTitle("Counter");
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		
	}

}
