
public class Item {
	private String id;
	private String name;
	private double price;
	private int unit;
	
	public Item(String i, String n, double p) {
		id = i;
		name = n;
		price = p;
		unit = 0;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setUnit(int u) {
		unit = u;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public double getItemTotal() {
		return price * unit;
	}
}
