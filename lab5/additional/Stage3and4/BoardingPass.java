
public class BoardingPass {
	private Passenger passenger;
	private int securityNum;
	private char gate;
	private String gateOpen;
	private String seat;
	
	public BoardingPass(Passenger p, int sn, char g, String go, String s){
		this.passenger = p;
		this.securityNum = sn;
		this.gate = g;
		this.gateOpen = go;
		this.seat = s;
	}
	
	public Passenger getPassenger(){
		return this.passenger;
	}
	
	public int securityNum(){
		return this.securityNum;
	}
	
	public char getGate(){
		return this.gate;
	}
	
	public String getGateOpen(){
		return this.gateOpen;
	}
	
	public String getSeat(){
		return this.seat;
	}

}
