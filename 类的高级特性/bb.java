package 类的高级特性.txt;

import static java.lang.System.out;
import java.util.Random;

                                          //final变量！

/*
 * 注意：
 *    在java中定义全局常量，通常使用public static final修饰，这样的常量只能在定义时被赋值！
 */

public class bb {
	private static Random rand = new Random();   //实例化一个Random类对象！
	
	//随机产生0~10之间的随机数，赋予定义为final的a1
	private final  int a1 = rand.nextInt(10);
	
	//随机产生0~10之间的随机数，赋予定义为static final 的a2
	private static final int a2 = rand.nextInt(10);
	
	public static void main(String[] args) {
		
		bb fdata = new bb();    //实例化一个对象！
		out.println("实例化对象调用a1的值（final）为："+fdata.a1);//调用定义为final的a1
		out.println("实例化对象调用a2的值为（static final）："+fdata.a2);//调用定义为static final的a2
		
		
		bb fdata2 = new bb();   //实例化另一个对象！
		out.println("重新实例化对象调用a1的值（final）为："+fdata2.a1);//调用定义为final的a1
		out.println("重新实例化对象调用a2的值（static final）为："+fdata2.a2);//调用定义为static final的a2
	}

}


