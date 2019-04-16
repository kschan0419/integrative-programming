import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class CreateMyFrame extends JFrame {

	public CreateMyFrame() {
		Container pane = getContentPane();
		pane.setBackground(Color.MAGENTA);
	}
	
	public static void main(String[] args) {
		CreateMyFrame myframe = new CreateMyFrame();
		myframe.setTitle("My Java Frame");
		myframe.setSize(300, 400);
		myframe.setVisible(true);
		myframe.setDefaultCloseOperation(EXIT_ON_CLOSE);; 
	}

}
