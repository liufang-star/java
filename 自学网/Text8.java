package zixuewang;

import java.util.Scanner;

                           //ATM��ģ��ϵͳ... ...

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
		
		System.out.println("----------��ӭ�������У�----------");
		
		int count = 0;
		
		while(1==1) {
			
			System.out.println("���������п��˺ţ�");
			String cardNum = in.next();
			System.out.println("���������п����룺");
			String passwd = in.next();
			
			if(cardNum.equals(cardNum1) && passwd.equals(passwd1)) {
				banlance = banlance1;
				System.out.println("������ȷ���û�����1\t���Ϊ��"+banlance);
				//break;
				
			}else if(cardNum.equals(cardNum2) && passwd.equals(passwd2)) {
				banlance = banlance2;
				System.out.println("������ȷ���û�����2\t���Ϊ��"+banlance);
				//break;
				
			}else if(cardNum.equals(cardNum3) && passwd.equals(passwd3)) {
				banlance = banlance3;
				System.out.println("������ȷ���û�����3\t���Ϊ��"+banlance);
				//break;
				
			}else {
				count++;
				if(count>=3) {
					System.out.println("���Ѿ���������������п��ѱ�������");
					break;
					
				}else {
					System.out.println("���Ѿ�"+count+"����������㻹��"+(3-count)+"�λ��ᣡ");
							continue;
				}
			}
			
			while(1==1) {
				
				System.out.println("������Ҫ�����ҵ��1����2��ȡ�3���˳���");
				int choice = in.nextInt();
				
				if(choice == 1) {
					System.out.println("���������");
					double money1 = in.nextDouble();
					
					if(money1>0) {
						banlance = banlance+money1;
						System.out.println("���ɹ��������Ϊ��"+money1+"Ԫ\t���Ϊ��"+banlance+"Ԫ");
						
					}else {
						System.out.println("������������");
					}
					
				}else if(choice == 2){
					System.out.println("������ȡ���");
					
					double money2 = in.nextDouble();
					
					if(money2>0 && money2<=banlance) {
						banlance = banlance - money2;
						System.out.println("ȡ��ɹ���ȡ����Ϊ��"+money2+"Ԫ\t���Ϊ��"+banlance+"Ԫ");
						
					}else {
						System.out.println("ȡ�����������");
					}
					
				}else if(choice == 3) {
					System.out.println("������������պ��������п���лл��");
					break;
					
				}else {
					System.out.println("�������������ѡ��");
				    continue;
				}
				
			}
		}
	}

}
