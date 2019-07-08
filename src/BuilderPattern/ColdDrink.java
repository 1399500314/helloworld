package BuilderPattern;
//可乐的包装
public abstract class ColdDrink implements Item{
	//包装的功能
	@Override
	public Packing packing() {
		return new Bottle();
		
	}
	//价格
	@Override
	public abstract float price();
}
