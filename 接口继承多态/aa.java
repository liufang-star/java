package �ӿڼ̳ж�̬.txt;

                                                //��ļ̳У���extends�ؼ��֣���

                                  /* ���磺ƽ����Լ̳���̨ʽ���Ե����Ժ�ĳЩ������*/

public class aa {
	
	/*
	  ע�����
	    extends���̳У�������̳и��࣡
	 * ��1��������Ե��ø�������Ժͷ����������಻���Ե�����������Ժͷ�����
	  
	 * ��2��super�ؼ��֣������ø���Ĺ��췽���ͳ�Ա������
		                        ����������д��ʱ����ø���ԭ�еķ�������ʹ��super�ؼ��֣���
		         ��this�ؼ����÷�һ�������𣩣�
		                        this���õ��Ǳ�����󣻶�super���õ��Ǹ������
		                        
	* ��3��java�����У�һ����ֻ������һ�����࣡
	* ���磺�����ּ̳��Ǵ���ģ�����                   �����ַ����ǶԵģ�����̳У�����
	*  class Parent1{                                                      class Parent1 extends Parent2{
	*              }                                                                                     }
	*                     
	*  class Parent2{                                                     class Parent2{
	*              }                                                                          }
	*                     
	*  class child extend Parent1 Parent2{                  class child extends Parent1{
	*             }                                                                                     }
	* 
	*  ��4�����಻���Ḳ�Ǹ���ķ��������Ḳ�Ǹ�������ԣ�
	 */        

	public static void main(String[] args) {
		
		aa_computer com = new aa_computer();   //����"���ࣨaa_computer��"��һ������
		aa_pad ipad = new aa_pad();   //����"���ࣨaa_pad��"��һ������
		
		System.out.println("���ø�������Ժͷ��������Ϊ����");
		System.out.println(com.screen);    //����"���ࣨaa_conputer��"�����ԣ���
		com.startUp();   //����"����aa_computer"�ķ�����
		System.out.println();
		
		
		System.out.println("ͨ����������̳и�������Ժͷ��������Ϊ����");
		System.out.println(ipad.screen);
		ipad.startUp();
		System.out.println();
		
		
		System.out.println("������е����Ժͷ�����");
		ipad.open5G();
		System.out.println(ipad.battery);
		System.out.println();
		
		
		//com.open5G();
		
		//System.out.println(com.battery);
		
		
		/*��д��������͸�����ͬһ���£�����ɵķ�ʽ��ͬ����
		 * ���磺̨ʽ���Ժ�ƽ����ԣ���ͼƬ����
		*/
		System.out.println("��������д��");
		com.showPicture();
		ipad.showPicture();
		System.out.println();
		
		
		//super�ؼ��֣������ø���Ĺ��췽���ͳ�Ա������
		//����������д��ʱ����ø���ԭ�еķ�������ʹ��super�ؼ��֣���
		System.out.println("ʹ��supuer�ؼ��֣����ø���ķ���������");
		System.out.println(com.sayHello());
		System.out.println(ipad.sayHello());

	}

}
