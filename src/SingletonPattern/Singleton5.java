package SingletonPattern;

//��¼ʽ/��̬�ڲ���
public class Singleton5 {
	//����һ��ʵ��������
	private static class singletonHolder{
		//ֱ�ӽ��о�̬ʵ����
		private static final Singleton5 instance=new Singleton5();
	};
	
	//��ֹ�ⲿ����ʵ��
	private Singleton5() {};
	//����getInstance�������ж��嵥��
	public static final Singleton5 getInstance() {
			return singletonHolder.instance;
		
	}
}
