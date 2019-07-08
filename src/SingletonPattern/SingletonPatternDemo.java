package SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//不合法的构造函数
		//SingleObject objec=new SingleObject();
		//获取唯一可用的对象
		SingleObject object=SingleObject.getInstance();
		//显示消息
		object.showMessage();
	}
}
