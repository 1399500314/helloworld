package BuilderPattern;
//汉堡的包装
public abstract class Burger implements Item{
	//包装的功能
	@Override
	public Packing packing() {
		return new Wrapper();
		
	}
	//价格
	@Override
	public abstract float price();
}
