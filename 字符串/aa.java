package �ַ���.txt;

public class aa {
	
	                                  //String��

	public static void main(String[] args) {
		
		//��1�����ø�ֵ�����ַ�������
		String a = "ʱ����ǽ�Ǯ���ҵ����ѣ�";
		System.out.println(a);
		
		String b = "�����յ��硣", c = "С����Ģ����";
		System.out.println(b);
		System.out.println(c);
		
		String str1,str2;
		str1 = "we are students !";
		str2 = "we are family !";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		
		
		
		//��2�����ù��췽��ֱ��ʵ�����ַ�������
		String d = new String("�Ұ�����С����");   //ʹ��new����ʵ��������
		System.out.println(d);
		
		String e = new String(d);
		System.out.println(e);
		System.out.println();
		
		
		
		
		//��3�������ַ�����ʵ�����ַ���
		//1����һ��
		char[] charArray = {'t','i','m','e'};
		String f = new String(charArray);
		System.out.println(f);
		
		//2���ڶ���
		char[] charArray1 = {'ʱ','��','��','��','��','Ǯ'};
		String g = new String(charArray1,4,2);   //������λ��4��ʼȡ2���ַ���
		System.out.println(g);
		System.out.println();
		
		
		
		
		
		//��4�������ֽ�����ʵ�����ַ���
		byte[] byteArray = {-60,-6,-70,-61};  //��һ�������ǡ����á����ַ����������У���
		String h = new String(byteArray);
		System.out.println(h);

	}

}
