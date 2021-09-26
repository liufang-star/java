package 数字处理类.txt;

import java.util.Random;
import java.util.Scanner;

                                                            //random类！

//微信发红包！！

public class ff {

	public static void main(String[] args) {
		
		System.out.println("---------------------微信抢红包-------------------------");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入红包总金额（元）：");
		double total = sc.nextDouble();
		System.out.println("请输入红包的个数（个）：");
		int bagCount = sc.nextInt();
		
		double min = 0.01;  //红包最小金额！
		Random c = new Random();
		
		for(int i = 1; i < bagCount;i++) {
/*
* 本次红包可以用的最大金额 = 可分配的金额 - （红包个数 - 已发出的红包数）* 红包的最小金额
 */
			double max = total - (bagCount -i) * min;
			double bound = max - min;
			
			double safe = (double)c.nextInt((int)(bound*100))/100;
			double money = safe + min;
			total = total - money;
			System.out.println("第"+i+"个红包："+String.format("%.2f", money)+"元");
		}
		System.out.println("第"+bagCount+"个红包："+String.format("%.2f", total)+"元");
		sc.close();

	}

}
