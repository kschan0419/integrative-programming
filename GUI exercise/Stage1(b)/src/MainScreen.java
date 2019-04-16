import javax.swing.JFrame;

public class MainScreen extends JFrame{

public MainScreen(){
		
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
