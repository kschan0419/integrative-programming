
public class Song {
	private String title;
	private String composer;
	private String lyricist;
	private int length;

	public Song(String a, String b, String c, int d){
		title = a;
		composer = b;
		lyricist = c;
		length = d;
	}
	
	public String getTitle(){
		return title;
	}
	public String getComposer(){
		return composer;
	}
	public String getLyricist(){
		return lyricist;
	}
	public int getLength(){
		return length;
	}
	
}
