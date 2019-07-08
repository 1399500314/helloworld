package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		//实例一个套餐搭配
		MealBuilder mealBuilder=new MealBuilder();
		//配置第一个餐
		Meal verMeal=mealBuilder.preparVegMeal();
		System.out.println("Veg Meal");
		//计算价格
		verMeal.showItem();
		System.out.println("Total Cost:" +verMeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total Cost:" +nonVegMeal.getCost());
	}
}
