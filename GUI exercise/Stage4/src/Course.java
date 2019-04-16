
public class Course {
	private String courseCode;
	private String courseName;
	private int creditHour;
	
	public Course(String c, String n, int h) {
		courseCode = c;
		courseName = n;
		creditHour = h;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCreditHour() {
		return creditHour;
	}
}
