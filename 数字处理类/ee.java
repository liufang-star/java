package ���ִ�����.txt;

import java.util.Scanner;

                            //���������ʹ��Math.random()������������

//��������Ϸ������0-100��֮����������

public class ee {

	public static void main(String[] args) {
		System.out.println("-------------------������----------------------");
		int num = (int)(Math.random()*100);
		int guess;
		Scanner sc = new Scanner(System.in);
		System.out.println("���������µ����֣�");
		guess = sc.nextInt();
		while( guess != num) {
			if(guess > num) {
				System.out.println("���ź�����´��ˣ�̫���ˣ��������������룺");
				guess = sc.nextInt();
			}else if(guess < num){
				System.out.println("���ź�����´��ˣ�̫С�ˣ��������������룺");
				guess = sc.nextInt();
			}
		}
		System.out.println("��ϲ�㣬��Ӯ�ˣ����е������ǣ�"+num);
	}

}
