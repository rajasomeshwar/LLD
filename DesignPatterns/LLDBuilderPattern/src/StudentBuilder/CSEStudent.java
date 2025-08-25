package StudentBuilder;

import java.util.ArrayList;
import java.util.List;

/*
 *  this Class is related to CSE Student 
 *   
 */
public class CSEStudent extends StudentBuilder   {

	@Override
	public
	StudentBuilder setSubjects() {
		// TODO Auto-generated method stub
		List<String> subjects = new ArrayList<>();
		subjects.add("DSA");
		subjects.add("Java");
		subjects.add("DAA");
		subjects.add("ML");
		this.subjects = subjects ; 
		return this ; 
	}
    
}
