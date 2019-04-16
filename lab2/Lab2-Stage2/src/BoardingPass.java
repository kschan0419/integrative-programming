
public class BoardingPass {
	private Passenger passenger;
	private int securityNum;
	private char gate;
	private String gateOpen;
	private String seat;
	
	public BoardingPass(Passenger a,int b,char c,String d,String e){
		passenger = a;
		securityNum=b;
		gate=c;
		gateOpen=d;
		seat=e;	
	}
	
}
