package 类和对象.txt;

                                                 //类

/*面向对象程序设计的三个特点：（1）封装、（2）继承、（3）多态
 * 
 * 以及成员变量和局部变量的区别！
 * public class 类名（属于成员变量！）、public   类名（局部变量！）
 * 成员变量（定义成员变量的同时可以不需要将其进行赋值！）
 * 局部变量（定义局部变量的同时一定要将其进行赋值，否则会报错！）
 * 
 * 权限修饰符主要包括三种：（1）private、（2）protected、（3）public
 * 特点：         本类                          同包其他类或子类                       其他包的类或子类
 *private          可见                              不可见                                           不可见
 *protected     可见                                可见                                             不可见
 *public            可见                                可见                                             可见
 */


public class aa {        //成员类（成员变量！在定义变量时不需要将其进行赋值！）
	private String name;     //成员变量！可以不将其进行赋值！

	public String getName() {//局部变量！（注意：在定义变量时需要将其进行赋值！否则会报错！）
		int id = 0;        //局部变量
		setName("java");    //调用类中的其他方法！
		System.out.println(id +name);      //输出id和name的值！
		return id + this.name;     //设置方法返回值！
	}

	private void setName(String name) {     //定义一个setName()方法！
		this.name = name;      //将参数值赋予类中的成员变量！

	}
	public static void main(String[] args) {       //主函数（方法！）
		aa test = new aa();   //创建test的实例对象！
		test.getName();   //调用！
	}

}
