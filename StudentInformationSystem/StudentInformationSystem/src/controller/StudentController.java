package controller;

import java.util.List;
import java.util.Map;

import dao.StudentDao;
import dao.StudentDaoImplDatabase;
import exception.PhoneException;
import model.Course;
import model.Student;

public class StudentController {
	
	
	StudentDao dao=new StudentDaoImplDatabase();
	
	public 	String addNewStudent(Student student) {
		// TODO Auto-generated method stub
		if(student.getPhoneNo().length()!=10) {
			try {
				throw new PhoneException("Invalid phone number");
			} catch(PhoneException e) {
				return e.getMessage();
			}
		}
		
		dao.addNewStudent(student);
		return "New student added successfully";

	}

	
	public void updateStudentProfile(Student student) {
		// TODO Auto-generated method stub

	}

	
	public Map<Student, Course> viewAllRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void registration(Student student, Course course) {
		// TODO Auto-generated method stub

	}

	
	public Student findStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void addNewCourse(Course course) {
		// TODO Auto-generated method stub

	}

	
	public List<Course> viewAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Course findCourseById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}


}