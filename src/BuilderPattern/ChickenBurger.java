package BuilderPattern;
//汉堡的包装
public class ChickenBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chinken Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}
	//包装的功能
	
}
