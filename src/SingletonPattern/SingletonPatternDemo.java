package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//���Ϸ��Ĺ��캯��
		//SingleObject objec=new SingleObject();
		//��ȡΨһ���õĶ���
		SingleObject object=SingleObject.getInstance();
		//��ʾ��Ϣ
		object.showMessage();
	}
}
