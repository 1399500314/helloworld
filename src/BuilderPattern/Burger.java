package BuilderPattern;
//�����İ�װ
public abstract class Burger implements Item{
	//��װ�Ĺ���
	@Override
	public Packing packing() {
		return new Wrapper();
		
	}
	//�۸�
	@Override
	public abstract float price();
}
