package 类和对象.txt;

                                  //访问对象的属性和行为！（call方法！）

public class hh {
	
	int i = 47;     //定义成员变量i的值！
	
	public void call() {     //定义成员方法！
		System.out.println("调用call()方法：");
		for(int i = 0;i < 3;i++) { 
			System.out.print(i+"  ");
		}
		System.out.println();
		
	}

	
	public hh() {    //定义构造方法！
		
	}

	
	public static void main(String[] args) {
		hh t1 = new hh();   //定义一个对象！
		hh t2 = new hh();   //定义另一个对象！
		t2.i = 60;   //将成员变量赋值为60！
		
		//使用第一个对象调用类成员变量！
		System.out.println("第一个实例对象调用变量i的结果为："+t1.i);
		t1.call();
		System.out.println();
		
		//使用第二个对象调用类下恒源变量！
		System.out.println("第二个实例对象调用变量i的结果为："+t2.i);		
		t2.call();

	}

}
