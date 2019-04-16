import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyLayout extends JFrame {

	public MyLayout() {
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(3,5));
		for(int i=1; i <=13; i++){
		pane.add(new JButton(""+i));
		}
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
