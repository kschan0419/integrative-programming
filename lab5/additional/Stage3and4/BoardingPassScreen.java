import java.awt.*;
import javax.swing.*;

public class BoardingPassScreen extends JFrame{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BoardingPass boardingPass;
	
	public BoardingPassScreen(Flight f, BoardingPass bp) {
		
		boardingPass = bp;
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Printing Boarding Pass");
		setSize(850, 225);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		pane.add(new JLabel("Welcome "+bp.getPassenger().getName()), BorderLayout.NORTH);
		
	}
}
