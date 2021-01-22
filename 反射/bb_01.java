package ∑¥…‰.txt;

public class bb_01 {
	int id;
	String name;
	double price;

	public bb_01() {
		super();
	}
	public bb_01(int id) {
		super();
		this.id = id;
	}

	private bb_01(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "bb_01 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public static void main(String[] args) {

	}

}
