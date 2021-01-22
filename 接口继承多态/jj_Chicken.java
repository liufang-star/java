package 接口继承多态.txt;

public class jj_Chicken extends jj_Bird{  //鸟类的子类！鸡！！继承。

	public jj_Chicken(String feather) {
		super(feather);
		System.out.println("我是一只小鸡。");
		
	}

	@Override
	public void move() {
		System.out.println("小鸡快跑！");
		
	}

	@Override
	public void eat() {
		System.out.println("小鸡吃米！");
		
	}

}
