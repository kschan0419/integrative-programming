import java.util.ArrayList;

public class StudentRegister {
	private ArrayList<Student> studentList;
	
	public StudentRegister() {
		studentList = new ArrayList<Student>();
		
		// Hardcoded elements of ArrayList for demonstration purposes!
		Student student1 = new Student("A1234", "Tajel");
		Student student2 = new Student("A1001", "Mike Slackenerny");
		
		studentList.add(student1);
		studentList.add(student2);
	}
	
	public boolean isRegisteredStudent(String matricNum) {
		for (Student student: studentList) {
			if (student.getMatricNum().equals(matricNum))
				return true;
		}
		
		return false;
	}
	
	public Student getStudent(String matricNum) {
		for (Student student: studentList) {
			if (student.getMatricNum().equals(matricNum))
				return student;
		}
		
		return null;
	}
}
