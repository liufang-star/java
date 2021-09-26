package 类的高级特性.txt;

                                           //匿名内部类！

/*
 * 概念：
 *        一个没有名字的类，是内部类的简化写法！
 *    
 * 本质：
 *          其实是继承该类或者实现接口的子类匿名对象！
 *          
 * 作用：
 *         在开发的时候，会遇到抽象类，或者接口作为参数。
 *         而这个时候，实际需要的是一个子类对象。
 *         如果该方法仅仅调用一次，我们就可以使用匿名内部类的格式简化。
 */

public class gg {
	public OutInerfaces action() {
		return new innerClass2();   //第一种（①）
//		return new OutInerfaces() {//第二种（②）
//			private int i = 0;
//			public int getValue() {
//				return i;
//			}
//		};
	}

	        //第一种（①）和第二种（②）是一样的！
}

interface OutInerfaces {   //创建接口！
	
}
class innerClass2 implements OutInerfaces{    //第一种（①）
	private int i = 0;
	public int getValue() {
		return i;
	}
}