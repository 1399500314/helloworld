package SingletonPattern;

//����ʽ �̰߳�ȫ
public class Singleton3 {
	//����һ����̬Singleton��ı���
	private static Singleton3 instance;
	//��ֹ�ⲿ����ʵ��
	private Singleton3() {};
	//����getInstance�������ж��嵥��
	public static Singleton3 getInstance() {
		return instance;
	}
	//ȱ�������ʱ�ͳ�ʼ�����˷��ڴ�
	//ִ��Ч�ʸ�
}
