package ��װ��;

                               //��������Boolean����װ�ࣩ��ʹ�÷�����

public class bb {
	
/*Boolean������ֹ��췽����
 *               ��1��Boolean(boolean value)  ��  ����һ����ʾvalue������Boolean����
 *                                 ʵ����Boolean b = new Boolean(ture);
 *                                 
 *               ��2��Boolean(String str)  :  ��String������Ϊ��������Boolean����
 *                                 ʵ����Boolean bool = new Boolean("ok");
 */
	

	public static void main(String[] args) {
		System.out.println("Boolean���͵ļ٣�"+Boolean.FALSE);
		System.out.println("Boolean���͵��棺"+Boolean.TRUE);
		System.out.println("�������͵ķ���ֵ���ͣ�"+Boolean.TYPE);
		System.out.println();
		
		Boolean b1 = Boolean.valueOf(true);  //����true��
		Boolean b2  = Boolean.valueOf("     ");  //���ֵ����true��Ĭ��Ϊfalse����
		System.out.println("Boolean���͵ķ���ֵ��b1��Ϊ��"+b1);
		System.out.println("Boolean���͵ķ���ֵ��b2��Ϊ��"+b2);
		System.out.println();
		
		boolean bool = Boolean.parseBoolean("ok");    //parseBoolean��ʾ����boolean��������ֵ��
		if(bool) {
			System.out.println("BoolΪ�棡");
		}else {
			System.out.println("BoolΪ�٣�");
		}

	}

}
