package SingletonPattern;

//双捡锁/双重校验锁  线程安全
public class Singleton4 {
	//实例化
	private static Singleton4 singleton;
	//阻止外部进行实例
	private Singleton4() {};
	//定义getInstance函数进行定义单例
	public static Singleton4 getInstance() {
		//进行判断singleton是否为空
				if(singleton==null) {
					//同步操作
					synchronized(Singleton.class) {
						//再次判断
						if(singleton==null) {
							//创建实例化
						singleton=new Singleton4();
						}
					}
				}
				//返回
			return singleton;
	}
}
