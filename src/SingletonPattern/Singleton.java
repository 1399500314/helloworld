package SingletonPattern;

public class Singleton {
	//定义一个静态Singleton类的变量
	private static Singleton instance;
	//阻止外部进行实例
	private Singleton() {};
	//定义getInstance函数进行定义单例
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}
