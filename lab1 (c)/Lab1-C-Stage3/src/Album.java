import java.util.ArrayList;

public class Album {
	private String title;
	private int year;
	private String label;
	private String genre;
	private String singer;
	private ArrayList<Song> track;

	public Album(String a, int b, String c, String d, String e){
		title = a;
		year = b;
		label = c;
		genre = d;
		singer = e;
		track = new ArrayList<Song>();
	}
	
	public String getTitle(){
		return title;
	}
	public int getYearReleased(){
		return year;
	}
	public String getGenre(){
		return genre;
	}
	public String getLabel(){
		return label;
	}
	public String getSinger(){
		return singer;
	}
	public ArrayList<Song> getTrackList(){
		return track;
	}
	
	public void addSong(Song song){
		track.add(song);
	}
	public void listSongDetails(){
		for(Song s : track){
		System.out.println("      Song title : "+s.getTitle());
		System.out.println("      Composer    : "+s.getComposer());
		System.out.println("      Lyricist    : "+s.getLyricist());
		System.out.println("      Length      : "+s.getLength());
		}
	}
	
}
