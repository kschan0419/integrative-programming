
public class Passenger {
	private String name;
	private String frequentFlyerNum;
	private String passportNum;
	private String nationality;
	private char gender;
	private String eTicketNum;
	private String specialServiceRequest;
	private char ticketClass;
	
	public Passenger(String a, String b, String c, char d, String e, String f, String g, char h){
		name = a;
		passportNum = b;
		nationality = c;
		gender = d;
		frequentFlyerNum = e;
		eTicketNum = f;
		specialServiceRequest = g;
		ticketClass = h;
	}

	public String getName(){
		return name;
	}
	public String getPassportNum(){
		return passportNum;
	}
	public String getNationality(){
		return nationality;
	}
	public char getGender(){
		return gender;
	}
	public String getFrequentFlyerNum(){
		return frequentFlyerNum;
	}
	public String getETicketNum(){
		return eTicketNum;
	}
	public String getSpecialServiceRequest(){
		return specialServiceRequest;
	}
	public char getTicketClass(){
		return ticketClass;
	}
	
}