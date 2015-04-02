
public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[10];
		
		for( int i = 0; i < shapeArray.length; i++ ) {
			if(i % 2 == 0 ) 
				shapeArray[i] = new Square();
			else 
				shapeArray[i] = new Circle();
		}
		
		for( int i = 0; i < shapeArray.length; i++ ) {
			Shape obj = shapeArray[i];
			obj.printShape();
		}
	}

}
