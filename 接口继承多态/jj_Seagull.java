package 接口继承多态.txt;

public  class jj_Seagull  extends jj_Bird{  //鸟类的子类！海鸥类！
	
	public jj_Seagull(String feather) {
		super(feather);
		System.out.println("我是一只海鸥！");
	}

	//说明一个子类继承了一个抽象类之后，我需要实现这个抽象类以及它父类所有的抽象方法。

	@Override
	public void move() {   //move()重写的方法来自于jj_Bird类！
		System.out.println("海鸥飞翔！");
		
		
	}

	@Override
	public void eat() {    //eat()重写的来自于最顶层的父类（jj_Animal类）
		System.out.println("海鸥吃鱼！");
		
	}

}
