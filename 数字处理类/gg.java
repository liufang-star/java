package ���ִ�����.txt;

                                                   //Random�࣡

import java.util.Random;


public class gg {

	public static void main(String[] args) {
		Random r = new Random();   //ʵ����һ��random�࣡
		
		//�������һ��������
		System.out.println("�������һ������Ϊ��"+r.nextInt());
		
		//�������һ�����ڵ���0��С��10��������
		System.out.println("�������һ�����ڵ���0С��10������Ϊ��"+r.nextInt(10));
		
		//�������һ���������͵�ֵ��
		System.out.println("�������һ���������͵�ֵΪ��"+r.nextBoolean());
		
		//�������һ��˫�����͵�ֵ��
		System.out.println("�������һ��˫���ȵ�ֵΪ��"+r.nextDouble());
		
		//�������һ�������͵�ֵ��
		System.out.println("�������һ�������͵�ֵΪ��"+r.nextFloat());
		
		//�������һ�������ܶ�Ϊ��˹�ֲ���˫����ֵ
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ���˫���ȵ�ֵΪ��"+r.nextGaussian());
		
	}

}
