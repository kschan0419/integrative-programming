import java.util.ArrayList;

public class AlbumTester3 {

	public static void main(String[] args) {
		AlbumCollectionRegister register = new AlbumCollectionRegister();
		ArrayList<Album> albumList = register.getAlbumCollectionRegisterList();
		
		Album a1 = new Album("Mencheche Bujang Lapok", 1961, "Parlophone", "Film Soundtrack", "P.Ramlee/Saloma");
		Album a2 = new Album("Coast To Coast", 2000, "RCA, BMG UK & Ireland", "Pop", "Westlife");
		Album a3 = new Album("Edcoustic Hits 1 Dekade", 2012, "Kreavisi", "World", "Edcoustic");
		Album a4 = new Album("Chapters", 2016, "Verve Records", "Pop, R&B", "Yuna");
		albumList.add(a1);
		albumList.add(a2);
		albumList.add(a3);
		albumList.add(a4);
	    a1.addSong(new Song("Mencheche Bujang Lapok", "P.Ramlee", "S.Sudarmaji", 3));
	    a1.addSong(new Song("Embun Menitik", "P.Ramlee", "S.Sudarmaji", 4));
	    a2.addSong(new Song("My Love", "Jörgen Elofsson David Kreuger Per Magnusson Pelle Nylén", "Jörgen Elofsson David Kreuger Per Magnusson Pelle Nylén", 3));
	    a3.addSong(new Song("Muhasabah Cinta", "Aden", "Aden", 3));
	    a3.addSong(new Song("Sebiru Hari Ini", "Aden", "Aden", 4));
	    a4.addSong(new Song("Crush", "Zarai, Robinson, Warfield", "Zarai, Robinson, Warfield", 4));
	    a4.addSong(new Song("Best of Me", "Zarai, Braun, Salva", "Zarai, Braun, Salva", 5));
	    a4.addSong(new Song("All I Do", "Zarai, David Foster", "Zarai, David Foster", 3));
	    printAlbumDetails(albumList);
	}
	
	public static void printAlbumDetails(ArrayList<Album> albumList){
		for (Album a: albumList) { 
	    	System.out.println("\nAlbum title : "+ a.getTitle());
	    	System.out.println("Year released : "+ a.getYearReleased());
	    	System.out.println("Label : "+ a.getLabel());
	    	System.out.println("Genre : "+ a.getGenre());
	    	System.out.println("Singer : "+ a.getSinger());
	    	a.listSongDetails();
	    }
	}
}
