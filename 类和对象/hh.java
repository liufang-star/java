package ��Ͷ���.txt;

                                  //���ʶ�������Ժ���Ϊ����call��������

public class hh {
	
	int i = 47;     //�����Ա����i��ֵ��
	
	public void call() {     //�����Ա������
		System.out.println("����call()������");
		for(int i = 0;i < 3;i++) { 
			System.out.print(i+"  ");
		}
		System.out.println();
		
	}

	
	public hh() {    //���幹�췽����
		
	}

	
	public static void main(String[] args) {
		hh t1 = new hh();   //����һ������
		hh t2 = new hh();   //������һ������
		t2.i = 60;   //����Ա������ֵΪ60��
		
		//ʹ�õ�һ������������Ա������
		System.out.println("��һ��ʵ��������ñ���i�Ľ��Ϊ��"+t1.i);
		t1.call();
		System.out.println();
		
		//ʹ�õڶ�������������º�Դ������
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ��Ϊ��"+t2.i);		
		t2.call();

	}

}
