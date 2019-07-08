package SingletonPattern;

//����ʽ �̰߳�ȫ
public class Singleton2 {
	//����һ����̬Singleton��ı���
	private static Singleton2 instance;
	//��ֹ�ⲿ����ʵ��
	private Singleton2() {};
	//����getInstance�������ж��嵥��
	public static synchronized Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}
