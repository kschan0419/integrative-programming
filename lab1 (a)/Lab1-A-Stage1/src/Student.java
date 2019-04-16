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

}
