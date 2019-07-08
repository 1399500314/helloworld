package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	//定义一个商品列表集合
	private List<Item> items=new ArrayList<Item>();
	//添加功能
	public void addItem(Item item) {
		items.add(item);
	}
	//商品的价格计算
	public float getCost() {
		float cost=0.0f;
		//增强for循环进行计算
		for(Item item:items) {
			cost+=item.price();
		}
		return cost;
	}
	//商品信息的展示
	public void showItem() {
		for(Item item:items) {
			System.out.println("Item:"+item.name());
			System.out.println(",Packing:"+item.packing().pack());
			System.out.println(",Price:"+item.price());
		}
	}
}
