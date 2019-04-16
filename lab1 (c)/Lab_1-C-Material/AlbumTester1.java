import java.util.ArrayList;

public class AlbumTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlbumCollectionRegister register = new AlbumCollectionRegister();
		ArrayList<Album> list = register.getAlbumCollectionRegisterList();
		
		if (list == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total number of Albums collections : "+list.size());
	}

}
