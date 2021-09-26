package reflect_;

public class Example_01 {
	int id;
	String name;
	double price;
	
	public Example_01() {   ///创建一个无参的构造方法
		
		super();
		
	}

	@Override
	public String toString() {    //创建一个 toString方法！
		return "Example_01 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Example_01(int id) {     //创建一个有参的构造方法
		
		super();
		this.id = id;
		
	}

	private Example_01(int id, String name, double price) {     //创建三个含参的私有构造方法！
		
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	};
	
	
	

}
