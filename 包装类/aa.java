package ��װ��;

                                         //��������Integer����װ�ࣩ��ʹ�÷�����

public class aa {
	
	/*Integer������ֹ��췽����
	 *            ��1��Integer (int number)       ��   ��һ��int�ͱ���Ϊ��������ȡInteger����
	 *                    ʵ����Integer number = new Integer(7);
	 *                    
	 *           ��2��Integer(String str)   :    ��һ��String�ͱ���Ϊ��������ȡInteger����
	 *                    ʵ����Integer number = new Integer("45");
	 */

	public static void main(String[] args) {
		
		System.out.println("int���͵����ֵ��max_value��Ϊ��"+Integer.MAX_VALUE);
		System.out.println("int���͵���Сֵ��min_value��Ϊ��"+Integer.MIN_VALUE);
		System.out.println("int���͵ĳ��ȣ�size��Ϊ��"+Integer.SIZE);
		System.out.println("int���͵ķ������ͣ�type��Ϊ��"+Integer.TYPE);
		System.out.println();
		
		System.out.println("ͨ��ʵ�������󴴽����ֲ�ͬ���͵Ķ���");
		Integer inte1 = new Integer(123);
		System.out.println("��int�ͱ���Ϊ��������ȡInteger����Ϊ��"+inte1);
		Integer inte2 = new Integer("123456789");
		System.out.println("��String�ͱ���Ϊ��������ȡInteger����Ϊ��"+inte2);
		Integer inte3 = Integer.valueOf("987654321"); //valueOf����������int�ͱ���Ҳ������String�ͱ�����
		System.out.println("ʹ��valueOf������ȡInteger����Ϊ��"+inte3);
		System.out.println();
		
		int num1 = Integer.parseInt("789");   //parseInt(String s): ������ʮ���Ʋ�����ʾ������ֵ��
		System.out.println("ʹ��parseInt��������ʮ��������ֵΪ��"+num1);
		int num2 = inte2.intValue();//intValue()��java.lang.Number��ķ�����
		System.out.println("ʹ��intvalue��������inte2��ֵΪ��"+num2);   //���Խ������㣬���磺+��num2-10��
		System.out.println();
		
		String str1 = Integer.toBinaryString(11);     //toBinaryString��������һ��������������
		System.out.println("11�Ķ����Ʊ�ʾΪ��ʹ��toBinaryString��������"+str1);
		String str2 = Integer.toHexString(11);  //toHexString��������һ��16����������
		System.out.println("11��ʮ�����Ʊ�ʾΪ��ʹ��toHexString��������"+str2);
		String str3 = Integer.toOctalString(11);  //toOctalString��������һ��8����������
		System.out.println("11�İ˽��Ʊ�ʾΪ��ʹ��toOctalString��������"+str3);
		String str4 = Integer.toString(1111,15);   //�Լ�ѡ�����ֺ�ת���Ľ�������
		     //toString(1111,15)��ʾ��������1111ת����15����������
		System.out.println("1111ת����15��������ʾΪ��ʹ��toString��������"+str4);
		

	}

}
