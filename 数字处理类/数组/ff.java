package ����.txt;

import java.util.Arrays;

public class ff {
        
	                               //����Ļ�������
	
	public static void main(String[] args) {
		//��1���������飨ʹ��Arrays.copyOf������������λ��Ϊ0��ʼ���ƣ���
		
		int a[] = {4,5,6,7,8,9};
		System.out.println("ԭ����Ϊ��");
		for(int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("����֮�������Ϊ��");
		int b[] = Arrays.copyOf(a, 3);   //������λ��Ϊ0��3���и��ƣ�
		for(int k : b) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println();
		
		
		
		//��2���������飨ʹ��Arrays.copyOfRange������ָ��������ʼ�ͽ���λ�ÿ�ʼ���ƣ���
		
				int d[] = {1,2,3,4,5,6,7,8,9};
				System.out.println("ԭ����Ϊ��");
				for(int i : d) {
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println("����֮�������Ϊ��");
				int e[] = Arrays.copyOfRange(d, 3,5);   //ָ������λ��Ϊ3��5��λ�ý��и��ƣ�
				for(int k : e) {
					System.out.print(k+" ");
				}
				
		

	}

}
