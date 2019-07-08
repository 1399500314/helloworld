package AbstractFactory;

//实际运用的demo
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// 获取对应工厂
		AbstractFactory shapeFactory = getFactory.getFactory("SHAPE");
		// 获取对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// 调用draw方法
		shape1.draw();
		// 获取对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		// 调用draw方法
		shape2.draw();
		// 获取对象
		Shape shape3 = shapeFactory.getShape("SQUARE");
		// 调用draw方法
		shape3.draw();
		// 获取color工厂
		AbstractFactory colorFactory = getFactory.getFactory("COLOR");
		// 获取对象
		Color color1 = colorFactory.getColor("RED");
		// 调用fill方法
		color1.fill();
		// 获取对象
		Color color2 = colorFactory.getColor("Green");
		// 调用fill方法
		color2.fill();
		// 获取对象
		Color color3 = colorFactory.getColor("BLUE");
		// 调用fill方法
		color3.fill();
	}
}
