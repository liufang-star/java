package 数组.txt;

public class bb {
	
	                              //二维数组的创建及使用

	public static void main(String[] args) {
		//1、初始化二维数组的三种方法！
		int a[][] = {{4,5,6},{7,8,9}};
		
		int b[][] = new int[][] {{1,2,3},{4,5,6}};
		
		int c[][] = new int[2][3];
		c[0] = new int[]{1,2,3};
		c[1] = new int[] {2,3,4};
		
		System.out.println("第一种："+a);
		System.out.println("第二种："+b);
		System.out.println("第三种："+c);
		System.out.println();
		
		
		
		
		//2、（1）使用二维数组创建横板和竖版古诗！
		char d[][] = new char[4][];
		d[0] = new char[]{'春','眠','不','觉','晓'};   //注意：在创建二维数组时，必须使用new！！
		d[1] = new char[] {'处','处','闻','啼','鸟'};
		d[2] = new char[] {'夜','来','风','雨','声'};
		d[3] = new char[] {'花','落','知','多','少'};
		
		System.out.println("\t----------横板-----------");
		for(int i =0;i < d.length;i++) {
			for(int j = 0;j < d[i].length;j++) {
				System.out.print("\t"+d[i][j]);
			}
			if(i % 2 == 0) {
				System.out.println("，");
			}
			else {
				System.out.println("。");
			}
		}
		System.out.println();
		
		
		//2、（2）竖版
		System.out.println("\t----------竖版----------");
		for(int j = 0;j < 5;j++) {
			for(int i = 3;i >= 0.;i--) {
				System.out.print("\t"+d[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t。\t，\t。\t，");
		
	}

}
