package �ַ���.txt;

import java.util.Scanner;

public class ff {
	
	                        //ʹ��������ʽ

	public static void main(String[] args) {
		
		//��2��ʹ��������ʽ�ж��Ƿ�Ϊ�ֻ����룡
		
				Scanner kk = new Scanner(System.in);
				System.out.println("���������ĵ绰���룺");
				String regex1 = "(13[0-9]|15[012356789]|18[056789])\\d{8}";
				while(true) {
					String kk1 = kk.nextLine();
					if(kk1.matches(regex1)) {
						System.out.println("������ȷ��");
						break;
					}
					else {
						System.out.println("����������������룺");
					}
				}

	}

}
