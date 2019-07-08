package BuilderPattern;
//可乐实体
public class Coke extends ColdDrink{
	//名字
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}
	//价格
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
