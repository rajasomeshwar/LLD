package Director;

import Student.StudentDetails;
import StudentBuilder.StudentBuilder;

/*
 *  This class is used for creating an specific object with defined order 
 *  
 */
public class Director {
	  
	   
	public  StudentBuilder builder ; 
	 
	  public Director( StudentBuilder builder ) {
		  this.builder = builder ; 
	  }
          
	 public StudentDetails createMBAStudent( ) {
	     
		return builder.setName("Ram").setFatherName("Raju").setRollNo(1).setSubjects().build();
	 }
	 public StudentDetails createCSEStudent() { 
		  return builder.setName("Shashi").setMotherName("Depika").setRollNo(2).setSubjects().build();
	 }
}
