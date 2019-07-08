package BuilderPattern;
//ʵ�ʽ����ײ͵�����
public class MealBuilder {
	//����һ������
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
