package ��װ��;

                                //Byte����byte����װ�ࣩ��ʹ�÷�����

public class cc {
	/*Byte������ֹ��췽����
	 *           ��1��Byte(byte value)  :  ����Byte���󣬿ɱ�ʾָ����byte����
	 *                             ʵ����byte mybyte  =45;
	 *                                        Byte b = new Byte(mybyte);
	 *                                        
	 *           ��2��Byte(String str)  :  ����Byte���󣬿ɱ�ʾString������ָʾ��byteֵ��
	 *                             ʵ����Byte mybyte = new Byte("12");
	 */

	public static void main(String[] args) {
		
		System.out.println("byte���͵����ֵ��max_value��Ϊ��"+Byte.MAX_VALUE);
		System.out.println("byte���͵���Сֵ��min_value��Ϊ��"+Byte.MIN_VALUE);
		System.out.println("byte���͵ĳ��ȣ�size��Ϊ��"+Byte.SIZE);
		System.out.println("byte���͵ķ������ͣ�type��Ϊ��"+Byte.TYPE);
		System.out.println();
		
		byte b =15;
		Byte b1 = new Byte(b);    //�������󣡸�ֵ��b��
		Byte b2 = Byte.valueOf(b);   //����һ������ָ��String��������ֵ��Byte����
		System.out.println("ʹ�ô������󷽷���ȡb1��ֵΪ��"+b1);
		System.out.println("ʹ��valueOf������ȡb2��ֵΪ��"+b2);
		System.out.println("���ַ����Ľ���Ƿ���ȣ���"+b1.equals(b2));
		System.out.println();
		
		Byte b3 = Byte.valueOf("50");   //ͨ����string����50ת����byte���������
		System.out.println("ʹ��valueOf�������и�ֵ��b3��Ϊ��"+b3);
		System.out.println();
		
		String s = "100";
		byte b4 = Byte.valueOf(s).byteValue();   //���ַ�������ת����byte���ͣ�
		byte b5 = Byte.parseByte(s);     //parseByte����byte�������ͣ�
		System.out.println("b4��ֵΪ��"+b4);
		System.out.println("ʹ��valueOf(s).byteValue()�� parseByte(s)�ж��Ƿ���ȣ���"+(b4 == b5));

	}

}
