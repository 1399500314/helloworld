package SingletonPattern;

public class SingleObject {
	//����SingleObject��һ������
	private static SingleObject instance=new SingleObject();
	//�ù��캯��private ����������Ͳ��ᱻʵ����
	private SingleObject() {};
	//��ȡΨһ���ö���
	public static SingleObject getInstance() {
		return instance;
	}
	//����һ����Ϣ����
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
