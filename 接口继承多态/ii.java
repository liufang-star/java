package 接口继承多态.txt;

                                                         //多态！！

public class ii {

	public static void main(String[] args) {
		
		Animal jack = new Fish(); //理解为：动物 （Animal）--> jack  是   -->   一条鱼（Fish）！
		jack.move();
		
	    jack = new Hawk();
		jack.move();

	}

}

class Animal{  //定义一个Animal类！
	
	void move() {    //定义一个无参方法！
		
	}
}

class Fish extends Animal{
	void move() {
		System.out.println("游泳！");
	}
}

class Hawk extends Animal{
	void move() {
		System.out.println("飞翔！");
	}
}