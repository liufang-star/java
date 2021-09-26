package 数组.txt;

public class hh {
	
	                                  //数组排序算法！

	public static void main(String[] args) {
		
		//（2）直接选择排序！（选择排序！！重点！！！）
		
		int a[] = {64,1,75,46,7};
		System.out.println("原数组为：");
		for(int tt : a) {
			System.out.print(tt+"  ");
		}
		
		
		
		int index;
		for(int i =1;i <a.length;i++) {
			index = 0;
			for(int j = 1;j<=a.length-i;j++) {
				if(a[index]<a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i] = a[index];
			a[index] = tmp;
		}
		System.out.println();
		System.out.println("使用选择排序后的结果为（升序）：");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		
		
		
		for(int i =1;i <a.length;i++) {
			index = 0;
			for(int j = 1;j<=a.length-i;j++) {
				if(a[index]>a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i] = a[index];
			a[index] = tmp;
		}
		System.out.println();
		System.out.println("使用选择排序后的结果为（降序）：");
		for(int kk : a) {
			System.out.print(kk+"  >  ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		int[] array = {63,4,24,1,3,15};    //创建一个数组，这个数组元素是乱序的！
		System.out.println("原数组为：");
		for(int yy : array) {
			System.out.print(yy+"  ");
		}
		System.out.println();
		hh sorter = new hh();    //创建直接排序类的对象！
		sorter.sort(array);   //调用排序对象的方法将数组排序！


	}

		public void sort(int[] array) {
				int index;
				for(int i = 1;i<array.length;i++) {
					index = 0;
					for(int k = 1;k<=array.length-i;k++) {
						if(array[k] > array[index]) {
							index = k;
						}
					}
					//交换在位置array.length-i和index（最大值）上的两个数！
					int tmp = array[array.length-i];   //把第一个元素的值保存到临时变量中！
					array[array.length-i] = array[index];  //把第二个元素值保存到第一个元素单元中！
					array[index] = tmp;  //把临时变量也就是第一个元素原值保存到第二个元素中！
				}
				showArray(array);   //输出直接选择排序后的数组元素！
										
		}

		public void showArray(int[] array) {
			System.out.println("使用另一种选择排序方法排序（升序）为：");
			for(int aa : array) {     //遍历数组
				System.out.print("  >  "+aa);     //输出每个数组元素值！
			}
			System.out.println();
		}

}
