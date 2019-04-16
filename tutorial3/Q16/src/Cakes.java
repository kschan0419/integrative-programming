import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Cakes extends JFrame implements ListSelectionListener {
	JList list;
	JTextField jtf;
	JLabel label1;
	String cakeList[] = {"Blueberry Cheese","Carrot Cheese", "Tiramisu", "Rainbow", "Apple Crumble","Caramel", "Red Velvet"};
	
	public Cakes (){
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		JPanel jp = new JPanel(new FlowLayout());
		list = new JList(cakeList);
		label1 = new JLabel(" Selected Cake >>> ");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtf = new JTextField(10);
		list.addListSelectionListener(this);  
		jp.add(list);
		jp.add(label1);
		jp.add(jtf);
		pane.add(list,"Center");
		pane.add(jp,"South");
	}
	
	public void valueChanged(ListSelectionEvent e){
		String cake = (String)list.getSelectedValue();
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