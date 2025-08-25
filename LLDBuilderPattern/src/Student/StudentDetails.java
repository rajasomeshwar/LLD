package Student;

import java.util.List;

import StudentBuilder.StudentBuilder;

/*
 *  It tells about the Details of Student 
 *   
 *   Roll Number is mandatory 
 *   rest of all are optional 
 *   
 *   This will have only getter no Setter due restriction of class No one will not creates it. 
 */
public class StudentDetails {
  
	 private  String name ; 
	 private int rollNo ; 
	 private String motherName ; 
	 private String fatherName ; 
	 private List<String> subjects ; 
	 
	 private String mobileNo ;

	public StudentDetails(StudentBuilder studentBuilder) {
		// TODO Auto-generated constructor stub
		this.name = studentBuilder.getName();
		this.rollNo = studentBuilder.getRollNo();
		this.motherName = studentBuilder.getMotherName();
		this.fatherName = studentBuilder.getFatherName();
		this.subjects  = studentBuilder.getSubjects();
		this.mobileNo = studentBuilder.getMobileNo();
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
 
	
	
	  
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", rollNo=" + rollNo + ", motherName=" + motherName + ", fatherName="
				+ fatherName + ", subjects=" + subjects + ", mobileNo=" + mobileNo + "]";
	} 
	 
	 
	 
}
