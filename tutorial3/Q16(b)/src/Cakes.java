import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

//import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cakes extends JFrame implements ActionListener {
	JComboBox <String> list;
	JTextField jtf;
	JLabel label1;
	String cakeList[] = {"Blueberry Cheese","Carrot Cheese", "Tiramisu", "Rainbow", "Apple Crumble","Caramel", "Red Velvet"};
	
	public Cakes (){
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		JPanel jp = new JPanel(new FlowLayout());
		list = new JComboBox <String> (cakeList);
		label1 = new JLabel(" Selected Cake >>> ");
		// list.setSelectionMode(ItemSelected.SINGLE_SELECTION);
		jtf = new JTextField(10);
		list.addActionListener(this);
		list.setEditable(false); 
		jtf.setEditable(false); // Q16(c)
		jp.add(list);
		jp.add(label1);
		jp.add(jtf);
		pane.add(list,"Center");
		pane.add(jp,"South");
	}
	
	public void actionPerformed(ActionEvent e){ 
		//list = (JComboBox <String> )e.getSource(); 
		String cake = (String)list.getSelectedItem();
		jtf.setText(cake);
	}
	
	public static void main(String[] args) {
		Cakes frame = new Cakes ();
		frame.setTitle("** Lovely Bakery **");
		frame.setSize(350, 200);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}