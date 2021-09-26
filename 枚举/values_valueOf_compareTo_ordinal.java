package Enum_;

                                                           //枚举类型
/*
 * 操作枚举类型成员的方法：
 *      （1）values()：该方法可以将枚举类型成员以数组的形式返回    枚举类型名称.values()
 *      （2）valueOf()：该方法可以实现将普通字符串转换为枚举实例    枚举类型名称.valueOf("abc")
 *      （3）compareTo():该方法用于比较两个枚举对象在定义时的顺序     枚举对象.compareTo()
 *      （4）ordinal()：该方法用于得到枚举成员的位置索引     枚举对象.ordinal()
 *      
 *      
 * 注意：
 *        每一个枚举实例都是一个对象，不等于任何值。
 *    
 * 特点：
 *        类型安全、紧凑有效的数据定义、可以和程序其他部分完美交互、运行效率高。
 */

public class values_valueOf_compareTo_ordinal {
	
	enum Constants{     //将常量放置在枚举类型中
		Constants_A,Constants_B,Constants_C,Constants_D,liufang_E
	}
	
	
	
public static void main(String[] args) {
	
	System.out.println("使用了values()方法：");
	for(int i =0;i < Constants.values().length;i++) {   //使用values()方法以数组的形式返回
		
		System.out.println("枚举类型成员的值："+Constants.values()[i]);   //将枚举成员变量打印
		
	}
	
//	for(Constants tmp : enumArray) {
//		System.out.println("foreach输出：枚举类型成员的值："+tmp);
//	}
	
	
	
	
	System.out.println();
	System.out.println("使用了valuesOf()方法：");
	Constants c1 = Constants.Constants_A;
	
	 //比较的值要与枚举中的数值一样，否则会报错
	Constants c2 = Constants.valueOf("Constants_A");     //使用valuesOf()方法
	System.out.println("c1与c2是否相等："+(c1 == c2));
	
	
	
	
	System.out.println();
	System.out.println("使用了compareTo()方法：");
	Constants c3 = Constants.Constants_B;
	Constants array[] = Constants.values();
	
	for(int i = 0;i < array.length;i++) {
		//使用了compareTo()方法
		System.out.println(c3+"与"+array[i]+"的比较结果为："+c3.compareTo(array[i]));
	}
	
	
	
	
	System.out.println();
	System.out.println("使用了ordinal()方法：");
	Constants array1[] = Constants.values();
	for(int j = 0;j < array1.length;j++) {
		//使用了ordinal()方法
		System.out.println(array1[j]+"在枚举中的索引为："+array[j].ordinal());
	}
}
}
