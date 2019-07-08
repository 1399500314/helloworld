package SingletonPattern;

public class Singleton {
	//����һ����̬Singleton��ı���
	private static Singleton instance;
	//��ֹ�ⲿ����ʵ��
	private Singleton() {};
	//����getInstance�������ж��嵥��
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}
