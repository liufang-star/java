package 接口继承多态.txt;

                                         //接口！！

/*
 * 注意：
 *        （1） 在java中，不允许出现多重继承，但使用接口就可以实现多重继承！
 *        
 *        （2）继承接口使用 implements关键字！
 *        
 *        （3）接口也支持类的向上和向下转型！
 */

public class kk {
	public static void main(String[] args) {
		kk_interface d1 = new kk_Qua();
		d1.draw();
		
		System.out.println();
		
		kk_interface d2 = new kk_Sque();
		d2.draw();
		
			
			
	}

}
