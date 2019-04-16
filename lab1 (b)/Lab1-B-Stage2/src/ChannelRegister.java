import java.util.ArrayList;

public class ChannelRegister {
	private ArrayList<Channel> list ;
	
	public ChannelRegister(){
		list = new ArrayList<Channel>();
	}
	
	ArrayList<Channel> getChannelRegisterList(){
		return list;	
	}
	
}
