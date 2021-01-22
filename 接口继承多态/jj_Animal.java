package 接口继承多态.txt;

public abstract class jj_Animal {   //动物类，最顶层的父类！！
	
	public jj_Animal() {     //定义一个无参的构造方法！
		System.out.println("创建了一个动物。");
	}
	
	public abstract void eat();   //定义一个抽象方法！eat：吃。
	
	abstract public void reproduce();   //与上面定义的方法一样！reproduce：繁殖。

}
