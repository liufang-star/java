package zixuewang;

import java.util.Scanner;

                           //ATM机模拟系统... ...

public abstract class Text8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String cardNum1 = "1001";
		String passwd1 = "123456";
		double banlance1 = 10000;
		
		String cardNum2 = "1002";
		String passwd2 = "123456";
		double banlance2 = 20000;
		
		String cardNum3 = "1003";
		String passwd3 = "123456";
		double banlance3 = 30000;
		
		double banlance = 0;
		
		System.out.println("----------欢迎来到银行！----------");
		
		int count = 0;
		
		while(1==1) {
			
			System.out.println("请输入银行卡账号：");
			String cardNum = in.next();
			System.out.println("请输入银行卡密码：");
			String passwd = in.next();
			
			if(cardNum.equals(cardNum1) && passwd.equals(passwd1)) {
				banlance = banlance1;
				System.out.println("输入正确！用户：卡1\t余额为："+banlance);
				//break;
				
			}else if(cardNum.equals(cardNum2) && passwd.equals(passwd2)) {
				banlance = banlance2;
				System.out.println("输入正确！用户：卡2\t余额为："+banlance);
				//break;
				
			}else if(cardNum.equals(cardNum3) && passwd.equals(passwd3)) {
				banlance = banlance3;
				System.out.println("输入正确！用户：卡3\t余额为："+banlance);
				//break;
				
			}else {
				count++;
				if(count>=3) {
					System.out.println("您已经三次输入错误，银行卡已被锁定！");
					break;
					
				}else {
					System.out.println("你已经"+count+"次输入错误，你还有"+(3-count)+"次机会！");
							continue;
				}
			}
			
			while(1==1) {
				
				System.out.println("请输入要办理的业务：1、存款。2、取款。3、退出：");
				int choice = in.nextInt();
				
				if(choice == 1) {
					System.out.println("请输入存款金额：");
					double money1 = in.nextDouble();
					
					if(money1>0) {
						banlance = banlance+money1;
						System.out.println("存款成功！存款金额为："+money1+"元\t余额为："+banlance+"元");
						
					}else {
						System.out.println("存款金额输入错误！");
					}
					
				}else if(choice == 2){
					System.out.println("请输入取款金额：");
					
					double money2 = in.nextDouble();
					
					if(money2>0 && money2<=banlance) {
						banlance = banlance - money2;
						System.out.println("取款成功！取款金额为："+money2+"元\t余额为："+banlance+"元");
						
					}else {
						System.out.println("取款金额输入错误！");
					}
					
				}else if(choice == 3) {
					System.out.println("办理结束，请收好您的银行卡！谢谢！");
					break;
					
				}else {
					System.out.println("输入错误，请重新选择！");
				    continue;
				}
				
			}
		}
	}

}
