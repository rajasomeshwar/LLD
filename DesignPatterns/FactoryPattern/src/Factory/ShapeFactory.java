package Factory;

import Shape.Shape;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Triangle;

/*
 *  This calss used to get shape based on condition 
 *  
 */
public class ShapeFactory {
     
	public Shape getShape( String type ) {
		
		switch( type ) {
		case "CIRCLE" : return new Circle();
		case "RECTANGLE" : return new Rectangle() ;
		case "Triangle" : return new Triangle() ;
		default : return new Circle(); 
		}
	}
}
