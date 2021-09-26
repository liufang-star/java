package 类和对象.txt;

                                                //类的构造方法！

/*注意：（1）构造方法没有返回值！
 *            （2）构造方法的名称要与本类的名称相同！
 *            例如：本类名称 public class bb{ }  与   public bb{ } 名称相同！
 */

public class bb {     
	
	int eggcount;      //定义一个int型的成员变量！

	public bb(int eggcount) {    //定义有参构造方法
		this.eggcount = eggcount;     //将参数值赋予类中的成员变量！
		System.out.println("这个饼里有"+eggcount+"个鸡蛋！");
		
	}
	public bb() {     //定义无参构造方法！
		this(1);    //将eggcount赋值为1。
	}

	public static void main(String[] args) {
		bb e = new bb();    //创建e对象！
		bb e2 = new bb(5);    //创建e2对象！

	}

}
