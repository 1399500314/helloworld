package BuilderPattern;
//实体定义价格和名字
public  class VagBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
