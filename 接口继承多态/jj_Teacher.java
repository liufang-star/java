package 接口继承多态.txt;

public abstract class jj_Teacher {   //抽象类！
	 abstract public void teaching();    //抽象方法！
}

class Mathteacher extends jj_Teacher{

	@Override
	public void teaching() {
		System.out.println("这是数学老师讲的内容：这节课讲一下三角函数！");
		
	}
	
}

class EnglishTeacher extends jj_Teacher{

	@Override
	public void teaching() {
		System.out.println("这是英语老师讲的内容：open the book！");
		
	}
	
}