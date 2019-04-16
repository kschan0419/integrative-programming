import java.util.ArrayList;

public class Student {
	private String name;
	private String ic;
	private int age;
	private KiddoClass kc;

	ArrayList<Lesson> LessonList = new ArrayList<Lesson>();
	
	public Student(String f, String g, int h, KiddoClass i){
		name = f;
		ic = g;
		age = h;
		kc = i;
	}
	
	public String getName(){
		return name;
	}
	public String getICNo(){
		return ic;
	}
	public int getAge(){
		return age;
	}
	public KiddoClass getKclass(){
		return kc;
	}
	public ArrayList<Lesson> getLessonList(){
		return LessonList;	
	}

	public void addLesson(Lesson lesson){
		LessonList.add(lesson);
	}  
	public void listCompletedLessons(){
		System.out.println("Lessons completed :");
		for(Lesson l : LessonList){
			 System.out.println(l.getTheme() + " " + l.getMarks());
		}	
	} 
	public double getAverageMarks(){
		double total = 0;
		for(Lesson l : LessonList){
			total += l.getMarks();
		}
		return total/LessonList.size();
	}
	
}
