package 类和对象.txt;

                                            //静态常量！（final static关键字！）

/*应用：当需要在多个class类的构造方法（public 类名）中使用同一个常量值！
 * （如Π（3.1415925））
 *就可以使用final static关键字！ 
 */

public class ee {    //类ee    成员变量！
	
	final static double PI = 3.1415926535;   //使用静态常量赋值！
	
	public static void main(String[] args) {    //主方法！
		
		circular a = new circular(3.0);     //设置圆的半径！
		spherical b = new spherical(4.0);    //设置球的半径！
		//ee.PI = 1.1;   注意：在使用静态常量（final static）时，值不可以被改变！！
	}
}
	
	class circular{     //定义一个class类！
		double radius;
		double area;
		public circular(double radius) {     //定义一个带参数构造方法！
			this.radius = radius;    //将参数值赋予类中的成员变量！
			area = ee.PI *radius *radius;   //圆面积公式！
			System.out.println("圆的半径为："+radius);
			System.out.println("圆的面积为："+area);
		}
	}
	
	class spherical{    //定义一个class类！
		double radius;
		double valume;
		public spherical(double radius) {    //定义一个含参构造方法！
			this.radius = radius;   //将参数值赋予类中的成员变量！
			valume = 4/3 * ee.PI * radius * radius *radius;  //球面积公式！
			System.out.println("球半径为："+radius);
			System.out.println("球面积为："+valume);
		}
	
}
