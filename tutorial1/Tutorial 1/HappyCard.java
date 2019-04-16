
public class HappyCard {
	private int point;
	private String type;
	
	public HappyCard(){
		point = 0;
		type = "new";
	}
	
	public void addPoint(int amt){
		if(amt>=100 && amt<=499){
			point += (amt*5);
		}
		else if(amt>=500){
			point += (amt*7);
		}
		else {
			point += amt;
		}
		updateType(point);
	}
	
	public boolean deductPoint(int amt){
		point -= amt;
		if(point>=0){
			updateType(point);
			return true;
		}
		else {
			point += amt;
			return false;
		}
	}
	
	private void updateType(int point){	
		if(point<500){
			type = "Bronze";
		}
		else if(point>=500 && point<=2499){
			type = "Silver";
		}
		else if(point>=2500 && point<=5499){
			type = "Gold";
		}
		else {
			type = "Platinum";
		}
	}
	
	public int getPoint(){
		return point;
	}
	
	public String getType(){
		return type;
	}
	
}
