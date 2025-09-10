package Running;



import Factory.ShapeFactory;
import Shape.Shape;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShapeFactory shapeFactory = new ShapeFactory() ;
		 
		 
		  // creating for circle 
		 Shape shape1 = shapeFactory.getShape("CIRCLE");
		  
		 shape1.draw();
	  // creating for rectangle
		 Shape shape2 = shapeFactory.getShape("RECTANGLE");
		 shape2.draw();
		 
	}

}
