package dao;

import java.util.List;
import java.util.Map;

import model.Course;
import model.Registration;
import model.Student;

public interface StudentDao {
	String addNewStudent(Student student);
	void updateStudentProfile(Student student);
	Map<Student, Course> viewAllRegistrations();
	void registration(Student student, Course course);
	Student findStudentByRollNo(int rollNo);
	List<Student> viewAllStudents();
	void addNewCourse(Course course);
	List<Course> viewAllCourses();
	Course findCourseById(int courseId);
	
}


