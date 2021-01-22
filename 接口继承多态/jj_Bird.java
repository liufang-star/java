package 接口继承多态.txt;

public abstract class jj_Bird  extends jj_Animal{   //动物子类：鸟类！
	String feather;   //羽毛
	
	public jj_Bird(String feather) {    //定义一个有参构造方法！
		System.out.println("创建了一个鸟类。");
		this.feather = feather;   //调用本类对象，this关键字！
	}
	
	public void growFeather() {    //不是抽象方法！
		
		//羽毛不是抽象类！所以不需要用abstract关键字修饰！
		System.out.println("长满"+feather+"羽毛。");  //feather动态的属性。
	}
	
	abstract public void move();    //move抽象类。需要用abstract关键字修饰！
	
	public void reproduce() {
		System.out.println("下蛋！");
	}

}
