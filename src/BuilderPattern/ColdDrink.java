package BuilderPattern;
//���ֵİ�װ
public abstract class ColdDrink implements Item{
	//��װ�Ĺ���
	@Override
	public Packing packing() {
		return new Bottle();
		
	}
	//�۸�
	@Override
	public abstract float price();
}
