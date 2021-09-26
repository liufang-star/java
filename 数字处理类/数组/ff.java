package 数组.txt;

import java.util.Arrays;

public class ff {
        
	                               //数组的基本操作
	
	public static void main(String[] args) {
		//（1）复制数组（使用Arrays.copyOf方法！从索引位置为0开始复制！）
		
		int a[] = {4,5,6,7,8,9};
		System.out.println("原数组为：");
		for(int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("复制之后的数组为：");
		int b[] = Arrays.copyOf(a, 3);   //从索引位置为0到3进行复制！
		for(int k : b) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		//（2）复制数组（使用Arrays.copyOfRange方法！指定索引起始和结束位置开始复制！）
		
				int d[] = {1,2,3,4,5,6,7,8,9};
				System.out.println("原数组为：");
				for(int i : d) {
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println("复制之后的数组为：");
				int e[] = Arrays.copyOfRange(d, 3,5);   //指定索引位置为3到5的位置进行复制！
				for(int k : e) {
					System.out.print(k+" ");
				}
				
		

	}

}
