package 类的高级特性.txt;

import java.util.Random;
import static java.lang.System.out;   //导入静态成员变量！

                                              //final变量！！

/*
 * 注意：
 *        （1）final关键字定义的变量必须在声明时进行赋值操作！
 *        
 *        （2）一旦一个对象引用被修饰为final后，它只能恒定指向一个对象，无法改变指向另一个对象！
 *        
 *        （3）在java中定义全局常量，通常使用public static final修饰，这样的常量只能在定义时被赋值！
 *        
 *        （4）定义为final的类不能被继承！
 *        
 *        （5）
 */

class Test{
	int i = 0;
}
public class aa {
	
	static Random rand = new Random();
//	private final int VALUE_1 = 9;    //声明一个final常量！
//	private static final int VALUE_2 = 10;  //声明一个final、static常量！
	private final Test test = new Test();  //声明一个final引用！
	private Test test2 = new Test();  //声明一个不是final的引用！
	private final static  int[] a = {1,2,3,4,5,6};  //声明一个定义为final的数组！
	private final int i4 = rand.nextInt(20);
	private final int i5 = rand.nextInt(20);
	
	public String toString() {    //重写Object中的toString()方法！
		return i4 + " 和 "+i5 + "";    //返回代表线程的字符串！
		
	}
	
	public static  void main(String[] args) {
		
		aa data = new aa();
		
//		data.test = new Test();
		//可以对指定为final的引用中的成员变量赋值！
		//但不能将定义为final的引用指向其他引用！
		
//		data.value2++;
		//不能改变定义为final的常量值！
		
		data.test2 = new Test();
		
		for(int i = 0;i < data.a.length;i++) {
			a[i] = 9;
			//不能对定义为final的数组赋值！
		}
		
		out.println(data);
		out.println("data2");
		out.println(new aa());

	}

}
