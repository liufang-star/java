package zixuewang;

import java.util.Scanner;

                     //判断10个数中的最大值和最小值......

public class Text7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int i = 1;
		while(i<=10) {
			System.out.println("请输入第"+i+"个数：");
			int num = s.nextInt();
			
			if(i == 1) {
				max = num;
				min = num;
			}
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			i++;
		}
		System.out.println("最大值为："+max+"最小值为："+min);

	}

}
