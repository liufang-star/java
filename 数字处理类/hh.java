package ���ִ�����.txt;

                          //�����������㣡��ʹ��BigInteger��������

import java.math.BigInteger;

//����BigInteger��������ѧ���㣡�����������⾫�ȵ�����������

public class hh {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("99");    //ʵ����һ�����֣�
		BigInteger b = BigInteger.valueOf(99999L);
		
		System.out.println("�ӷ�������"+a.add(new BigInteger("1")));
		System.out.println("����������"+a.subtract(new BigInteger("10")));
		System.out.println("�˷�������"+a.multiply(new BigInteger("78")));
		System.out.println("����������"+a.divide(new BigInteger("3")));
		System.out.println("ȡ�ô����ֳ���6���̣�"+a.divideAndRemainder(new BigInteger("3"))[0]);
		System.out.println("���������"+a.remainder(new BigInteger("5")));
		System.out.println();
		
		System.out.println("���ݲ�����"+a.pow(10));
		System.out.println("�Ƚϴ�С��"+a.compareTo(new BigInteger("90")));
		System.out.println("�Ƚ���ȣ�"+a.equals(new BigInteger("99")));
		System.out.println("ȡ���ֵ��"+a.max(b));
		System.out.println("ȡ��Сֵ��"+a.min(b));
		System.out.println();
		
		System.out.println("ȡ�����ֵ��෴����"+a.negate());
		System.out.println();
		
		//�����Լ������~��
		BigInteger c = new BigInteger("456789");
		BigInteger d = new BigInteger("123465");
		
		System.out.println(c+ "��"+d+"�����Լ��Ϊ��"+c.gcd(d));

	}

}
