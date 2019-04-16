import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLayout extends JFrame {

	public MyLayout() {
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(new JButton("One"),(BorderLayout.NORTH));
		pane.add(new JButton("Two"),(BorderLayout.SOUTH));
		pane.add(new JButton("Three"),(BorderLayout.EAST));
		pane.add(new JButton("Four"),(BorderLayout.WEST));
		pane.add(new JButton("Five"),(BorderLayout.CENTER));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLayout frame = new MyLayout();
		frame.setTitle("MyLayout");
		frame.setVisible(true);
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
	}

}
