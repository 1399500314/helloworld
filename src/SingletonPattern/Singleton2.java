package SingletonPattern;

//懒汉式 线程安全
public class Singleton2 {
	//定义一个静态Singleton类的变量
	private static Singleton2 instance;
	//阻止外部进行实例
	private Singleton2() {};
	//定义getInstance函数进行定义单例
	public static synchronized Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}
