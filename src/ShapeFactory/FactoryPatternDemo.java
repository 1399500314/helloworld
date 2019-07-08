package ShapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// 实例工厂
		ShapeFactory shapeFatroy = new ShapeFactory();
		// 获取Circle的对象，并调用它的draw 方法
		Shape shape1 = shapeFatroy.getShape("CIRCLE");
		// 调用方法
		shape1.draw();
		// 获取Rectangle的对象，并调用它的draw 方法
		Shape shape2 = shapeFatroy.getShape("RECTANGLE");
		// 调用方法
		shape2.draw();

		// 获取Square的对象，并调用它的draw 方法
		Shape shape3 = shapeFatroy.getShape("SQUARE");
		// 调用方法
		shape3.draw();
	}
}
