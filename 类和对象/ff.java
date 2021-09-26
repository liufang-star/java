package 类和对象.txt;

                                       //静态方法！！（static public void 方法名 { } ！）

/*优点：调用类中的静态方法无需创建类的对象*/

public class ff {
	
	static {   //静态代码块！
		System.out.println("这里是静态代码块！");
	}
	
	{     //非静态代码块！
		System.out.println("这里是非静态代码块！");
	}
	
	public ff(){    //构造方法！
		System.out.println("这里是构造方法！");
	}
	
	public void mehod() {   //成员方法！需要创建并调用！
		System.out.println("这里是成员方法！");
	}
	
	static public void show(){     //静态方法！只需要调用就可以！
		System.out.println("这里是静态方法！");
	}

	public static void main(String[] args) {    //类的主方法！（入口点！！）
		ff e = new ff();   //创建实例对象！来接收成员变量的值！
		e.mehod();  //调用成员方法！
		
		ff.show();   //调用静态方法时不需要创建实例对象！

	}

}
