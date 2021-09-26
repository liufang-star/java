package 类的高级特性.txt;

                                                           //成员内部类！

/*
 * 概念：
 *          在类体里面定义一个类，这个类就是内部类！
 *          
 * 作用：
 *          数据安全。
 *          如果我们的内部类不想轻易被任何人访问，可以选择使用private修饰内部类，
 *          这样我们就无法通过创建对象的途径来访问，
 *          想要访问只需要在外部类中定义一个public修饰的方法，
 *          间接调用。这样做的好处就是，
 *          我们可以在这个public方法中增加一些判断语句，起到数据安全的作用。
 *      
 *  注意事项：
 *               （1）在成员外部不能直接调用内部变量；如果要调用，需要创建实例化对象！
 */
public class dd {
	
	innerClass in = new innerClass();  //在成员内部类所在的外类中实例化成员内部类！
	
	public void outf() {
//		inf();  //注意：在成员外部不能直接调用内部变量！需要实例化成员内部类！
		in.inf();
	}
	
	class innerClass{    //成员内部类！
		int y = 0;
		
		public innerClass() {   //定义成员内部类的构造方法！
			System.out.println("kk");
		}
		
		public void inf() {   //定义成员内部类的成员方法！
			System.out.println("内部类方法！：y = "+y);
		}
	}

	public static void main(String[] args) {
		dd k = new dd();
		k.outf();         //创建实例化对象；调用内部成员变量的值！
		
		dd.innerClass in = k.new innerClass();  //与上一种方法相同！
		in.inf();

	}

}
