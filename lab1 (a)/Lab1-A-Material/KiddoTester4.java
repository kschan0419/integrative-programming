import java.util.ArrayList;

public class KiddoTester4 {
	private static ArrayList<Student> kiddoList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KiddoClass kc1 = new KiddoClass("Kiddo Art", "For All", "Miss Aliyah");
		KiddoClass kc2 = new KiddoClass("Kiddo Science", "Introductory", "Miss Ana");
		KiddoClass kc3 = new KiddoClass("Kiddo Science", "Discovery", "Mr Aliff");
		KiddoClass kc4 = new KiddoClass("Kiddo Science", "Experimental", "Mr Mansur Shah");
		
	    Student s1 = new Student("Muhammad Munif bin Mohd Azlan", "090311101001", 8, kc2);
	    kiddoList.add(s1);
	    s1.addLesson(new Lesson("Animals and Plants", 80.5));
	    s1.addLesson(new Lesson("Light and Sight", 90));
	    s1.addLesson(new Lesson("Machines and Technology", 95));
	    
	    Student s2 = new Student("Marwa Humaira bin Mohd Azlan", "1010905105002", 7, kc1);
	    kiddoList.add(s2);
	    s2.addLesson(new Lesson("Art work", 95));
	    s2.addLesson(new Lesson("Clay art", 85.5));
	    
	    Student s3 = new Student("Zureen binti Aziz", "050708055002", 12, kc4);
	    kiddoList.add(s3);
	    s3.addLesson(new Lesson("Animal and Plants", 90.5));
	    
	    Student s4 = new Student("Hang Li Po", "080808055002", 9, kc3);
	    kiddoList.add(s4);
	    s4.addLesson(new Lesson("Strength and Stability", 81.5));
	    s4.addLesson(new Lesson("Scientist Invention", 90));
	    
	    Student s5 = new Student("Jebat Iskandar", "100408055001", 7, kc2);
	    kiddoList.add(s5);
	    s5.addLesson(new Lesson("Light and Sight", 85));
	    s5.addLesson(new Lesson("Machines and Technology", 95));
	    
	    Student s6 = new Student("Iman Farrar", "110411101002", 6, kc1);
	    kiddoList.add(s6);
	    s6.addLesson(new Lesson("Handicraft", 95));
	    s6.addLesson(new Lesson("Clay art", 90));
	    
	    listStudentDetails();
	    totalStudentEachClass();
	}
	
	public static void listStudentDetails(){
		for (Student s: kiddoList) { 
	    	System.out.println("\n"+ s.getName());
	    	System.out.println("Kiddo class : "+ s.getKclass().getType());
	    	System.out.println("Kiddo class level : "+ s.getKclass().getLevel());
	    	System.out.println("Kiddo class instructor : "+ s.getKclass().getInstructor());
	    	s.listCompletedLessons();
	    	System.out.println("Average marks for completed lessons  : "+ s.getAverageMarks());
		}
	}
	
	public static void totalStudentEachClass(){
		int art = 0;
		int introductory = 0; 
		int discovery = 0; 
		int experimental = 0;
		/*

		Add for loop here to calculate the number of students in each KiddoClass

		*/
		System.out.println("\nNo of student in Kiddo Art : "+ art);
		System.out.println("No of student in Kiddo Introductory Science  : "+ introductory);
		System.out.println("No of student in Kiddo Discovery Science : "+ discovery);
		System.out.println("No of student in Kiddo Experimental Science : "+ experimental);
	}
}
