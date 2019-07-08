package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	//����һ����Ʒ�б���
	private List<Item> items=new ArrayList<Item>();
	//��ӹ���
	public void addItem(Item item) {
		items.add(item);
	}
	//��Ʒ�ļ۸����
	public float getCost() {
		float cost=0.0f;
		//��ǿforѭ�����м���
		for(Item item:items) {
			cost+=item.price();
		}
		return cost;
	}
	//��Ʒ��Ϣ��չʾ
	public void showItem() {
		for(Item item:items) {
			System.out.println("Item:"+item.name());
			System.out.println(",Packing:"+item.packing().pack());
			System.out.println(",Price:"+item.price());
		}
	}
}
