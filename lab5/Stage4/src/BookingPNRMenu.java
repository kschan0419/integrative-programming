import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BookingPNRMenu extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private LoginScreen prevScreen;
	private JButton backBtn; 
	private Flight flight;
	private BoardingPass bp;
	private JTextField bookingPnrTF;
	private JButton enterBtn;
	
	public BookingPNRMenu(LoginScreen p){
		prevScreen = p;
		String fileName = "checkin.png";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Flight Check-In System - Using Booking Reference");
		setSize(450, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(image);
		pane.add(new JLabel("To begin your check in, please input your booking PNR number"));
		bookingPnrTF = new JTextField(10);
		pane.add(bookingPnrTF);
		enterBtn = new JButton("Enter");
		enterBtn.addActionListener(this);
		pane.add(enterBtn);
		backBtn = new JButton("Back");
		backBtn.addActionListener(this);
		pane.add(backBtn);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		String bookingNo = bookingPnrTF.getText();
		flight = new Flight("HEATHROW-LONDON", "KUALA LUMPUR", "MH001", "19 APR", "22:00");
		
		if (o == enterBtn) {
			if (flight.isRegisteredPassenger(bookingNo)) {
				bp = flight.getBoardingPass(bookingNo);
				this.setVisible(false); // make this frame disappears
				new BoardingPassScreen(flight, bp); // make next (new) frame appears
			}
			else
				JOptionPane.showMessageDialog(this, "You MUST enter valid Booking Reference number"  ,"Error", JOptionPane.ERROR_MESSAGE);
		} else if (o == backBtn){
			this.setVisible(false);
			prevScreen.setVisible(true);
		}
	}
}
