package Enum_;

                                                           //ö������
/*
 * ����ö�����ͳ�Ա�ķ�����
 *      ��1��values()���÷������Խ�ö�����ͳ�Ա���������ʽ����    ö����������.values()
 *      ��2��valueOf()���÷�������ʵ�ֽ���ͨ�ַ���ת��Ϊö��ʵ��    ö����������.valueOf("abc")
 *      ��3��compareTo():�÷������ڱȽ�����ö�ٶ����ڶ���ʱ��˳��     ö�ٶ���.compareTo()
 *      ��4��ordinal()���÷������ڵõ�ö�ٳ�Ա��λ������     ö�ٶ���.ordinal()
 *      
 *      
 * ע�⣺
 *        ÿһ��ö��ʵ������һ�����󣬲������κ�ֵ��
 *    
 * �ص㣺
 *        ���Ͱ�ȫ��������Ч�����ݶ��塢���Ժͳ�������������������������Ч�ʸߡ�
 */

public class values_valueOf_compareTo_ordinal {
	
	enum Constants{     //������������ö��������
		Constants_A,Constants_B,Constants_C,Constants_D,liufang_E
	}
	
	
	
public static void main(String[] args) {
	
	System.out.println("ʹ����values()������");
	for(int i =0;i < Constants.values().length;i++) {   //ʹ��values()�������������ʽ����
		
		System.out.println("ö�����ͳ�Ա��ֵ��"+Constants.values()[i]);   //��ö�ٳ�Ա������ӡ
		
	}
	
//	for(Constants tmp : enumArray) {
//		System.out.println("foreach�����ö�����ͳ�Ա��ֵ��"+tmp);
//	}
	
	
	
	
	System.out.println();
	System.out.println("ʹ����valuesOf()������");
	Constants c1 = Constants.Constants_A;
	
	 //�Ƚϵ�ֵҪ��ö���е���ֵһ��������ᱨ��
	Constants c2 = Constants.valueOf("Constants_A");     //ʹ��valuesOf()����
	System.out.println("c1��c2�Ƿ���ȣ�"+(c1 == c2));
	
	
	
	
	System.out.println();
	System.out.println("ʹ����compareTo()������");
	Constants c3 = Constants.Constants_B;
	Constants array[] = Constants.values();
	
	for(int i = 0;i < array.length;i++) {
		//ʹ����compareTo()����
		System.out.println(c3+"��"+array[i]+"�ıȽϽ��Ϊ��"+c3.compareTo(array[i]));
	}
	
	
	
	
	System.out.println();
	System.out.println("ʹ����ordinal()������");
	Constants array1[] = Constants.values();
	for(int j = 0;j < array1.length;j++) {
		//ʹ����ordinal()����
		System.out.println(array1[j]+"��ö���е�����Ϊ��"+array[j].ordinal());
	}
}
}
