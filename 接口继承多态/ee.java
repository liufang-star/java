package 接口继承多态.txt;

                                                   //对象类型的转换！！

/*
 * 向上转型和向下转型：
 * （1）向上转型：子类的对象转换成父类的对象。
 *               语法：Praents object = new Child();
 *                         Praents：用父类声明对象！Child：用子类实例化对象！
 *                         
 * （2）向下转型：父类的对象强制转换成子类的对象。
 *               语法：Parents p = new Parents();
 *                          Child c = (Child)p;   //强制转换的语法！！
 * 
 */


public class ee {

	public static void main(String[] args) {
		
		//向上转型，父类声明一个对象，由子类实例化对象！
		ee_Personname tom = new ee_students("tom！");
		
		//向下转型，父类强制转换成子类！！
		ee_Personname jack = new ee_Doctor("Jack") ;
		ee_Doctor dr = (ee_Doctor)jack;
		
		
	}

}
