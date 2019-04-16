
public class Customer {
	private int customerID;
	private String name;
	private HappyCard card;
	
	//HappyCard card = new HappyCard();
	
	public Customer(int id, String n){
		customerID = id;
		name = n;
		card = new HappyCard();
	}
	
	public void buy(int amt){
		card.addPoint(amt);
	}
	
	public boolean redeem(int amt){
		return card.deductPoint(amt);
	}
	
	public int getId(){
		return customerID;
	}
	
	public String getName(){
		return name;
	}
	
	public HappyCard getCard(){
		return card;
	}
	
}
