package BuilderPattern;
//实际进行套餐的配置
public class MealBuilder {
	//可乐一个汉堡
	public Meal preparVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new VagBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
