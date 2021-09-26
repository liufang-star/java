package 数组.txt;

import java.util.Arrays;

public class ee {
                        
	                                  //数组的基本操作
	
	public static void main(String[] args) {
		
		//（1）对数组进行排序（使用Arrays.sort()方法！）
		//1、整型排序！（int）
		int a[] = {45,12,78,89,23,46,79,13};
		System.out.println("原数组为：");
		for(int j : a) {
			System.out.print(""+j+" ");
		}
		System.out.println();
		System.out.println();
		Arrays.sort(a);
		System.out.println("排序之后的数组为：");
		for(int i : a) {
			System.out.print(i+" < ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//小数型排序！！（double）
		double b[] = {12.0,45.0,2.0,1.0,23.123,456.12,89,564,45,12};
		System.out.println("原数组为：");
		for(double i : b) {
			System.out.print(i+"    ");
		}
		System.out.println();
		Arrays.sort(b);
		System.out.println();
		System.out.println("排序之后的数组为：");
		for(double k : b) {
			System.out.print(k+" < ");
		}

	}

}
