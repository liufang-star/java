package zixuewang;

import java.util.Scanner;

                 //switch-case��䡣����֧��ѡ��ṹ��

public class Text2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������֣���\n");
		
		int koko = input.nextInt();
		
		switch(koko) {
			case 1:
				System.out.println("��������Ӫ��");
				break;
			case 2:
				System.out.println("�����ʼǱ���");
				break;
			case 3:
				System.out.println("�������ƶ�Ӳ�̣�");
				break;
				
			default:
				 System.out.println("ʲô��û�У�");
				 break;
			}
		}
	
	}
