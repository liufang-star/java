package zixuewang;

import java.util.Scanner;

                     //��Բ���ܳ����������... ...

public class Text1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double pai = 3.14159;
		
		System.out.println("������Բ�İ뾶��\n");
		
		double r = input.nextDouble();
		
		double per = pai*r*2;
		
		double area = pai*r*r;
		
		System.out.println("Բ�İ뾶�ǣ�"+r+"\n�ܳ��ǣ�"+per+"\n����ǣ�"+area);

	}

}
