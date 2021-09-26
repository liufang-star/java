package 数组.txt;

public class ii {
	
	                                    //数组排序算法！

	public static void main(String[] args) {
		
		//（3）反转排序！！
		
		int[] array = {87,23,45,70,46,56,12};   //创建一个数组！
		ii sorter = new ii();   //创建反转排序类的对象！
		sorter.sort(array);   //调用排序对象的方法，将数组反转！

	}

	public void sort(int[] array) {
		System.out.println("数组原内容为：");
		showArray(array);   //输出排序前的数组元素！
		int temp;
		int len = array.length;
		for(int i = 0;i < len/2;i++) {
			temp = array[i];
			array[i] = array[len -1-i];
			array[len-1-i] = temp;
		}
		System.out.println("数组反转后的内容为：");
		showArray(array);    //输出排序后的数组元素！
		
	}

	public void showArray(int[] array) {
		for(int i : array) {      //遍历数组！
			System.out.print("\t"+i);     //输出每个数组元素值！
		}
		System.out.println();
	}

}
