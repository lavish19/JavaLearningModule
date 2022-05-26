
public interface Shape {
void draw();
}
class RoundedRectangle implements Shape{
	public void draw(){
		System.out.println("inside roundedrectangle :: draw()method");
	}
}
class RoundedSquare implements Shape{
	public void draw() {
		System.out.println("inside roundedsquare :: draw()method");
		
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("inside rectangle :: draw()method");
		
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("inside square :: draw()method");
	}
}
abstract class AbstractFactory{
	abstract Shape getShape(String shapeType);
}
class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
class RoundedShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
			
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
	
	return null;
}}
class FactoryProducer{
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		}
		else 
			return new ShapeFactory();
	}
}
class AbstarctFactoryPatternDemo{
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory(false);
		Shape shape1=shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("SQUARE");
		shape2.draw();
		AbstractFactory shapeFactory1=FactoryProducer.getFactory(true);
		Shape shape3=shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		Shape shape4=shapeFactory1.getShape("SQUARE");
		shape4.draw();
		
	}
}