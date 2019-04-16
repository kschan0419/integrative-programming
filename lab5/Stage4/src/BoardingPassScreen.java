import java.awt.*;
import javax.swing.*;

public class BoardingPassScreen extends JFrame{
	JPanel pane1 = new JPanel();
	JPanel pane2 = new JPanel();
	JPanel pane3 = new JPanel();
	JLabel label1 = new JLabel("Name");
	JLabel label2 = new JLabel("Frequent Flyer Number");
	JLabel label3 = new JLabel("Security Number");
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();
	
	Font fontLabel = new Font("Serif", Font.PLAIN, 14);
	Font fontValue = new Font("Serif", Font.PLAIN, 14);
	
	private static final long serialVersionUID = 1L;
	BoardingPass boardingPass;
	
	public BoardingPassScreen(Flight f, BoardingPass bp) {
		
		boardingPass = bp;
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Printing Boarding Pass");
		setSize(850, 225);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Container pane = getContentPane();
		//pane.setLayout(new BorderLayout());
		
		//pane.add(new JLabel("Welcome "+bp.getPassenger().getName()), BorderLayout.NORTH);
		
		Container pane = getContentPane();
		
		pane.setLayout(new GridLayout(3,1));
		
		pane.add(pane1);
		String fileName = "logoMAS.png";
		ImageIcon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		pane1.add(image);
		
		if(bp.getPassenger().getTicketClass()=='O'){
			JLabel class1 = new JLabel("ECONOMY CLASS");
			class1.setFont(new Font("Serif", Font.BOLD, 16));
			class1.setForeground(Color.BLACK);
			pane1.add(class1);
		}
		else if(bp.getPassenger().getTicketClass()=='B'){
			JLabel class2 = new JLabel("BUSINESS¡¡CLASS");
			class2.setFont(new Font("Serif", Font.BOLD, 16));
			class2.setForeground(Color.BLACK);
			pane1.add(class2);
		}
		
		String fileName2 = "barcode.png";
		ImageIcon icon2 = new ImageIcon(fileName2);
		JLabel image2 = new JLabel(icon2);
		pane1.add(image2);
		
		pane.add(pane2);
		pane2.setLayout(new GridLayout(2,3));
		pane2.add(label1);
		label1.setFont(fontLabel);
		label1.setForeground(Color.BLUE);
		pane2.add(label2);
		label2.setFont(fontLabel);
		label2.setForeground(Color.BLUE);
		pane2.add(label3);
		label3.setFont(fontLabel);
		label3.setForeground(Color.BLUE);
		pane2.add(label4);
		label4.setText(bp.getPassenger().getName());
		label4.setFont(fontValue);
		label4.setForeground(Color.BLACK);
		pane2.add(label5);
		label5.setText(bp.getPassenger().getFrequentFlyerNum());
		label5.setFont(fontValue);
		label5.setForeground(Color.BLACK);
		pane2.add(label6);
		label6.setText(""+bp.securityNum());
		label6.setFont(fontValue);
		label6.setForeground(Color.BLACK);
	
		pane.add(pane3);
		pane3.setLayout(new GridLayout(4,6));
		JLabel label7 = new JLabel("From");
		label7.setFont(fontLabel);
		label7.setForeground(Color.BLUE);
		pane3.add(label7);
		JLabel label8 = new JLabel("To");
		label8.setFont(fontLabel);
		label8.setForeground(Color.BLUE);
		pane3.add(label8);
		JLabel label9 = new JLabel("SSR");
		label9.setFont(fontLabel);
		label9.setForeground(Color.BLUE);
		pane3.add(label9);
		JLabel label10 = new JLabel("Flight Number");
		label10.setFont(fontLabel);
		label10.setForeground(Color.BLUE);
		pane3.add(label10);
		JLabel label11 = new JLabel("Date");
		label11.setFont(fontLabel);
		label11.setForeground(Color.BLUE);
		pane3.add(label11);
		JLabel label12 = new JLabel("Departure Time");
		label12.setFont(fontLabel);
		label12.setForeground(Color.BLUE);
		pane3.add(label12);
		JLabel label13 = new JLabel(f.getFrom());
		label13.setFont(fontValue);
		label13.setForeground(Color.BLACK);
		pane3.add(label13);
		JLabel label14 = new JLabel(f.getTo());
		label14.setFont(fontValue);
		label14.setForeground(Color.BLACK);
		pane3.add(label14);
		JLabel label15 = new JLabel(bp.getPassenger().getSpecialServiceRequest());
		label15.setFont(fontValue);
		label15.setForeground(Color.BLACK);
		pane3.add(label15);
		JLabel label16 = new JLabel(f.getFlightNum());
		label16.setFont(fontValue);
		label16.setForeground(Color.BLACK);
		pane3.add(label16);
		JLabel label17 = new JLabel(f.getDate());
		label17.setFont(fontValue);
		label17.setForeground(Color.BLACK);
		pane3.add(label17);
		JLabel label18 = new JLabel(f.getDepartureTime());
		label18.setFont(fontValue);
		label18.setForeground(Color.BLACK);
		pane3.add(label18);
		JLabel label19 = new JLabel("Gate");
		label19.setFont(fontLabel);
		label19.setForeground(Color.BLUE);
		pane3.add(label19);
		JLabel label20 = new JLabel("Gate Opens");
		label20.setFont(fontLabel);
		label20.setForeground(Color.BLUE);
		pane3.add(label20);
		JLabel label21 = new JLabel("Class");
		label21.setFont(fontLabel);
		label21.setForeground(Color.BLUE);
		pane3.add(label21);
		JLabel label22 = new JLabel("PNR");
		label22.setFont(fontLabel);
		label22.setForeground(Color.BLUE);
		pane3.add(label22);
		JLabel label23 = new JLabel("Seat");
		label23.setFont(fontLabel);
		label23.setForeground(Color.BLUE);
		pane3.add(label23);
		JLabel label24 = new JLabel("E-Ticket Number");
		label24.setFont(fontLabel);
		label24.setForeground(Color.BLUE);
		pane3.add(label24);
		JLabel label25 = new JLabel(""+bp.getGate());
		label25.setFont(fontValue);
		label25.setForeground(Color.BLACK);
		pane3.add(label25);
		JLabel label26 = new JLabel(bp.getGateOpen());
		label26.setFont(fontValue);
		label26.setForeground(Color.BLACK);
		pane3.add(label26);
		JLabel label27 = new JLabel(""+bp.getPassenger().getTicketClass());
		label27.setFont(fontValue);
		label27.setForeground(Color.BLACK);
		pane3.add(label27);
		JLabel label28 = new JLabel(bp.getPassenger().getPNR());
		label28.setFont(fontValue);
		label28.setForeground(Color.BLACK);
		pane3.add(label28);
		JLabel label29 = new JLabel(bp.getSeat());
		label29.setFont(fontValue);
		label29.setForeground(Color.BLACK);
		pane3.add(label29);
		JLabel label30 = new JLabel(bp.getPassenger().getETicketNum());
		label30.setFont(fontValue);
		label30.setForeground(Color.BLACK);
		pane3.add(label30);
	}
}
