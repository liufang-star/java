package ����.txt;

import java.util.Arrays;

public class ee {
                        
	                                  //����Ļ�������
	
	public static void main(String[] args) {
		
		//��1���������������ʹ��Arrays.sort()��������
		//1���������򣡣�int��
		int a[] = {45,12,78,89,23,46,79,13};
		System.out.println("ԭ����Ϊ��");
		for(int j : a) {
			System.out.print(""+j+" ");
		}
		System.out.println();
		System.out.println();
		Arrays.sort(a);
		System.out.println("����֮�������Ϊ��");
		for(int i : a) {
			System.out.print(i+" < ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//С�������򣡣���double��
		double b[] = {12.0,45.0,2.0,1.0,23.123,456.12,89,564,45,12};
		System.out.println("ԭ����Ϊ��");
		for(double i : b) {
			System.out.print(i+"    ");
		}
		System.out.println();
		Arrays.sort(b);
		System.out.println();
		System.out.println("����֮�������Ϊ��");
		for(double k : b) {
			System.out.print(k+" < ");
		}

	}

}
