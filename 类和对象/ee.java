package ��Ͷ���.txt;

                                            //��̬��������final static�ؼ��֣���

/*Ӧ�ã�����Ҫ�ڶ��class��Ĺ��췽����public ��������ʹ��ͬһ������ֵ��
 * ���禰��3.1415925����
 *�Ϳ���ʹ��final static�ؼ��֣� 
 */

public class ee {    //��ee    ��Ա������
	
	final static double PI = 3.1415926535;   //ʹ�þ�̬������ֵ��
	
	public static void main(String[] args) {    //��������
		
		circular a = new circular(3.0);     //����Բ�İ뾶��
		spherical b = new spherical(4.0);    //������İ뾶��
		//ee.PI = 1.1;   ע�⣺��ʹ�þ�̬������final static��ʱ��ֵ�����Ա��ı䣡��
	}
}
	
	class circular{     //����һ��class�࣡
		double radius;
		double area;
		public circular(double radius) {     //����һ�����������췽����
			this.radius = radius;    //������ֵ�������еĳ�Ա������
			area = ee.PI *radius *radius;   //Բ�����ʽ��
			System.out.println("Բ�İ뾶Ϊ��"+radius);
			System.out.println("Բ�����Ϊ��"+area);
		}
	}
	
	class spherical{    //����һ��class�࣡
		double radius;
		double valume;
		public spherical(double radius) {    //����һ�����ι��췽����
			this.radius = radius;   //������ֵ�������еĳ�Ա������
			valume = 4/3 * ee.PI * radius * radius *radius;  //�������ʽ��
			System.out.println("��뾶Ϊ��"+radius);
			System.out.println("�����Ϊ��"+valume);
		}
	
}
