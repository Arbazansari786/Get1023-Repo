package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import connection.OracleConnection;
import model.Course;
import model.Student;

public class StudentDaoImplDatabase implements StudentDao {

	Connection conn;
	PreparedStatement ps; // used to run SQL queries

	public StudentDaoImplDatabase() {
		conn = OracleConnection.getConnection();
		if (conn != null) {
			System.out.println("Connected");
		} else {
			System.out.println("NOT Connected");
		}
	}

	@Override
	public String addNewStudent(Student student) {

		System.out.println("lets go");
		String sql = "insert into tbl_students values(seq_stud.nextval,?,?,?,?,?,?)";
		int count;
		String message;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setDate(2, Date.valueOf(student.getDateOfBirth()));
			ps.setString(3, student.getQualification().name());
			ps.setString(4, student.getPhoneNo());
			ps.setString(5, student.getEmail());
			ps.setString(6, student.getAddress());
			
			count = ps.executeUpdate();
			System.out.println("count is "+ count);
			
			if(count>0) {
				message = "New Student Added successfully";
			}else {
				message = "Insert count was 0";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message = e.getMessage();
			e.printStackTrace();
		}
		return message;
		
	}

	@Override
	public void updateStudentProfile(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registration(Student student, Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Student, Course> viewAllRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewCourse(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Course> viewAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findCourseById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}