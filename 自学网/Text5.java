package zixuewang;

import java.util.Scanner;

                           //��������ϵͳ... ...

public class Text5 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		String pName1 = "ƻ��";
		double pPrice1 = 9.9;
		String pNum1 = "1001";
		
		String pName2 = "�㽶";
		double pPrice2 = 3.9;
		String pNum2 = "1002";
		
		String pName3 = "����";
		double pPrice3= 7.9;
		String pNum3 = "1003";
		
		System.out.println("��ӭ������������ϵͳ��");
		System.out.println("��������Ʒ��ţ�\n");
		String num = s.next();
		System.out.println("��������Ʒ������\n");
		int count = s.nextInt();
		
		String pName = ""; //������Ʒ����
		double pPrice = 0; //������Ʒ�۸�
		
		if(num.equals(pNum1)) {
			pName = pName1;
			pPrice = pPrice1;
		}else if(num.equals(pNum2)) {
			pName = pName2;
			pPrice = pPrice2;
		}else if(num.equals(pNum3)) {
			pName = pName3;
			pPrice = pPrice3;
		}else {
			System.out.println("���޴���Ʒ��");
		}
		double total = count*pPrice;
		System.out.println("��������ǣ�"+pName+"\t\t���ۣ�"+pPrice+"\t������\t"+count+"\t�ܼۣ�"+total);
		
		System.out.println("�����븶���\n");
		double money = s.nextDouble();
		
		if(money<total) {
			System.out.println("���㣡\n");
		}else {
			System.out.println("�յ�"+money+"Ԫ������"+(money-total)+"Ԫ");
		}
		System.out.println("лл�ݹˣ�");
	}
	 
}