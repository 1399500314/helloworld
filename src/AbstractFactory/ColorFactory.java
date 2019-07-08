package AbstractFactory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Color;

public class ColorFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		//对类型进行判断
		if(shapeType==null) {
			return null;
		}
		//是否是CIRCLE类型
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		//都没返回类型时，返回null
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color==null) {
			return null;
		}
		//是否是red类型
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		//都没返回类型时，返回null
		return null;
	}

	
}
