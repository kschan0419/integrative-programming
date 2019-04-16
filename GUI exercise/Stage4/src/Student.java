import java.util.ArrayList;

public class Student {
	private String matricNum;
	private String name;
	private ArrayList<Course> registeredCourses;
	
	public Student(String m, String n) {
		matricNum = m;
		name = n;
		registeredCourses = new ArrayList<Course> ();
	}
	
	public String getMatricNum() {
		return matricNum;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Course> getAllRegisteredCourses() {
		return registeredCourses;
	}
	
	public int getTotalCreditHours() {
		int total = 0;
		
		for (Course course: registeredCourses)
			total = total + course.getCreditHour();
		
		return total;
	}
	
	public String registerCourse(Course course) {
		if (isRegisteredCourse(course))
			return "Registration failed: Course has already been registered";
	
		else {
			if (isWithinMaxCreditHours(course)) {
				registeredCourses.add(course);
				return "Successful registration";
			}
		
			else
				return "Registration failed: Exceeds maximum 10 credit hours";
		}
	}
	
	public String dropCourse(Course course) {
		if (isRegisteredCourse(course)) {
			registeredCourses.remove(course);
			return "Course has been successfully dropped";
		}
		
		return "Operation failed: Course is not in the current list of registered courses";
	}

	public boolean isRegisteredCourse(Course course) {
		return registeredCourses.contains(course);
	}
	
	public boolean isWithinMaxCreditHours(Course course) {
		if (getTotalCreditHours() + course.getCreditHour() <= 10)
			return true;
		else
			return false;
	}
}
