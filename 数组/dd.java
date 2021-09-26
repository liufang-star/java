package 数组.txt;

import java.util.Arrays;

public class dd {
	
	                                //数组的基本操作

	public static void main(String[] args) {
		//（1）填充数组元素（使用Arrays.fill()方法！）
		
		//1、填充数组元素（一）
		int a[] = new int[5];   //定义一个长度为5的一维数组。
		a[0] = 7;        //注意：填充的方法前不能有其它的操作，否则会被覆盖！
		Arrays.fill(a, 10);
		for(int i = 0; i < a.length;i++) {
			System.out.println("第"+i+"个元素的值为："+a[i]);
		}
		System.out.println();
		
		//2、填充数组元素（2）
		int b[] = {1,2,3,4,5,6,7,8,9};
		Arrays.fill(b,2,5,0);   //将索引位置为2到5之前的数字改为0，注意：索引为5的位置数字不会改变！
		for(int i = 0; i < b.length;i++) {
			System.out.println("第"+i+"个元素的值为："+b[i]);
		}
		System.out.println();
		
		
		
		//（2）批量替换数组元素
		int c[] = {1,8,7,7,9,0,5,9,1,8,1};
		Arrays.fill(c, 3,7,0); //将索引位置为3到7的位置替换成0
		for(int i =0;i <c.length;i++) {
			if(c[i] == 0) {
				System.out.print("*");    //将0替换成星号！
			}
			else {
				System.out.print(c[i]);
			}
		}
	}

}
