package 接口继承多态.txt;

public class aa_computer {    //父类！电脑！
	String screen = "液晶显示屏！";
	
	void startUp(){     //定义一个成员方法！
		
		System.out.println("电脑正在开机，请稍等......");
		
	}
	
	void showPicture() {
		System.out.println("台式电脑：用鼠标点击。");
	}
	
	String sayHello() {
		return "欢迎使用！";
		
	}

}
