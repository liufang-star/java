package Enum_;

                                             //泛型！（向上和向下转型）

/*
 * 实质：使程序员定义安全的类型！
 * 
 * 概念：
 *          在没有出现泛型之前，Java提供了对Object的引用"任意化"操作
 *          这种"任意化"操作就是对Object引用进行向下转型及向上转型操作！
 */


public class Xiangxia_Xiangshang_ZhuanXing {
	
	public Object getB() {       //设置相应的getXXX()方法
		return b;
	}

	public void setB(Object b) {       //设置相应的setXXX()方法
		this.b = b;
	}

	private Object b;       //定义Object类型成员变量

	public static void main(String[] args) {
		
		Xiangxia_Xiangshang_ZhuanXing t = new Xiangxia_Xiangshang_ZhuanXing();
		t.setB(new Boolean(true));     //向上转型操作
		System.out.println(t.getB());
		
		t.setB(new Float(12.3));
		Float f = (Float)(t.getB());     //向下转型操作
		System.out.println(f);
		
		
		

	}

}
