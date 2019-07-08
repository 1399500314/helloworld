package AbstractFactory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Color;

public class ColorFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		//�����ͽ����ж�
		if(shapeType==null) {
			return null;
		}
		//�Ƿ���CIRCLE����
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		//��û��������ʱ������null
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color==null) {
			return null;
		}
		//�Ƿ���red����
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		//��û��������ʱ������null
		return null;
	}

	
}
