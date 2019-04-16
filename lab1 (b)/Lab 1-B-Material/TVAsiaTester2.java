import java.util.ArrayList;

public class TVAsiaTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelRegister register = new ChannelRegister();
		ArrayList<Channel> channelList = register.getChannelRegisterList();
		
		Channel c1 = new Channel(303, "Anime", "Normal");
		Channel c2 = new Channel(507, "Discovery", "HD");
		Channel c3 = new Channel(515, "Cartoon", "HD");
		channelList.add(c1);
		channelList.add(c2);
		channelList.add(c3);
	    
		for (Channel c: channelList) { 
	    	System.out.println("\nChannel number : "+ c.getNumber());
	    	System.out.println("Channel name : "+ c.getName());
	    	System.out.println("Channel type : "+ c.getType());
	    }
	}

}
