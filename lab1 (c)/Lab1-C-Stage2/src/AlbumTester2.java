import java.util.ArrayList;

public class AlbumTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlbumCollectionRegister register = new AlbumCollectionRegister();
		ArrayList<Album> albumList = register.getAlbumCollectionRegisterList();
		
		Album a1 = new Album("Bunyi Gitar", 1964, "Parlophone", "Folk, World & Country", "P.Ramlee");
		Album a2 = new Album("Coast To Coast", 2000, "RCA, BMG UK & Ireland", "Pop", "Westlife");
		Album a3 = new Album("Edcoustic Hits 1 Dekade", 2012, "AlfaRecords", "World", "Edcoustic");
		Album a4 = new Album("Chapters", 2016, "Verve Records", "Pop, R&B", "Yuna");
		albumList.add(a1);
		albumList.add(a2);
		albumList.add(a3);
		albumList.add(a4);
	    
		for (Album a: albumList) { 
	    	System.out.println("\nAlbum title : "+ a.getTitle());
	    	System.out.println("Year released : "+ a.getYearReleased());
	    	System.out.println("Label : "+ a.getLabel());
	    	System.out.println("Genre : "+ a.getGenre());
	    	System.out.println("Singer : "+ a.getSinger());
	    }
	}

}
