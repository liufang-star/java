package zixuewang;

import java.util.Random;
import java.util.Scanner;

                        //��ɫ����Ϸ�������... ...

public class Text4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("��ӭ������ɸ����Ϸ��");
		System.out.println("��Ϸ��ʼ����ѡ���С��1.С��1-3�㣩 2.��4-6�㣩");
		int choice = s.nextInt();
		Random r = new Random();
		int point = r.nextInt(6)+1;
		int result = 0;
		if(point <= 3) {
			result = 1;
		}else if(point >= 3) {
			result = 2;
		}
		System.out.println("�������ɵĵ����ǣ�"+point);
		
		if(choice == result) {
			System.out.println("��ϲ�㣬Ӯ��һ�֣�");
		}else {
			System.out.println("���ź��������ˣ�");
		}
	}

}
