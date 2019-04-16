import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class CartScreen extends JFrame {
	private double cartTotal = 0.0;
	
	public CartScreen(ShoppingCart cart) {
		setTitle("Maju Jaya Online Store");
		setSize(500, 400);
		setVisible(true);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Item in your cart"));
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("==============================================="));
		
		JPanel pNorth = new JPanel();
		pNorth.setLayout(new BorderLayout());
		pNorth.add(p1, BorderLayout.CENTER);
		pNorth.add(p2, BorderLayout.SOUTH);
		
		ArrayList<Item> list = cart.getAllItems(); 
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(list.size()+1,1));
		
		for (int i=0; i<list.size(); i++) {
			Item item = list.get(i);			
			String itemDetails = (i+1)+". "+item.getName() +"(ID:"+item.getId()+") RM"
			                       +item.getPrice()+" x "+item.getUnit()+" Sub-total: RM"+item.getItemTotal();
			JLabel itemLbl = new JLabel(itemDetails);
			
			pCenter.add(itemLbl);
			
			cartTotal = cartTotal + item.getItemTotal();
		}
		
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pSouth.add(new JLabel("Total: RM"));
		pSouth.add(new JLabel(""+cartTotal));
		
		pane.add(pNorth, BorderLayout.NORTH);
		pane.add(pCenter, BorderLayout.CENTER);
		pane.add(pSouth, BorderLayout.SOUTH);
	}
}
