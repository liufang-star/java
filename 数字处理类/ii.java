package ���ִ�����.txt;

import java.math.BigDecimal;

                                                                 //���������㣡

public class ii {
	
//����BigDecimal�����������⾫�ȵ�С��������

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("30");
		BigDecimal b = BigDecimal.valueOf(7);
		
		//�ᱨ��30/7  �����������Բ�����divide������
		//System.out.println(a.divide(b));   
		
		//���壺a����b����22λС������a.divide(b,22,������ģʽ��)������
		System.out.println("30����7�Ľ��Ϊ��");
		
		//BigDecimal.ROUND_UP�������̵����һλ�������0������ǰ��λ������������ˣ�
		System.out.println("����22λС�������Ϊ����"+a.divide(b,22,BigDecimal.ROUND_UP));
		
		//BigDecimal.ROUND_UP���������̽������������������
		System.out.println("���һλ��λ�����Ϊ����"+a.divide(b,20,BigDecimal.ROUND_UP));
		
		//BigDecimal.ROUND_DOWN�������̵����һλ������ʲô���֣���ʡ�ԣ���
		System.out.println("�������һλ�����Ϊ����"+a.divide(b,20,BigDecimal.ROUND_DOWN));
		
		//BigDecimal.ROUND_CEILING�����������������������ROUND_UPģʽ����������Ǹ���������ROUND_DOWNģʽ������
		System.out.println("��ֵ��λ��ֵ���ԣ����Ϊ����"+a.divide(b,20,BigDecimal.ROUND_CEILING));
		
		//��BigDecimal.ROUND_FLOOR������Bigdecimal.ROUND_CEILING�����÷��෴��
		System.out.println("��ֵ���Ը�ֵ��λ�����Ϊ����"+a.divide(b,20,BigDecimal.ROUND_FLOOR)+"\n");
		
		
		System.out.println("30����60�Ľ��Ϊ��");
		b = new BigDecimal(60);
		
		//BigDecimal.ROUND_HALF_DOWN��������������һλС�ڵ���5���������������������5������λ��������
		System.out.println("������λС���Ľ����"+a.divide(b,2,BigDecimal.ROUND_HALF_DOWN));
		System.out.println("���� <= 5�Ľ����"+a.divide(b,0,BigDecimal.ROUND_HALF_DOWN));
		
		//BigDecimal.ROUND_HALF_UP�����������һλС��5�����������ڵ���5����λ��������
		System.out.println("���� < 5�Ľ��Ϊ��"+a.divide(b,0,BigDecimal.ROUND_HALF_UP)+"\n");
		
		
		/*
		 * BigDecimal.ROUND_HALF_EVEN������
		 * ����̵ĵ����ڶ�λΪ����������ROUND_HALF_UP����
		 * ���Ϊż��������ROUND_HALF_DOWN����
		 * �磺7.5��8��8.5��8��
		 */
		BigDecimal result = a.divide(b,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(result+"��EVENģʽ���Ϊ��"+a.divide(b,0,BigDecimal.ROUND_HALF_EVEN)+"\n");
		
		System.out.println("30����20�Ľ��Ϊ��");
		b = new BigDecimal(20);
		result = a.divide(b,2,BigDecimal.ROUND_HALF_UP);
		System.out.println(result+"��EVENģʽ���Ϊ��"+a.divide(b,0,BigDecimal.ROUND_HALF_EVEN));
		

	}

}
