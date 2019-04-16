import java.util.ArrayList;

public class AsexualPlant extends Plant {
	private double height;
	private String propagationMethod;

	public AsexualPlant(String n, String cl, String t, double initHeight, String pm) {
		super(n, cl, t);
		height = initHeight;
		propagationMethod = pm;
	}
	
	public void setHeight(double h){
		height = h;
	}
	public void setPropagationMethod(String pm){
		propagationMethod = pm;
	}
	
	public double getHeight(){
		return height;
	}
	public String getPropagationMethod(){
		return propagationMethod;
	}
	
	public void printDetails(){
		super.printDetails();
		System.out.println("Height: "+height+" cm");
		System.out.println("Propagation Method: "+propagationMethod);
		System.out.println();
	}
	
	public void determineGrowth(int days){
		if (super.getType().equals("Indoor")){
			if (propagationMethod.equals("Stem") || propagationMethod.equals("Dividing")){
				height += days*2*0.5;
			}
			else {
				height += days*0.5;
			}
		}
		else {
			if (propagationMethod.equals("Stem") || propagationMethod.equals("Dividing")){
				height += days*2*1.5;
			}
			else {
				height += days*1.5;
			}
		}
	}
	
	public void countIndoorPlant(ArrayList<Plant> plantList){
		int x = 0;
		for(Plant p : plantList){
			if (p instanceof AsexualPlant){
			if (p.getType().equals("Indoor")){
				x++;
			}
			}
		}
		System.out.println("Number of indoor AsexualPlant: "+x);
	}
	
	public void countOutdoorPlant(ArrayList<Plant> plantList){
		int x = 0;
		for(Plant p : plantList){
			if (p instanceof AsexualPlant){
			if (p.getType().equals("Outdoor")){
				x++;
			}
			}
		}
		System.out.println("Number of outdoor AsexualPlant: "+x);
	}
	
}
