package SingletonPattern;

//饿汉式 线程安全
public class Singleton3 {
	//定义一个静态Singleton类的变量
	private static Singleton3 instance;
	//阻止外部进行实例
	private Singleton3() {};
	//定义getInstance函数进行定义单例
	public static Singleton3 getInstance() {
		return instance;
	}
	//缺点类加载时就初始化，浪费内存
	//执行效率高
}
