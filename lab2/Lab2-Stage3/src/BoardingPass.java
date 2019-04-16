
public class BoardingPass {
	private int securityNum;
	private char gate;
	private String gateOpen;
	private String seat;
	private Passenger passenger;
	
	public BoardingPass(Passenger a,int b,char c,String d,String e){
		passenger = a;
		securityNum=b;
		gate=c;
		gateOpen=d;
		seat=e;	
	}
	
	public Passenger getPassenger(){
		return passenger;
	}
	public int getSecurityNum(){
		return securityNum;
	}
	public char getGate(){
		return gate;
	}
	public String getGateOpen(){
		return gateOpen;
	}
	public String getseat(){
		return seat;
	}
	
}
