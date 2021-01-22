package 接口继承多态.txt; 

                                    //object类（所有类的父类！！）

/*    重点：object类的三种常用方法:
 * （1）getClass()方法：返回对象执行时的Class实例。
 * （2）toString()方法：将对象返回为字符串形式。
 * （3）equals()方法：比较两个对象是否相等。
 */

public class cc {


	public static void main(String[] args) {
		Object[] arr = new Object[4];
		
		//Object类可以保存任何一个类的对象！
		arr[0] = new Object();
		arr[1] = new String("字符串");
		arr[2] = new Integer(10);
		arr[3] = new cc();
		
		System.out.println("使用getClass()方法：");
		for(Object obj :arr) {
			System.out.println(obj.getClass());
		}
		System.out.println();
		
		System.out.println("使用toString()方法：");
		for(Object obj :arr) {
			System.out.println(obj.toString());
		}
		System.out.println();
		
		System.out.println("使用equals()方法：");
		System.out.println(arr[0].equals(arr[3]));
		
	}
	public String toString() {
		return "我是cc类！";
		
	}
	

}
