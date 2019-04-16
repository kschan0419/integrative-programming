import java.util.ArrayList;

public class TVAsiaTester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelRegister register = new ChannelRegister();
		ArrayList<Channel> channelList = register.getChannelRegisterList();
		
		Channel c1 = new Channel(303, "Anime", "Normal");
		Channel c2 = new Channel(507, "Discovery", "HD");
		Channel c3 = new Channel(393, "One TV Asia", "HD");
		channelList.add(c1);
		channelList.add(c2);
		channelList.add(c3);
		c1.addTVProgram(new TVProgram("Dragon Ball", 5, 1, "17:00-18:00", 890));
		c1.addTVProgram(new TVProgram("Trickster", 2, 7, "19:00-20:00", 1201));
		c1.addTVProgram(new TVProgram("Fuuka", 1, 12, "11:00-12:00", 1307));
		c2.addTVProgram(new TVProgram("How It's Made", 10, 1, "17:00-18:00", 1200));
		c2.addTVProgram(new TVProgram("Ultimate Survival", 1, 12, "13:00-14:00", 567));
		c3.addTVProgram(new TVProgram("Hwarang: The Poet Warrior Youth ", 1, 12, "21:00-22:00", 2001));
		c3.addTVProgram(new TVProgram("Innocent Defendant", 1, 19, "11:00-12:00", 900));
		
		printTVProgramVerdict(channelList);
	}

	public static void printChannelDetails(ArrayList<Channel> channelList){
		for (Channel c: channelList) { 
	    	System.out.println("\nChannel : "+ c.getNumber()+ " "+ c.getName()+" "+ c.getType());
	    	c.listAiredTVPrograms();
	    }
	}
	
	public static void printTVProgramVerdict(ArrayList<Channel> channelList){
		for (Channel c: channelList) { 
	    	System.out.println("\nChannel : "+ c.getNumber()+ " "+ c.getName()+" "+ c.getType());
	    	c.listTVProgramFuture();
	    }
	}
}
