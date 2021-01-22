package 接口继承多态.txt;

                                               //多态！！

public class hh {
	/*
	 * 概念：
	 *         同一个变量，同一个方法，执行出不同的结果！
	 */
	//实例化保存四边形对象的数组对象！
	
	
	private hh[]  kk = new hh[6];
	private int nextindex = 0;
	
	public void draw(hh q) {    //定义draw()方法，参数为四边形对象！
		if (nextindex < kk.length) {
			kk[nextindex] = q;
			System.out.println(nextindex);
			nextindex++;
		}
	}
	public static void main(String[] args) {
		//实例化两个四边形对象，用于调用draw()方法！
		hh q = new hh();  //以正方形对象为参数调用draw()方法！
		q.draw(new Square());  //以平行四边形对象为参数调用draw()方法！
		q.draw(new Parallelogramgle());
	
	}
}
//定义一个正方形类，继承四边形类！
class Square extends hh{
	public Square() {
		System.out.println("这是正方形！");
	}
}

//定义一个平行四边形类，继承四边形类！
class Parallelogramgle extends hh{
	public Parallelogramgle() {
		System.out.println("这是平行四边形！");
	}
}

