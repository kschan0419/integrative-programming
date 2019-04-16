
public class Plant {
	private String name;
	private String climate;
	private String type;
	
	public Plant(String n, String cl, String t){
		name = n;
		climate = cl;
		type = t;
	}
	
	public void setName(String n){
		name = n;
	}
	public void setClimate(String cl){
		climate = cl;
	}
	public void setType(String t){
		type = t;
	}
	
	public String getName(){
		return name;
	}
	public String getClimate(){
		return climate;
	}
	public String getType(){
		return type;
	}
	
	public void printDetails(){
		System.out.println("Plant Name: "+name);
		System.out.println("Suitable Climate: "+climate);
		System.out.println("Plant Type: "+type);
	}

}
