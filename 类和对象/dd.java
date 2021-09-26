package 类和对象.txt;

                                    //静态变量与非静态变量的区别！

/*区别：静态变量是共享的。（a.x和b.x的值一样！而a.y和b.y的值不一样！）
 * x的值是静态的，而y的值是非静态的！
 * x（静态）指向的是同一块区域，而y（非静态）指向的是不同区域！
 * 所以静态值前后一样！而非静态的值是互不干扰的！
*/

public class dd {     //类名dd   成员变量！
	
	static int x;     //定义一个int型静态变量x。
	
	int y;    //定义一个非静态变量int y。
	
	public dd(int x,int y) {      //定义一个构造方法！与类名的名称相同！
		this.x = x;    //将参数值赋予类中的成员变量！（static int x）
		this.y = y;   //将参数值赋予类中的成员变量！（int y）
		
	}
	public static void main(String[] args) {
		dd a = new dd(1,2);
		dd b = new dd(13,17);
		
		System.out.println("a.x的值为："+a.x);
		System.out.println("a.y的值为："+a.y);
		
		System.out.println("b.x的值为："+b.x);
		System.out.println("b.y的值为："+b.y);
		
	}

}
