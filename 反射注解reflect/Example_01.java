package reflect_;

public class Example_01 {
	int id;
	String name;
	double price;
	
	public Example_01() {   ///����һ���޲εĹ��췽��
		
		super();
		
	}

	@Override
	public String toString() {    //����һ�� toString������
		return "Example_01 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Example_01(int id) {     //����һ���вεĹ��췽��
		
		super();
		this.id = id;
		
	}

	private Example_01(int id, String name, double price) {     //�����������ε�˽�й��췽����
		
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	};
	
	
	

}
