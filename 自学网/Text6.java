package zixuewang;

import java.util.Scanner;

                     //输入十个数，求平均数问题！！！

public class Text6 {

	public static void main(String[] args) {
		
		/*
		 * int sum = 0; 
		 * int i = 0; while(i<=100) {
		 *  System.out.println(i); 
		 *  sum = sum + i;
		 * i++; 
		 * } System.out.println("0-100的和为："+sum);
		 */
		
		
		//求10个数的平均数... ...
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int j = 1;
		while(j<=10) {
			System.out.println("请输入第"+j+"个数：");
			int num = s.nextInt();
			sum = num+sum;
			j++;
		}
		System.out.println("平均数为："+sum/10);
	}

}
