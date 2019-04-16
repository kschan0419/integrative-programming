import java.util.ArrayList;

public class KiddoTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> kiddoList = new ArrayList<Student>();
		KiddoClass kc1 = new KiddoClass("Kiddo Art", "For All", "Miss Aliyah");
		KiddoClass kc2 = new KiddoClass("Kiddo Science", "Introductory", "Miss Ana");
		KiddoClass kc3 = new KiddoClass("Kiddo Science", "Discovery", "Mr Aliff");
		KiddoClass kc4 = new KiddoClass("Kiddo Science", "Experimental", "Mr Mansur Shah");
		
	    Student s1 = new Student("Muhammad Munif bin Mohd Azlan", "090311101001", 8, kc2);
	    kiddoList.add(s1);
	    Student s2 = new Student("Marwa Humaira bin Mohd Azlan", "1010905105002", 7, kc1);
	    kiddoList.add(s2);
	    Student s3 = new Student("Zureen binti Aziz", "050708055002", 12, kc4);
	    kiddoList.add(s3);
	    Student s4 = new Student("Hang Li Po", "080808055002", 9, kc3);
	    kiddoList.add(s4);
	    System.out.println("Total number of students at Kiddo Bangi : "+ kiddoList.size());
	    
	}

}