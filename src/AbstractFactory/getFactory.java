package AbstractFactory;
//��������
public class getFactory {
	//���ɺ���
	public static AbstractFactory getFactory(String choice) {
		//�ж�Ҫ���ɵĹ�������
		if(choice.equalsIgnoreCase("SHAPE")) {
			//��������
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		//���ؿ�
		return null;
	}
}
