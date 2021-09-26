package Enum_;

                             //使用interface接口实现switch()--case语句！

/*
 * 弊端：
 *         当接口值赋错时，会报错！
 *       
 */

public class Interface_Switch {
	
	public interface Seasons{      //使用interface接口里的量都是静态常量
		
		public static final int SPRING = 1;
		public static final int SUMMER = 2;
		public static final int AUTUMN= 3;
		public static final int WINTER= 4;
		
	}
	
	public static void doit(int c) {
		switch(c) {
		case Seasons.SPRING:
			System.out.println("doit()：春天！");
			break;
		case Seasons.SUMMER:
			System.out.println("doit()：夏天！");
			break;
		case Seasons.AUTUMN:
			System.out.println("doit()：秋天！");
			break;
		case Seasons.WINTER:
			System.out.println("doit()：冬天！");
			break;
		}
	}
	

	public static void main(String[] args) {
		doit(Seasons.AUTUMN);    //调用
		doit(1);   //也可以用数字

	}

}
