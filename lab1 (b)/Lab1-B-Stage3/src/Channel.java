import java.util.ArrayList;

public class Channel {
	private int number ;
	private String name ;
	private String type ;
	private ArrayList<TVProgram> list ;
	
	public Channel(int a, String b, String c){
		number = a ;
		name = b ;
		type = c ;
		list = new ArrayList<TVProgram>() ;
	}

	public int getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public ArrayList<TVProgram> getProgramList(){
		return list;
	}
	
	public void addTVProgram(TVProgram tv){
		list.add(tv);
	}
	public void listAiredTVPrograms(){
		System.out.println("Program aired in Channel : "+number);
		System.out.println();
		for(TVProgram a : list ){
			System.out.println("Program name : "+a.getName());
			System.out.println("Season : "+a.getSeason());
			System.out.println("Episode : "+a.getEpisode());
			System.out.println("Airtime : "+a.getAirtime());
			System.out.println("No of viewers : "+a.getNoOfViewers());
			System.out.println();
		}
	}
	
	
}
