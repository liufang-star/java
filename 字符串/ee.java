package �ַ���.txt;

import java.util.Scanner;

public class ee {
	
	                                                     //ʹ��������ʽ�ж��Ƿ�Ϊ��ȷ�����䣡

	public static void main(String[] args) {
		int count = 0;
		Scanner koko = new Scanner(System.in);
		System.out.println("�������������䣺");
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		while(true) {
			String kk = koko.nextLine();
		if(kk.matches(regex)) {
			System.out.println("������ȷ��");
		}else {
			count++;
			if(count>=3) {
				System.out.println("���Ѿ�����������������ѱ�������");
				break;
			}else {
				System.out.println("���Ѿ�"+count+"����������㻹��"+(3-count)+"�λ��ᣡ");
				continue;
			}
		}
	

	}

}
}