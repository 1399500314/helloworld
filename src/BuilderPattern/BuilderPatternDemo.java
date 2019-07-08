package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		//ʵ��һ���ײʹ���
		MealBuilder mealBuilder=new MealBuilder();
		//���õ�һ����
		Meal verMeal=mealBuilder.preparVegMeal();
		System.out.println("Veg Meal");
		//����۸�
		verMeal.showItem();
		System.out.println("Total Cost:" +verMeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total Cost:" +nonVegMeal.getCost());
	}
}
