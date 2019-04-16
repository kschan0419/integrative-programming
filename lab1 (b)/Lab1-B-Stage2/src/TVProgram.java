
public class TVProgram {
	private String name ;
	private int season ;
	private int episode ;
	private String airtime ;
	private int viewers ;

	public TVProgram(String a, int b, int c, String d, int e){
		name = a ;
		season = b ;
		episode = c ;
		airtime = d ;
		viewers = e;
	}
	
	public String getName(){
		return name;
	}
	public int getSeason(){
		return season;
	}
	public int getEpisode(){
		return episode;
	}
	public String getAirtime(){
		return airtime;
	}
	public int getNoOfViewers(){
		return viewers;
	}
	
	
}
