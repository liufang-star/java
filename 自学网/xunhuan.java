package zixuewang;

import java.util.Scanner;

                  //输入三次数，判断大小并排序！！！

public class xunhuan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字：（三次）\n");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
	 //int a = 133;
	 //int b = 546;
	 //int c = 234;
	 if(a >= b) {
		 if(b >= c) {
			 System.out.println(a+"---"+b+"---"+c);
		 }else if(c >= b) {
			 if(c >= a) {
				 System.out.println(c+"---"+a+"---"+b);
			 }else if(a >= c) {
				 System.out.println(a+"---"+c+"---"+b);
			 }
		 }
	 }else if(b >= a) {
			if(a >= c) {
				System.out.println(b+"---"+a+"---"+c);
			}else if(c >= a) {
				if(b >= c) {
					System.out.println(b+"---"+c+"---"+a);
				}else if(c >=b) {
					System.out.println(c+"---"+b+"---"+a);
				}
			}

     }
	}
}

