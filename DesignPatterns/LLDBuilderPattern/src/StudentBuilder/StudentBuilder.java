package StudentBuilder;

import java.util.List;

import Student.StudentDetails;

/*
 *  This is builder to student class.
 *  It acts intermediates between Director and student
 *  
 *  Setter's are return current Instance 
 *  
 */
abstract public class StudentBuilder {
	 private  String name ; 
	 private int rollNo ; 
	 private String motherName ; 
	 private String fatherName ; 
	 protected List<String> subjects ; 
	 
	 private String mobileNo ;
	  
	 public StudentBuilder() {
		 
	 }
	 public StudentBuilder setName(String name ) {
		 this.name =name ;
		 return this;
	 }
	 
	 public StudentBuilder setRollNo( int rollNo ) {
		 this.rollNo = rollNo ; 
		 return this ; 
	 }
	 
	 public StudentBuilder setMotherName( String motherName ) {
		 this.motherName = motherName ; 
		 return this ; 
	 }
	 
	 public StudentBuilder setFatherName( String fatherName ) {
		 this.fatherName = fatherName ; 
		 return this ; 
	 }
	 public StudentBuilder setMobileNo  ( String mobileNo ) {
		 this.mobileNo  = mobileNo ; 
		 return this ; 
	 }
	 
	 public abstract StudentBuilder setSubjects( );
	 
	 
	 
	 
	 public StudentDetails  build() {
		 return new StudentDetails( this );
	 }
	 
	 
	 
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getMotherName() {
		return motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	 
	 
	 
	 
	 

}
