package �ַ���.txt;

public class bb {
	
	                          //��ȡ�ַ�����Ϣ

	public static void main(String[] args) {
		//��1����ȡ�ַ������ȣ�ʹ��length��������
		String a = "1234567890";
		String b = "12    456";     //ע�⣺�ո�Ҳ��һ���ַ���
		int size = a.length();
		int size1 = b.length();
		System.out.println("ԭ����Ϊ��"+a+"\t\t����Ϊ��"+size);
		System.out.println("ԭ����Ϊ��"+b+"\t\t����Ϊ��"+size1);
		System.out.println();
		
		
		
		
		
		//��2���ַ������ң�ʹ��indexOf��������
		String str1 = "8888";
		String str2 = "B888";
		if(str1.indexOf("B") == -1) {    //����-1��ʾ������������
			System.out.println(str1+"������B�����ĸ��");
		}
		if(str2.indexOf("B")>-1) {    //����-1��ʾ����������
			System.out.println(str2+"����B�����ĸ��");
		}
		System.out.println();
		
		
		
		
		
		
		//��3����ȡָ������λ�õ��ַ�
		//1����ȡ��һ�γ��ֵ�����λ�ã���ʹ��indexOf��������
		String c = "we are the world!";
		System.out.println("ԭ�ַ���Ϊ��"+c);
		int index = c.indexOf("e");
		System.out.println("��ĸe��һ�γ��ֵ�����λ��Ϊ��"+index);
		
		//2����ȡ��һ��ָ����λ�ÿ�ʼ����
		String d = "we are the world!";
		int index1 = d.indexOf("e",3); //������λ��3��ʼ������ĸe��
		System.out.println("��ĸe������λ��Ϊ3��ʼ���ҵ�λ��Ϊ��"+index1);
		
		//3����ȡ������һ�γ��ֵ�����λ�ã���ʹ��lastIndexOf���������һ�γ��ֵ�����λ�á���
		String e = "we are the world!";
		int index2 = e.lastIndexOf("e");
		System.out.println("��ĸe���һ�γ��ֵ�����λ��Ϊ��"+index2);

	}

}
