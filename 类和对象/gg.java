package 类和对象.txt;

                                           //对象！

public class gg {     //成员变量！
	String name = "西游记";
	public String getname() {    //成员方法！
		return name;
	}
	public gg() {    //构造方法！
		System.out.println("创建对象！");
	}

	public static void main(String[] args) {
		
		gg a = new gg();
/*注意：gg 表示 类（类名）；a 表示引用（对象）；new gg() 对象的实体（创建对象操作符）！*/
		
		System.out.println(a.getname());
		System.out.println(new gg().getname());
		new gg();

	}

}
