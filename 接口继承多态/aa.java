package 接口继承多态.txt;

                                                //类的继承！（extends关键字！）

                                  /* 例如：平板电脑继承了台式电脑的属性和某些特征！*/

public class aa {
	
	/*
	  注意事项：
	    extends（继承）：子类继承父类！
	 * （1）子类可以调用父类的属性和方法；但父类不可以调用子类的属性和方法！
	  
	 * （2）super关键字：（调用父类的构造方法和成员方法）
		                        子类想在重写的时候调用父类原有的方法可以使用super关键字！！
		         和this关键字用法一样（区别）：
		                        this调用的是本类对象；而super调用的是父类对象！
		                        
	* （3）java语言中，一个类只可以有一个父类！
	* 例如：（这种继承是错误的！！）                   （这种方法是对的！（多继承！））
	*  class Parent1{                                                      class Parent1 extends Parent2{
	*              }                                                                                     }
	*                     
	*  class Parent2{                                                     class Parent2{
	*              }                                                                          }
	*                     
	*  class child extend Parent1 Parent2{                  class child extends Parent1{
	*             }                                                                                     }
	* 
	*  （4）子类不仅会覆盖父类的方法，还会覆盖父类的属性！
	 */        

	public static void main(String[] args) {
		
		aa_computer com = new aa_computer();   //创建"父类（aa_computer）"的一个对象！
		aa_pad ipad = new aa_pad();   //创建"子类（aa_pad）"的一个对象！
		
		System.out.println("调用父类的属性和方法（结果为）：");
		System.out.println(com.screen);    //调用"父类（aa_conputer）"的属性！！
		com.startUp();   //调用"父类aa_computer"的方法！
		System.out.println();
		
		
		System.out.println("通过调用子类继承父类的属性和方法（结果为）：");
		System.out.println(ipad.screen);
		ipad.startUp();
		System.out.println();
		
		
		System.out.println("子类独有的属性和方法：");
		ipad.open5G();
		System.out.println(ipad.battery);
		System.out.println();
		
		
		//com.open5G();
		
		//System.out.println(com.battery);
		
		
		/*重写：（子类和父类做同一件事，但完成的方式不同！）
		 * 例如：台式电脑和平板电脑（打开图片！）
		*/
		System.out.println("方法的重写：");
		com.showPicture();
		ipad.showPicture();
		System.out.println();
		
		
		//super关键字！（调用父类的构造方法和成员方法）
		//子类想在重写的时候调用父类原有的方法可以使用super关键字！！
		System.out.println("使用supuer关键字（调用父类的方法！）：");
		System.out.println(com.sayHello());
		System.out.println(ipad.sayHello());

	}

}
