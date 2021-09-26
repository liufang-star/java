package 数组.txt;

public class cc {
	
	                                     //数组的基本操作（双for语句！！）

	public static void main(String[] args) {
		
		//（1）遍历数组
		
		//1、使用双for语句！
		int a[][] = new int[][] {{1},{2,3},{4,5,6}};  //定义二维数组
		for(int k = 0;k < a.length;k++) {
			for(int j = 0;j < a[k].length;j++) {  //循环遍历二维数组中的每个元素。
				System.out.print(a[k][j]);   //将数组中的元素输出
			}
			System.out.println();   //输出空格（换行！）
		}
		System.out.println();
		
		
		//2、使用双for遍历语句！
		int arr[][] = new int[][] {{4,3},{1,2}};  //定义二维数组
		System.out.println("数组中的元素是：");   //提示信息
		int i = 0;               //外层循环计数器变量
		for(int c[] : arr) {       //外层循环变量为一维数组
			i++;        //外层计数器递增
			int d = 0;       //内层循环计数器
			for(int e : c) {       //循环遍历每一个数组元素
				d++;         //内层计数器递增
				if(i == arr.length && d == c.length) {    //判断变量是二维数组中的最后一个元素
					System.out.print(e);       //输出二维数组中的最后一个元素
				}
				else {
					//如果不是二维数组中的最后一个元素
					System.out.print(e+"、");       //输出信息
				}
			}
		}

}
}