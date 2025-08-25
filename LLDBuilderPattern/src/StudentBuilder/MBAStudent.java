package StudentBuilder;

import java.util.ArrayList;
import java.util.List;

/*
 *  this class related to MBA student 
 *  only implements subjects 
 *  
 */
public class MBAStudent  extends StudentBuilder {

	@Override
	public
	StudentBuilder setSubjects() {
		
		List<String > subjects = new ArrayList<>();
		 subjects.add("Economics");
		 subjects.add("MEFA");
		 subjects.add("English");
		 this.subjects = subjects ; 
		return this; 
	}
	
      
}
