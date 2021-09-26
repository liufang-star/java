package zixuewang;

import java.util.Scanner;

                     //求圆的周长和面积问题... ...

public class Text1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double pai = 3.14159;
		
		System.out.println("请输入圆的半径：\n");
		
		double r = input.nextDouble();
		
		double per = pai*r*2;
		
		double area = pai*r*r;
		
		System.out.println("圆的半径是："+r+"\n周长是："+per+"\n面积是："+area);

	}

}
