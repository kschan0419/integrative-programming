
public class Passenger {
	private String name;
	private String frequentFlyerNum;
	private String passportNum;
	private String nationality;
	private char gender;
	private String eTicketNum;
	private String specialServiceRequest;
	private char ticketClass;
	private String pnr;
	
	public Passenger(String n, String pn, String national, char g, String ffn, String etn, String ssr, char tc, String pnr){
		this.name = n;
		this.passportNum = pn;
		this.nationality = national;
		this.gender = g;
		this.frequentFlyerNum = ffn;
		this.eTicketNum = etn;
		this.specialServiceRequest = ssr;
		this.ticketClass = tc;
		this.pnr = pnr;
	}
	public String getName(){
		return this.name;
	}
	
	public String getPassportNum(){
		return this.passportNum;
	}
	
	public String getNationality(){
		return this.nationality;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public String getFrequentFlyerNum(){
		return this.frequentFlyerNum;
	}
	
	public String getETicketNum(){
		return this.eTicketNum;
	}
	
	public String getSpecialServiceRequest(){
		return this.specialServiceRequest;
	}
	
	public char getTicketClass(){
		return this.ticketClass;
	}
	
	public String getPNR(){
		return this.pnr;
	}

}
