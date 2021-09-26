package Enum_;

                                        //枚举类型中的构造方法！

public class EnumIndexTest {
	
	enum Constant3{        //将常量放置在枚举类型中
		Constants_a("我是枚举类型a"),      //定义带参数的枚举型成员
		Constants_b("我是枚举类型b"),
		Constants_c("我是枚举类型c"),
		Constants_d(3);
		
		private String description;
		private int i =4;
		
		private Constant3(){       //构造方法
			
		}
		
        private Constant3(String description) {     //定义参数为String型的构造方法
        	
        	this.description = description;
			
		}

		private Constant3(int i) {        //定义参数为int类型的构造方法
			
			this.i = this.i +i;
			
		}
		
		public int geti() {       //获取i的值
			return i;
		}

		public String getDescription() {    //获取description的值
			
			return description;
		}

		
	}

	public static void main(String[] args) {
		
		for(int i = 0;i <Constant3.values().length;i++) {
			System.out.println(Constant3.values()[i]+"调用getDescription()方法为："
					+Constant3.values()[i].getDescription());
		}
		System.out.println(Constant3.valueOf("Constants_d")+"调用geti()方法为："
				+Constant3.valueOf("Constants_d").geti());
		
		

	}

}
