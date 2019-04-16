import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList;
	
	public ShoppingCart() {
		itemList = new ArrayList<Item>();
	}
	
	public ArrayList<Item> getAllItems() {
		return itemList;
	}
	
	public Item getItem(String id) {
		Item cartItem = null;
		
		for (Item element: itemList) {
			if (element.getId().equals(id)) {
				cartItem = element;
				break;
			}
		}
		
		return cartItem;
	}
	
	public void addItem(Item newItem, int unit) {
		Item cartItem = getItem(newItem.getId());
		
		if (cartItem == null) {
			cartItem = new Item(newItem.getId(), newItem.getName(), newItem.getPrice());
			cartItem.setUnit(unit);
			
			itemList.add(cartItem);
		}
		
		else
			cartItem.setUnit(cartItem.getUnit() + unit);
	}
}
