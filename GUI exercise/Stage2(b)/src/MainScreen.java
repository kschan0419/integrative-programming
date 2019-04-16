import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainScreen extends JFrame{
	
	String fileName = "add2cart.jpg";
	ImageIcon icon = new ImageIcon(fileName);
	JLabel image = new JLabel(icon);
	
	String fileName1 = "viewcart.jpg";
	ImageIcon icon1 = new ImageIcon(fileName1);
	JLabel image1 = new JLabel(icon1);
	
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JPanel pane4 = new JPanel();
	JPanel pane5 = new JPanel();
	JPanel pane6 = new JPanel();
	JPanel pane7 = new JPanel();
	JPanel pane8 = new JPanel();
	JPanel pane9 = new JPanel();
	JButton reset = new JButton("Reset");
	JButton buy1 = new JButton(icon);
	JButton buy2 = new JButton(icon);
	JButton view = new JButton(icon1);
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	
	
	
	public MainScreen(){
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		pane.add(pane1,BorderLayout.CENTER);
		pane1.setLayout(new GridLayout(3,1));
		pane1.add(pane2);
		pane2.setLayout(new BorderLayout());
		String fileName = "logo.jpg";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		pane2.add(image,BorderLayout.CENTER);
		pane2.add(new JLabel("=============================================================================",JLabel.CENTER), BorderLayout.SOUTH);
		
		pane1.add(pane3);
		pane3.setLayout(new GridLayout(1,4));
		String fileName2 = "shirt.jpeg";
		ImageIcon icon2 = new ImageIcon(fileName2);
		JLabel image2 = new JLabel(icon2);
		pane3.add(image2);
		pane4.setLayout(new GridLayout(4,1));
		pane4.add(new JLabel("Item name:"));
		pane4.add(new JLabel("Item ID:"));
		pane4.add(new JLabel("Item price:"));
		pane4.add(new JLabel("Unit to buy:"));
		pane5.setLayout(new GridLayout(4,1));
		pane5.add(new JLabel("Men shirt"));
		pane5.add(new JLabel("P1011"));
		pane5.add(new JLabel("RM59.90"));
		pane5.add(text1);
		pane3.add(pane4);
		pane3.add(pane5);
		pane3.add(buy1);
		
		pane1.add(pane6);
		pane6.setLayout(new GridLayout(1,4));
		String fileName3 = "pants.jpeg";
		ImageIcon icon3 = new ImageIcon(fileName3);
		JLabel image3 = new JLabel(icon3);
		pane6.add(image3);
		pane7.setLayout(new GridLayout(4,1));
		pane7.add(new JLabel("Item name:"));
		pane7.add(new JLabel("Item ID:"));
		pane7.add(new JLabel("Item price:"));
		pane7.add(new JLabel("Unit to buy:"));
		pane8.setLayout(new GridLayout(4,1));
		pane8.add(new JLabel("Men shirt"));
		pane8.add(new JLabel("P1011"));
		pane8.add(new JLabel("RM59.90"));
		pane8.add(text2);
		pane6.add(pane7);
		pane6.add(pane8);
		pane6.add(buy2);
		

		
		pane.add(pane9,BorderLayout.SOUTH);
		pane9.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pane9.add(reset);
		pane9.add(view);
		
	}
		
	public static void main(String[] args) {
		MainScreen frame = new MainScreen();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Maju Jaya Online Store");
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
