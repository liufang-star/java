package Enum_;

                                             //���ͣ������Ϻ�����ת�ͣ�

/*
 * ʵ�ʣ�ʹ����Ա���尲ȫ�����ͣ�
 * 
 * ���
 *          ��û�г��ַ���֮ǰ��Java�ṩ�˶�Object������"���⻯"����
 *          ����"���⻯"�������Ƕ�Object���ý�������ת�ͼ�����ת�Ͳ�����
 */


public class Xiangxia_Xiangshang_ZhuanXing {
	
	public Object getB() {       //������Ӧ��getXXX()����
		return b;
	}

	public void setB(Object b) {       //������Ӧ��setXXX()����
		this.b = b;
	}

	private Object b;       //����Object���ͳ�Ա����

	public static void main(String[] args) {
		
		Xiangxia_Xiangshang_ZhuanXing t = new Xiangxia_Xiangshang_ZhuanXing();
		t.setB(new Boolean(true));     //����ת�Ͳ���
		System.out.println(t.getB());
		
		t.setB(new Float(12.3));
		Float f = (Float)(t.getB());     //����ת�Ͳ���
		System.out.println(f);
		
		
		

	}

}
