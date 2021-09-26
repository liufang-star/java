package 类和对象.txt;

                                     //静态变量（static关键字！）

/*（1）public class cc { } 与  public cc { } ；public cc { } 属于构造方法！
 * （2）public void 方法名 { }  属于成员方法！
 *                            注意：在定义成员方法时，如果需要使用该函数，则需调用！
 *                            例如：public void outlet(){ 
 *                                            ......                          // 方法体...
 *                             }   //定义成员方法！
 *                                       cc out = new cc();  //需要创建实例对象！
 *                                       out.outlet();    //调用！
 */


public class cc {
	
	static public int water = 0;     //定义一个静态变量water，初始值为0。
	
	
	public void outlet(){     //定义一个成员方法！（水量放水操作！）
		
			/*注意：在定义成员方法时，只有调用才会被输出！*/
		
		if(water >= 2) {
			water -= 2;  //如果水量（water>2，进行-2操作！）
		}else {
			water = 0;   //否则为0，不可能为负数！
		}
		
	}
	
	
	 public void inwater() {        //定义成员方法！（水量注水操作！）
		water += 3;
	}
	 

	public static void main(String[] args) {
		cc out = new cc();     //创建 out 对象，方便后面out.outlet()调用！
		cc in = new cc();       //创建 in 对象，方便后面in.inwater()调用！
		System.out.println("水池中的水量为："+cc.water);
		System.out.println("向水池中注水两次！");
		in.inwater();   //调用！
		in.inwater();
		System.out.println("水池中的水量为："+cc.water);
		System.out.println("向水池中放水一次！");
		out.outlet();
		System.out.println("水池中的水量为："+cc.water);

	}

}
