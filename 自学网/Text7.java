package zixuewang;

import java.util.Scanner;

                     //�ж�10�����е����ֵ����Сֵ......

public class Text7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int i = 1;
		while(i<=10) {
			System.out.println("�������"+i+"������");
			int num = s.nextInt();
			
			if(i == 1) {
				max = num;
				min = num;
			}
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
			i++;
		}
		System.out.println("���ֵΪ��"+max+"��СֵΪ��"+min);

	}

}
