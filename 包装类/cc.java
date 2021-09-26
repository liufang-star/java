package 包装类;

                                //Byte类型byte（包装类）的使用方法！

public class cc {
	/*Byte类的两种构造方法：
	 *           （1）Byte(byte value)  :  创建Byte对象，可表示指定的byte对象！
	 *                             实例：byte mybyte  =45;
	 *                                        Byte b = new Byte(mybyte);
	 *                                        
	 *           （2）Byte(String str)  :  创建Byte对象，可表示String参数所指示的byte值！
	 *                             实例：Byte mybyte = new Byte("12");
	 */

	public static void main(String[] args) {
		
		System.out.println("byte类型的最大值（max_value）为："+Byte.MAX_VALUE);
		System.out.println("byte类型的最小值（min_value）为："+Byte.MIN_VALUE);
		System.out.println("byte类型的长度（size）为："+Byte.SIZE);
		System.out.println("byte类型的返回类型（type）为："+Byte.TYPE);
		System.out.println();
		
		byte b =15;
		Byte b1 = new Byte(b);    //创建对象！赋值给b！
		Byte b2 = Byte.valueOf(b);   //返回一个保持指定String所给出的值的Byte对象！
		System.out.println("使用创建对象方法获取b1的值为："+b1);
		System.out.println("使用valueOf方法获取b2的值为："+b2);
		System.out.println("两种方法的结果是否相等？："+b1.equals(b2));
		System.out.println();
		
		Byte b3 = Byte.valueOf("50");   //通过以string类型50转换成byte类型输出！
		System.out.println("使用valueOf方法进行赋值（b3）为："+b3);
		System.out.println();
		
		String s = "100";
		byte b4 = Byte.valueOf(s).byteValue();   //将字符串类型转换成byte类型！
		byte b5 = Byte.parseByte(s);     //parseByte返回byte基本类型！
		System.out.println("b4的值为："+b4);
		System.out.println("使用valueOf(s).byteValue()和 parseByte(s)判断是否相等？："+(b4 == b5));

	}

}
