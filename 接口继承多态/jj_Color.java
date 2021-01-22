package 接口继承多态.txt;

public abstract class jj_Color {      //抽象类（jj_Color）！颜色！
	
	public void show() {   //无参方法！
		
	}

}

class Red extends jj_Color{      //Red类继承jj_Color（抽象类！）
	public void show() {
		System.out.println("我是红色...");
	}
}

class Blue extends Red{    //Blue类继承Red类！
	public void show() {
		System.out.println("我是蓝色...");
	}
}
