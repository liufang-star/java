package 包装类;

                                         //整数类型Integer（包装类）的使用方法！

public class aa {
	
	/*Integer类的两种构造方法：
	 *            （1）Integer (int number)       ：   以一个int型变量为参数来获取Integer对象！
	 *                    实例：Integer number = new Integer(7);
	 *                    
	 *           （2）Integer(String str)   :    以一个String型变量为参数来获取Integer对象！
	 *                    实例：Integer number = new Integer("45");
	 */

	public static void main(String[] args) {
		
		System.out.println("int类型的最大值（max_value）为："+Integer.MAX_VALUE);
		System.out.println("int类型的最小值（min_value）为："+Integer.MIN_VALUE);
		System.out.println("int类型的长度（size）为："+Integer.SIZE);
		System.out.println("int类型的返回类型（type）为："+Integer.TYPE);
		System.out.println();
		
		System.out.println("通过实例化对象创建两种不同类型的对象：");
		Integer inte1 = new Integer(123);
		System.out.println("以int型变量为参数来获取Integer对象为："+inte1);
		Integer inte2 = new Integer("123456789");
		System.out.println("以String型变量为参数来获取Integer对象为："+inte2);
		Integer inte3 = Integer.valueOf("987654321"); //valueOf方法可以是int型变量也可以是String型变量！
		System.out.println("使用valueOf方法获取Integer对象为："+inte3);
		System.out.println();
		
		int num1 = Integer.parseInt("789");   //parseInt(String s): 返回用十进制参数表示的整数值。
		System.out.println("使用parseInt方法返回十进制整数值为："+num1);
		int num2 = inte2.intValue();//intValue()是java.lang.Number类的方法。
		System.out.println("使用intvalue方法返回inte2的值为："+num2);   //可以进行运算，例如：+（num2-10）
		System.out.println();
		
		String str1 = Integer.toBinaryString(11);     //toBinaryString方法返回一个二进制数！！
		System.out.println("11的二进制表示为（使用toBinaryString方法）："+str1);
		String str2 = Integer.toHexString(11);  //toHexString方法返回一个16进制数！！
		System.out.println("11的十六进制表示为（使用toHexString方法）："+str2);
		String str3 = Integer.toOctalString(11);  //toOctalString方法返回一个8进制数！！
		System.out.println("11的八进制表示为（使用toOctalString方法）："+str3);
		String str4 = Integer.toString(1111,15);   //自己选择数字和转换的进制数！
		     //toString(1111,15)表示：将数字1111转换成15进制数！！
		System.out.println("1111转换成15进制数表示为（使用toString方法）："+str4);
		

	}

}
