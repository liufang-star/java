package zixuewang;

import java.util.Scanner;

                 //switch-case语句。（分支）选择结构！

public class Text2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入数字！：\n");
		
		int koko = input.nextInt();
		
		switch(koko) {
			case 1:
				System.out.println("奖励夏令营！");
				break;
			case 2:
				System.out.println("奖励笔记本！");
				break;
			case 3:
				System.out.println("奖励笔移动硬盘！");
				break;
				
			default:
				 System.out.println("什么都没有！");
				 break;
			}
		}
	
	}
