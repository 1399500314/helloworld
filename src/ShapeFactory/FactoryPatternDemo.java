package ShapeFactory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// ʵ������
		ShapeFactory shapeFatroy = new ShapeFactory();
		// ��ȡCircle�Ķ��󣬲���������draw ����
		Shape shape1 = shapeFatroy.getShape("CIRCLE");
		// ���÷���
		shape1.draw();
		// ��ȡRectangle�Ķ��󣬲���������draw ����
		Shape shape2 = shapeFatroy.getShape("RECTANGLE");
		// ���÷���
		shape2.draw();

		// ��ȡSquare�Ķ��󣬲���������draw ����
		Shape shape3 = shapeFatroy.getShape("SQUARE");
		// ���÷���
		shape3.draw();
	}
}
