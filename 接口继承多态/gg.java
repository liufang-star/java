package �ӿڼ̳ж�̬.txt;

                                                         //���������أ�

public class gg {
	/*
	 * �������ص�����������
	 *                 ��1����������ͬ����������Ͳ�ͬ��
	 *                 ��2����������ͬ������Ĳ���������ͬ.
	 *                 ��3����������ͬ������Ĳ���˳��ͬ
	 */

	public static void main(String[] args) {
		System.out.println("��һ�֣���������ͬ����������Ͳ�ͬ����");
		System.out.println("����int add(int a)������"+add(1));
		System.out.println("����double add(double b)������"+add(1.2)+"\n");
		
		System.out.println("�ڶ��֣���������ͬ������Ĳ���������ͬ����");
		System.out.println("����int add(int a)������"+add(1));
		System.out.println("����int add(inta,int b)������"+add(12,15)+"\n");
		
		System.out.println("�����֣���������ͬ������Ĳ���˳��ͬ����");
		System.out.println("����double add(int a,double b)������"+add(12,34.0));
		System.out.println("����double add(double b,int a)������"+add(13.5,12));

	}
	
	static int add(int a) {  //��ͨ������
		return a;	
	}
	
	static double add(double b) {  //��int add(int a)����Ĳ������Ͳ�ͬ��
		return b;
	}
	
	static int add(int a,int b) {
		return a*b;
	}
	
	static double add(int a,double b) {  //��double add(double b)����ķ�������������ͬ��
		return a+ b;
	}
	
	static double add(double b,int a) {  //��double add(int a,double b)����Ĳ���˳��ͬ��
		return a-b;
	}

}
