package SingletonPattern;

//登录式/静态内部类
public class Singleton5 {
	//定义一个实例化的类
	private static class singletonHolder{
		//直接进行静态实例化
		private static final Singleton5 instance=new Singleton5();
	};
	
	//阻止外部进行实例
	private Singleton5() {};
	//定义getInstance函数进行定义单例
	public static final Singleton5 getInstance() {
			return singletonHolder.instance;
		
	}
}
