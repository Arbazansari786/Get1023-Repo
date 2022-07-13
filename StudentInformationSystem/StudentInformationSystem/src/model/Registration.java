package model;

import java.time.LocalDate;

public class Registration {
	private int registrationId;
	private LocalDate registrationDate;
	private int courseid;
	private int rollNo;
	
	public Registration() {}

	public Registration(LocalDate registrationDate, int courseid, int rollNo) {
		super();
		this.registrationDate = registrationDate;
		this.courseid = courseid;
		this.rollNo = rollNo;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRegistrationId() {
		return registrationId;
	}
	
}
