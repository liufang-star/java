package 数组.txt;

public class aa {
	
	                                    //创建一维数组

	public static void main(String[] args) {
		 //（1）初始化一维数组的三种方法！
		int a[] = new int[3];
		a[0] = 1;
		a[1]  = 2;
		a[2] = 3;
		
		int b[] = new int[] {1,2,3,4,5,6};
		
		int c[]= {4,5,6,7,8,9};
		System.out.println("第一种创建一维数组的方法："+a);
		System.out.println("第二种创建一维数组的方法："+b);
		System.out.println("第三种创建一维数组的方法："+c);
		System.out.println();
		
		
		//使用一维数组创建日期！
		int day[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i =0;i <day.length;i++) {
			System.out.println("第"+(i+1)+"月有"+day[i]+"天");
		}

	}

}
