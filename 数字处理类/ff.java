package ���ִ�����.txt;

import java.util.Random;
import java.util.Scanner;

                                                            //random�࣡

//΢�ŷ��������

public class ff {

	public static void main(String[] args) {
		
		System.out.println("---------------------΢�������-------------------------");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ܽ�Ԫ����");
		double total = sc.nextDouble();
		System.out.println("���������ĸ�����������");
		int bagCount = sc.nextInt();
		
		double min = 0.01;  //�����С��
		Random c = new Random();
		
		for(int i = 1; i < bagCount;i++) {
/*
* ���κ�������õ������ = �ɷ���Ľ�� - ��������� - �ѷ����ĺ������* �������С���
 */
			double max = total - (bagCount -i) * min;
			double bound = max - min;
			
			double safe = (double)c.nextInt((int)(bound*100))/100;
			double money = safe + min;
			total = total - money;
			System.out.println("��"+i+"�������"+String.format("%.2f", money)+"Ԫ");
		}
		System.out.println("��"+bagCount+"�������"+String.format("%.2f", total)+"Ԫ");
		sc.close();

	}

}
