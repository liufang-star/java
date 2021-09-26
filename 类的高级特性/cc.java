package 类的高级特性.txt;

                                        //final方法！

public class cc {

	public static void main(String[] args) {
		Sub s = new Sub();   //实例化！
		s.doit();  //调用doit()方法！
		Parents p = s;   //执行向上转型操作！
//		p.doit();  //不能调用private方法！
		p.doit2();
		p.doit3();

	}

}

class Parents{    //创建一个Parents类！
	
	private final void doit() {    //使用private final定义一个成员方法1
		System.out.println("父类.doit()");
	}
	
	final void doit2() {   //使用final类定义一个doit2()成员方法！
		System.out.println("父类.doit2()");
	}
	
	public void doit3() {    //使用public 定义一个doit3()成员方法！
		System.out.println("父类.doit3()");
	}
	
}

class Sub extends Parents{    //继承
	
	public final void doit() {   //在子类中重写doit()方法！
		System.out.println("子类.doit()");
	}
	
//	final void doit2() {      //final方法不能被覆盖！
//		System.out.println("子类.doit2()");
//	}
	
	public void doti3() {
		System.out.println("子类.doit3()");
	}
	
}
