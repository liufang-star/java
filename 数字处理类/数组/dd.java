package ����.txt;

import java.util.Arrays;

public class dd {
	
	                                //����Ļ�������

	public static void main(String[] args) {
		//��1���������Ԫ�أ�ʹ��Arrays.fill()��������
		
		//1���������Ԫ�أ�һ��
		int a[] = new int[5];   //����һ������Ϊ5��һά���顣
		a[0] = 7;        //ע�⣺���ķ���ǰ�����������Ĳ���������ᱻ���ǣ�
		Arrays.fill(a, 10);
		for(int i = 0; i < a.length;i++) {
			System.out.println("��"+i+"��Ԫ�ص�ֵΪ��"+a[i]);
		}
		System.out.println();
		
		//2���������Ԫ�أ�2��
		int b[] = {1,2,3,4,5,6,7,8,9};
		Arrays.fill(b,2,5,0);   //������λ��Ϊ2��5֮ǰ�����ָ�Ϊ0��ע�⣺����Ϊ5��λ�����ֲ���ı䣡
		for(int i = 0; i < b.length;i++) {
			System.out.println("��"+i+"��Ԫ�ص�ֵΪ��"+b[i]);
		}
		System.out.println();
		
		
		
		//��2�������滻����Ԫ��
		int c[] = {1,8,7,7,9,0,5,9,1,8,1};
		Arrays.fill(c, 3,7,0); //������λ��Ϊ3��7��λ���滻��0
		for(int i =0;i <c.length;i++) {
			if(c[i] == 0) {
				System.out.print("*");    //��0�滻���Ǻţ�
			}
			else {
				System.out.print(c[i]);
			}
		}
	}

}
