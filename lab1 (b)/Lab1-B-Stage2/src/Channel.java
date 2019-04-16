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
	
	
	
}
