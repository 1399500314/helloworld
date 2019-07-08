package AbstractFactory;
//生成器类
public class getFactory {
	//生成函数
	public static AbstractFactory getFactory(String choice) {
		//判断要生成的工厂类型
		if(choice.equalsIgnoreCase("SHAPE")) {
			//返回生成
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		//返回空
		return null;
	}
}
