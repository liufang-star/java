package �ӿڼ̳ж�̬.txt; 

                                    //object�ࣨ������ĸ��࣡����

/*    �ص㣺object������ֳ��÷���:
 * ��1��getClass()���������ض���ִ��ʱ��Classʵ����
 * ��2��toString()�����������󷵻�Ϊ�ַ�����ʽ��
 * ��3��equals()�������Ƚ����������Ƿ���ȡ�
 */

public class cc {


	public static void main(String[] args) {
		Object[] arr = new Object[4];
		
		//Object����Ա����κ�һ����Ķ���
		arr[0] = new Object();
		arr[1] = new String("�ַ���");
		arr[2] = new Integer(10);
		arr[3] = new cc();
		
		System.out.println("ʹ��getClass()������");
		for(Object obj :arr) {
			System.out.println(obj.getClass());
		}
		System.out.println();
		
		System.out.println("ʹ��toString()������");
		for(Object obj :arr) {
			System.out.println(obj.toString());
		}
		System.out.println();
		
		System.out.println("ʹ��equals()������");
		System.out.println(arr[0].equals(arr[3]));
		
	}
	public String toString() {
		return "����cc�࣡";
		
	}
	

}
