package 包装类;

                        //小数类型Double（包装类）的使用方法！

public class ee {
	/*Double类的两种构造方法：
	 *               （1）Double(double value)  :  基于double参数创建Double类对象！
	 *               
	 *               （2）Double(String str)  :  构造一个新分配的Double对象，
	 *                                                           表示用字符串表示的double类型的浮点值！
	 */

	public static void main(String[] args) {
		System.out.println("double类型的最大值为（max_value）："+Double.MAX_VALUE);
		System.out.println("double类型的最小值为（min_value）："+Double.MIN_VALUE);
		System.out.println("double类型的长度为（size）："+Double.SIZE);
		System.out.println("double类型的返回值类型为（type）："+Double.TYPE);
		System.out.println();
		
		Double num1 = new Double(11.23);
		Double num2 = new Double("45.56");
		System.out.println("Double类型数值为："+num1);
		System.out.println("String类型转换成Double类型的数值为："+num2);
		System.out.println();
		
		Double num3 = Double.valueOf("78.89");
		System.out.println("使用valueOf方法赋值的数值为："+num3);
		System.out.println();
			
		System.out.println(num1+"是否是非数字："+Double.isNaN(num1.doubleValue()));
		System.out.println(num3+"转换成int值为："+num3.intValue());
		System.out.println(num2+"的十六进制表示为："+Double.toHexString(num2.doubleValue()));
		System.out.println(num3+"的十六进制表示为："+Double.toHexString(num3.doubleValue()));


	}

}
