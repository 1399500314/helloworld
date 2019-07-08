package AbstractFactory;

//ʵ�����õ�demo
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// ��ȡ��Ӧ����
		AbstractFactory shapeFactory = getFactory.getFactory("SHAPE");
		// ��ȡ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// ����draw����
		shape1.draw();
		// ��ȡ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		// ����draw����
		shape2.draw();
		// ��ȡ����
		Shape shape3 = shapeFactory.getShape("SQUARE");
		// ����draw����
		shape3.draw();
		// ��ȡcolor����
		AbstractFactory colorFactory = getFactory.getFactory("COLOR");
		// ��ȡ����
		Color color1 = colorFactory.getColor("RED");
		// ����fill����
		color1.fill();
		// ��ȡ����
		Color color2 = colorFactory.getColor("Green");
		// ����fill����
		color2.fill();
		// ��ȡ����
		Color color3 = colorFactory.getColor("BLUE");
		// ����fill����
		color3.fill();
	}
}
