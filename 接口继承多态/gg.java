package 接口继承多态.txt;

                                                         //方法的重载！

public class gg {
	/*
	 * 方法重载的三种条件：
	 *                 （1）方法名相同，定义的类型不同。
	 *                 （2）方法名相同，定义的参数个数不同.
	 *                 （3）方法名相同，定义的参数顺序不同
	 */

	public static void main(String[] args) {
		System.out.println("第一种（方法名相同，定义的类型不同）：");
		System.out.println("调用int add(int a)方法："+add(1));
		System.out.println("调用double add(double b)方法："+add(1.2)+"\n");
		
		System.out.println("第二种（方法名相同，定义的参数个数不同）：");
		System.out.println("调用int add(int a)方法："+add(1));
		System.out.println("调用int add(inta,int b)方法："+add(12,15)+"\n");
		
		System.out.println("第三种（方法名相同，定义的参数顺序不同）：");
		System.out.println("调用double add(int a,double b)方法："+add(12,34.0));
		System.out.println("调用double add(double b,int a)方法："+add(13.5,12));

	}
	
	static int add(int a) {  //普通方法！
		return a;	
	}
	
	static double add(double b) {  //与int add(int a)定义的参数类型不同！
		return b;
	}
	
	static int add(int a,int b) {
		return a*b;
	}
	
	static double add(int a,double b) {  //与double add(double b)定义的方法参数个数不同！
		return a+ b;
	}
	
	static double add(double b,int a) {  //与double add(int a,double b)定义的参数顺序不同！
		return a-b;
	}

}
