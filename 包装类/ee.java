package ��װ��;

                        //С������Double����װ�ࣩ��ʹ�÷�����

public class ee {
	/*Double������ֹ��췽����
	 *               ��1��Double(double value)  :  ����double��������Double�����
	 *               
	 *               ��2��Double(String str)  :  ����һ���·����Double����
	 *                                                           ��ʾ���ַ�����ʾ��double���͵ĸ���ֵ��
	 */

	public static void main(String[] args) {
		System.out.println("double���͵����ֵΪ��max_value����"+Double.MAX_VALUE);
		System.out.println("double���͵���СֵΪ��min_value����"+Double.MIN_VALUE);
		System.out.println("double���͵ĳ���Ϊ��size����"+Double.SIZE);
		System.out.println("double���͵ķ���ֵ����Ϊ��type����"+Double.TYPE);
		System.out.println();
		
		Double num1 = new Double(11.23);
		Double num2 = new Double("45.56");
		System.out.println("Double������ֵΪ��"+num1);
		System.out.println("String����ת����Double���͵���ֵΪ��"+num2);
		System.out.println();
		
		Double num3 = Double.valueOf("78.89");
		System.out.println("ʹ��valueOf������ֵ����ֵΪ��"+num3);
		System.out.println();
			
		System.out.println(num1+"�Ƿ��Ƿ����֣�"+Double.isNaN(num1.doubleValue()));
		System.out.println(num3+"ת����intֵΪ��"+num3.intValue());
		System.out.println(num2+"��ʮ�����Ʊ�ʾΪ��"+Double.toHexString(num2.doubleValue()));
		System.out.println(num3+"��ʮ�����Ʊ�ʾΪ��"+Double.toHexString(num3.doubleValue()));


	}

}
