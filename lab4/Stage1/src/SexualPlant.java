import java.util.ArrayList;

public class SexualPlant extends Plant{
	private double size;
	private boolean hasSeeds;
	private String pollinationAgent;

	public SexualPlant(String n, String cl, String t, boolean hs, String pa) {
		super(n, cl, t);
		size = 1;
		hasSeeds = hs;
		pollinationAgent = pa;
	}
	
	public void setSize(double s){
		size = s;
	}
	public void setHasSeeds(boolean hs){
		hasSeeds = hs;
	}
	public void setPollinationAgent(String pa){
		pollinationAgent = pa;
	}
	
	public double getSize(){
		return size;
	}
	public boolean getHasSeeds(){
		return hasSeeds;
	}
	public String getPollinationAgent(){
		return pollinationAgent;
	}
	
	public void printDetails(){
		super.printDetails();
		System.out.println("Size: "+size+" cm");
		System.out.println("Has seeds: "+hasSeeds);
		System.out.println("Pollination agent: "+pollinationAgent);
		System.out.println();
	}

	public void determineGrowth(int days){
		if(super.getType().equals("Indoor")){
			size += days*0.25;
		}
		else {
			if(hasSeeds == true){
				if(pollinationAgent.equals("birds")){
					size += days*1.25;
				}
				else if (pollinationAgent.equals("bats")){
					size += days*2*1.25;
				}
			}
			else {
				if(pollinationAgent.equals("insect")){
					size += days*2*1.25;
				}
				else if (pollinationAgent.equals("birds")){
					size += days*1.25;
				}
			}
		}
	}
	
	public void countIndoorPlant(ArrayList<Plant> plantList){
		int x = 0;
		for(Plant p : plantList){
			if (p instanceof SexualPlant){
			if (p.getType().equals("Indoor")){
				x++;
			}
			}
		}
		System.out.println("Number of indoor SexualPlant: "+x);
	}
	
	public void countOutdoorPlant(ArrayList<Plant> plantList){
		int x = 0;
		for(Plant p : plantList){
			if (p instanceof SexualPlant){
			if (p.getType().equals("Outdoor")){
				x++;
			}
			}
		}
		System.out.println("Number of outdoor SexualPlant: "+x);
	}
	
}
