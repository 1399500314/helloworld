package SingletonPattern;

//˫����/˫��У����  �̰߳�ȫ
public class Singleton4 {
	//ʵ����
	private static Singleton4 singleton;
	//��ֹ�ⲿ����ʵ��
	private Singleton4() {};
	//����getInstance�������ж��嵥��
	public static Singleton4 getInstance() {
		//�����ж�singleton�Ƿ�Ϊ��
				if(singleton==null) {
					//ͬ������
					synchronized(Singleton.class) {
						//�ٴ��ж�
						if(singleton==null) {
							//����ʵ����
						singleton=new Singleton4();
						}
					}
				}
				//����
			return singleton;
	}
}
