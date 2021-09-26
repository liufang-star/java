package zixuewang;

import java.util.Random;
import java.util.Scanner;

                        //掷色子游戏，随机数... ...

public class Text4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("欢迎来到掷筛子游戏！");
		System.out.println("游戏开始，请选择大小、1.小（1-3点） 2.大（4-6点）");
		int choice = s.nextInt();
		Random r = new Random();
		int point = r.nextInt(6)+1;
		int result = 0;
		if(point <= 3) {
			result = 1;
		}else if(point >= 3) {
			result = 2;
		}
		System.out.println("程序生成的点数是："+point);
		
		if(choice == result) {
			System.out.println("恭喜你，赢了一局！");
		}else {
			System.out.println("很遗憾，你输了！");
		}
	}

}
