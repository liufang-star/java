package ��Ͷ���.txt;

                                       //��̬����������static public void ������ { } ����

/*�ŵ㣺�������еľ�̬�������贴����Ķ���*/

public class ff {
	
	static {   //��̬����飡
		System.out.println("�����Ǿ�̬����飡");
	}
	
	{     //�Ǿ�̬����飡
		System.out.println("�����ǷǾ�̬����飡");
	}
	
	public ff(){    //���췽����
		System.out.println("�����ǹ��췽����");
	}
	
	public void mehod() {   //��Ա��������Ҫ���������ã�
		System.out.println("�����ǳ�Ա������");
	}
	
	static public void show(){     //��̬������ֻ��Ҫ���þͿ��ԣ�
		System.out.println("�����Ǿ�̬������");
	}

	public static void main(String[] args) {    //���������������ڵ㣡����
		ff e = new ff();   //����ʵ�����������ճ�Ա������ֵ��
		e.mehod();  //���ó�Ա������
		
		ff.show();   //���þ�̬����ʱ����Ҫ����ʵ������

	}

}
