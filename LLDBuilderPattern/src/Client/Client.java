package Client;

import Director.Director;
import Student.StudentDetails;
import StudentBuilder.CSEStudent;
import StudentBuilder.MBAStudent;

/*
 * This class related to client or creation object 
 */
public class Client {
	
	
	public static void main(String[] arg ) { 
		 
		/*
		 *  Creating for MBA student 
		 *  
		 */
		Director director1 = new Director( new MBAStudent() );
		StudentDetails  MBAstudent = director1.createMBAStudent();
		System.out.println( MBAstudent );
		
		/*
		 * Creating for IT student 
		 * 
		 */
		Director director2 = new Director( new CSEStudent() );
		StudentDetails  CSEstudent = director2.createCSEStudent();
		System.out.println( CSEstudent );
		
     }

}
