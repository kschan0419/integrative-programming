import java.util.ArrayList;

public class TVAsiaTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelRegister register = new ChannelRegister();
		ArrayList<Channel> list = register.getChannelRegisterList();
		
		if (list == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total number of Channels offered by TVAsia : "+list.size());
	}

}
