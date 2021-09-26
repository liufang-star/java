package 数字处理类.txt;

import java.util.Scanner;

                            //随机数！（使用Math.random()方法！！！）

//猜数字游戏！！（0-100）之间的随机数！

public class ee {

	public static void main(String[] args) {
		System.out.println("-------------------猜数字----------------------");
		int num = (int)(Math.random()*100);
		int guess;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您猜的数字：");
		guess = sc.nextInt();
		while( guess != num) {
			if(guess > num) {
				System.out.println("很遗憾！你猜错了（太大了！）！请重新输入：");
				guess = sc.nextInt();
			}else if(guess < num){
				System.out.println("很遗憾！你猜错了（太小了！）！请重新输入：");
				guess = sc.nextInt();
			}
		}
		System.out.println("恭喜你，你赢了！猜中的数字是："+num);
	}

}
