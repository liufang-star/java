package zixuewang;

import java.util.Scanner;

                             //��������⣡

public class Text3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������4Ϊ��Ա�ţ�\n");
		
		int vip = input.nextInt();
		
		int bai = vip/100%10;
		
		//Math.random() ->> 0-1֮������С��
		
		int sui = (int)(Math.random()*10);//java�е�ǿ������ת������û����������ģ�С������������ȫ���ɵ���
		
		System.out.println("��λΪ��"+bai+"\n���Ϊ��"+sui);
		
		if(bai == sui) {
			
			System.out.println("���˽���");
			
		}else {
			
			System.out.println("����ȥ�ɡ�");
			
		}
	}

}
