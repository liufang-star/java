package 包装类;

                                    //字符类型character（包装类）的使用方法！

public class dd {
	
	/*character类的两种构造方法：
	 *                 （1）Character(char value);
	 *                 
	 *                 （2）Character mychar = new Character('s');
	 */

	public static void main(String[] args) {
		Character c = new Character('a');
		System.out.println("字符："+c);
		System.out.println();
		System.out.println("是大写字母吗（使用isUpperCase方法）？"+Character.isUpperCase(c));
		System.out.println("是小写字母吗（使用isLowerCase方法）？"+Character.isLowerCase(c));
		System.out.println();
		
		System.out.println("转换成大写的结果为（使用toUpperCase方法）："+Character.toUpperCase(c));
		System.out.println("转换成小写的结果为（使用toLowerCase方法）："+Character.toLowerCase(c));
		System.out.println();
		
		System.out.println("这个字符是字母吗（使用isLetter方法）？"+Character.isLetter(c));
		System.out.println("这个字符是数字吗（使用isDigit方法）？"+Character.isDigit(c));

	}

}
