package 类的高级特性.txt;

                                                          //静态内部类！

/*
 * 概念：
 *         静态字段的内部类，和静态方法并列。
 *         
 * 作用：
 *         提供调试作用。
 *         我将main方法写在静态内部类中，生成.class文件后，
 *         调试代码在静态内部类当中，当我删除静态内部类后，
 *         其他人仍然可以使用我的外部类。
 * 
 */

public class ff {
	
	static int x=100; 
	
	static class innerclass3 {
		
		void action() {
			
			x=1;  //x必须是静态字段
			
		}
		public static void main(String[] args) {
			
			System.out.println("我是静态内部类");
			
		}
		
	}
	
}
	