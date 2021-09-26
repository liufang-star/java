package 类的高级特性.txt;

                                                //局部内部类！

/*
 * 概念：
 *         定义在一个方法或者一个作用域里面的类！
 *  
 *  注意事项：
 *           （1）局部内部类中不可定义静态变量，
 *                   可以访问外部类的局部变量（即方法内的变量），但是变量必须是final的！
 *                   
 *          （2）局部内部类只能在所在的方法体作用域内进行实例化，
 *                   而如果要在所在方法体返回该类，就要通过接口向上转型的操作。
 *           
 *  作用：
 *          在某些情况下，某些业务逻辑需要临时处理，
 *          这些业务逻辑只在这里使用又可以封装成一个类的话，
 *          而又没必要重新建个文件，所以可以这写一个局部内部类来处理。
 */
public class ee {
	
	//要把这个类返回出去，就需要通过接口，因为内部类在外部作用域中不存在！
	public OutInterface action(String x) {
		
		class innerClass2 implements OutInterface {   //局部内部类！！
			
			public innerClass2(String s) {
				
			s = x;
			System.out.println(s);
			
		}
	}
	return new innerClass2("do");
}

	public static void main(String[] args) {
		
		ee kk = new ee();
		kk.action("局部内部类！");

	}

}
interface OutInterface{    //专门用来给局部内部类做向上转型的父接口的操作！
	
}