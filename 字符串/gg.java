package �ַ���.txt;

public class gg {
	 
	                       //�ַ���������
	/*string��stringbuffer��stringbuilder���ߵ�����
	 * stringռ���ڴ�ߣ��̲߳���ȫ��Ч�ʵͣ���֧��׷��append��ɾ��delect������insert�ȷ�����
	 * stringbuffer�̰߳�ȫ��֧�ֶ��̣߳���Ч���еȡ�֧��append��delect��insert�ȷ�����
	 * stringbuilder�̲߳���ȫ��֧�ֵ��̣߳�����֧�ֶ��̣߳���Ч�ʸߣ�ͬ��֧��append��delect��insert�ȷ�����
	 */

	public static void main(String[] args) {
		//1������ʫ��������Ϊ���߲�����������������
		StringBuffer aa = new StringBuffer("��ʫ����");
		aa.delete(0, 2);
		System.out.println(aa.toString());
		aa.insert(1, "�߲���");
		System.out.println(aa.toString());
		aa.append("������������");
		System.out.println(aa.toString());
		System.out.println();
		
		
		
		StringBuilder bb = new StringBuilder("hello");
		bb.insert(5, "world");
		System.out.println(bb);
		System.out.println();
		
		

		StringBuilder cc = new StringBuilder("StringBuilder");
		cc.delete(5, 10);
		System.out.println(cc);
		
		
	}

}
