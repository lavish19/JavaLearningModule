
public interface Shape {
void draw();
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("inside rectangle :: draw() method");
		
	}
}
class Square implements Shape{
	public void draw() {
		
	
	System.out.println("inside square :: draw() method ");
}}
class Circle implements Shape{
	public void draw() {
		System.out.println("insode circle :: draw() method");
	}
}
 class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}
	
}
class FactoryPatternDemo{
	public static void main(String[] args) {
		ShapeFactory shapefactory=new ShapeFactory();
		Shape shape1=shapefactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2=shapefactory.getShape("CIRCLE");
		shape2.draw();
		Shape shape3=shapefactory.getShape("SQUARE");
		shape3.draw();
		
	}
}
