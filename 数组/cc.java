package ����.txt;

public class cc {
	
	                                     //����Ļ���������˫for��䣡����

	public static void main(String[] args) {
		
		//��1����������
		
		//1��ʹ��˫for��䣡
		int a[][] = new int[][] {{1},{2,3},{4,5,6}};  //�����ά����
		for(int k = 0;k < a.length;k++) {
			for(int j = 0;j < a[k].length;j++) {  //ѭ��������ά�����е�ÿ��Ԫ�ء�
				System.out.print(a[k][j]);   //�������е�Ԫ�����
			}
			System.out.println();   //����ո񣨻��У���
		}
		System.out.println();
		
		
		//2��ʹ��˫for������䣡
		int arr[][] = new int[][] {{4,3},{1,2}};  //�����ά����
		System.out.println("�����е�Ԫ���ǣ�");   //��ʾ��Ϣ
		int i = 0;               //���ѭ������������
		for(int c[] : arr) {       //���ѭ������Ϊһά����
			i++;        //������������
			int d = 0;       //�ڲ�ѭ��������
			for(int e : c) {       //ѭ������ÿһ������Ԫ��
				d++;         //�ڲ����������
				if(i == arr.length && d == c.length) {    //�жϱ����Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e);       //�����ά�����е����һ��Ԫ��
				}
				else {
					//������Ƕ�ά�����е����һ��Ԫ��
					System.out.print(e+"��");       //�����Ϣ
				}
			}
		}

}
}