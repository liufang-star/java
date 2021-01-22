package 接口继承多态.txt;

                                 //object类中的equals()方法的使用！！

/*
 * 注意：equals()方法的默认实现是使用“==”运算符比较两个对象的引用地址，
 *            而不是比较对象的内容！
 */

public class dd {

	public static void main(String[] args) {
		dd_Person p1 = new dd_Person();
		dd_Person p2 = new dd_Person();
		dd_Person p3 = new dd_Person();
		
		p1.name = "小明";
		p1.id = "123";
		
		p2.name = "小红";
		p2.id = "123";
		
		p3.name = "小明";
		p3.id = "123";
		System.out.println("使用equals()方法进行比较：");
		System.out.println("p1和p2比较："+p1.equals(p2));
		System.out.println("p1和p3比较："+p1.equals(p3));
		System.out.println("p2和p3比较："+p2.equals(p3));

	}

}
