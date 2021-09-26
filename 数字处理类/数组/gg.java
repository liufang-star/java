package 数组.txt;

public class gg {
	
	                                   //数组排序算法

	public static void main(String[] args) {
		
		//（1）冒泡排序！（重点！！！）
		
		int a[] = {64,1,75,56,7};
		System.out.println("原数组为：");
		for(int ii : a) {
			System.out.print(ii+"   ");
		}
		
		
		
		for(int i = 1;i < a.length;i++) {
			for(int j = 0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("冒泡排序的结果为（升序）：");
		for(int kk : a) {
			System.out.print(kk+"  <  ");
		}
		
		
		
		for(int i = 1;i < a.length;i++) {
			for(int j = 0;j<a.length-i;j++) {
				if(a[j]<a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("冒泡排序的结果为（降序）：");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		int[] array = {64,4,24,1,3,15};  //创建一个数组，这个数组元素是乱序的！
		System.out.println("原数组为：");
		for(int yy : array) {
			System.out.print(yy+"  ");
		}
		System.out.println();
		gg sorter = new gg();   //创建冒泡排序类的对象！
		sorter.sort(array);    //调用排序方法将数组排序！

	}

			public void sort(int[] array) {
				for(int i = 1;i < array.length;i++) {
					//比较相邻两个元素，较大的数往后冒泡！
				for(int j = 0; j < array.length - 1;j++) {
					if(array[j] > array[j+1]) {
					    int tmp = array[j];   //把第一个元素值保存到临时变量中！
							 array[j] = array[j+1];  //把第二个元素值保存到第一个元素单元中！
							array[j+1] =tmp;   //把临时变量（也就是第一个元素原值）保存到第二个元素中！
								}
							}
						}
				showArray(array);  //输出冒泡排序后的数组元素！
						}
	
			public void showArray(int[] array) {
				System.out.println("使用另一种冒泡排序方法排序（升序）为：");
				for(int oo : array) {     //遍历数组！
						System.out.print("  >  "+oo);   //输出每个数组元素值！
					}
						System.out.println();
			}
														
}

