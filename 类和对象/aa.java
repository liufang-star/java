package ��Ͷ���.txt;

                                                 //��

/*������������Ƶ������ص㣺��1����װ����2���̳С���3����̬
 * 
 * �Լ���Ա�����;ֲ�����������
 * public class ���������ڳ�Ա����������public   �������ֲ���������
 * ��Ա�����������Ա������ͬʱ���Բ���Ҫ������и�ֵ����
 * �ֲ�����������ֲ�������ͬʱһ��Ҫ������и�ֵ������ᱨ����
 * 
 * Ȩ�����η���Ҫ�������֣���1��private����2��protected����3��public
 * �ص㣺         ����                          ͬ�������������                       ���������������
 *private          �ɼ�                              ���ɼ�                                           ���ɼ�
 *protected     �ɼ�                                �ɼ�                                             ���ɼ�
 *public            �ɼ�                                �ɼ�                                             �ɼ�
 */


public class aa {        //��Ա�ࣨ��Ա�������ڶ������ʱ����Ҫ������и�ֵ����
	private String name;     //��Ա���������Բ�������и�ֵ��

	public String getName() {//�ֲ���������ע�⣺�ڶ������ʱ��Ҫ������и�ֵ������ᱨ����
		int id = 0;        //�ֲ�����
		setName("java");    //�������е�����������
		System.out.println(id +name);      //���id��name��ֵ��
		return id + this.name;     //���÷�������ֵ��
	}

	private void setName(String name) {     //����һ��setName()������
		this.name = name;      //������ֵ�������еĳ�Ա������

	}
	public static void main(String[] args) {       //����������������
		aa test = new aa();   //����test��ʵ������
		test.getName();   //���ã�
	}

}
