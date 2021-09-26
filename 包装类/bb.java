package 包装类;

                               //布尔类型Boolean（包装类）的使用方法！

public class bb {
	
/*Boolean类的两种构造方法：
 *               （1）Boolean(boolean value)  ：  创建一个表示value参数的Boolean对象！
 *                                 实例：Boolean b = new Boolean(ture);
 *                                 
 *               （2）Boolean(String str)  :  以String变量作为参数创建Boolean对象！
 *                                 实例：Boolean bool = new Boolean("ok");
 */
	

	public static void main(String[] args) {
		System.out.println("Boolean类型的假："+Boolean.FALSE);
		System.out.println("Boolean类型的真："+Boolean.TRUE);
		System.out.println("布尔类型的返回值类型："+Boolean.TYPE);
		System.out.println();
		
		Boolean b1 = Boolean.valueOf(true);  //返回true！
		Boolean b2  = Boolean.valueOf("     ");  //如果值不是true，默认为false。！
		System.out.println("Boolean类型的返回值（b1）为："+b1);
		System.out.println("Boolean类型的返回值（b2）为："+b2);
		System.out.println();
		
		boolean bool = Boolean.parseBoolean("ok");    //parseBoolean表示返回boolean基本类型值！
		if(bool) {
			System.out.println("Bool为真！");
		}else {
			System.out.println("Bool为假！");
		}

	}

}
