package zixuewang;

import java.util.Scanner;

                     //����ʮ��������ƽ�������⣡����

public class Text6 {

	public static void main(String[] args) {
		
		/*
		 * int sum = 0; 
		 * int i = 0; while(i<=100) {
		 *  System.out.println(i); 
		 *  sum = sum + i;
		 * i++; 
		 * } System.out.println("0-100�ĺ�Ϊ��"+sum);
		 */
		
		
		//��10������ƽ����... ...
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int j = 1;
		while(j<=10) {
			System.out.println("�������"+j+"������");
			int num = s.nextInt();
			sum = num+sum;
			j++;
		}
		System.out.println("ƽ����Ϊ��"+sum/10);
	}

}
