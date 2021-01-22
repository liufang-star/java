package 接口继承多态.txt;

                              //抽象类！！（使用abstract关键字）！

//抽象（抽象名词）：笼统概括为：没有复数形式，（不可数名词！）

/*
 * 注意：
 *      （1）抽象类是不能被实例化！（如果要实例化对象，可以通过子类将其实例化！）
 *      
 *      （2）定义抽象方法时：（没有大括号！）
 *              后面没有具体的实现，直接用冒号结束，所以子类必须实现抽象类中的抽象方法！
 *                   例如：public abstract class jj_Teacher {   //抽象类！
 *	                                   abstract public void teaching();    //抽象方法！
 *                                   }
 *                                    
 *      （3）抽象方法：只需要声明，不需要实现的！
 *                                      含有抽象方法的类必须是抽象类！
 *                                    抽象类必须被继承！而抽象方法必须被抽象类的子类所重写！
 *                                    
 *     （4）抽象类继承抽象类（多层抽象类继承）：
 *                               说明一个子类继承了一个抽象类之后，
 *                               需要实现这个抽象类以及它父类所有的抽象方法。
 */

public class jj {

	public static void main(String[] args) {
		System.out.println("调用jj_Color抽象类：");
		jj_Color c1 = new Red();   //通过调用jj_Color实例化对象！
		jj_Color c2 = new Blue();
		c1.show();   //调用jj_Color中Red类和Blue类的show()方法！
		c2.show();
		System.out.println();
		
		
		//该方法是错误的，不能创建抽象类对象。既然是抽象类的对象，就不能将其实例化！
		//jj_Color c3 = new jj_Color();   
		
		
		System.out.println("调用jj_Teacher抽象类中的抽象方法：");
		jj_Teacher lee = new Mathteacher();
		jj_Teacher tom = new EnglishTeacher();
		lee.teaching();
		tom.teaching();
		System.out.println();
		
		
		System.out.println("使用多层（jj_Animal，jj_Bird，jj_Seagull）抽象类继承：");
		jj_Seagull kk = new jj_Seagull("白色");
		kk.eat();
		kk.move();
		kk.growFeather();
		kk.reproduce();
		System.out.println();
		
		
		System.out.println("第二种（jj_Animal，jj_Bird，jj_Chicken）多层抽象类继承：");
		jj_Chicken tt = new jj_Chicken("黄色");
		tt.move();
		tt.eat();
		tt.growFeather();
		tt.reproduce();
		
		
			
		
		

	}

}
