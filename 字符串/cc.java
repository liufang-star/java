package �ַ���.txt;

public class cc {
	
	                                                                      //�ַ�������

	public static void main(String[] args) {
		
		//��1����ȡ���ַ�����ʹ��substring��������
		
		//1����ȡ�ַ�������һ�ַ�������ȡ��ʼλ�õ���������
		String a = "123456200103211314";
		String index = a.substring(6);
		System.out.println("��ȡ��ʼλ�õ�����������Ϊ��"+index);
		
		
		//2�����ڶ��ַ�������ȡ��ʼλ�õ�ָ������λ�ã���
		String b = "123456200103211314";
		String index1 = b.substring(6,14);
		System.out.println("��ȡ��ʼλ�õ�ָ��������λ��Ϊ���������ڣ�~����"+index1);
		System.out.println();
		
		
		
		
		
		//��2��ȥ���ո�ʹ��trim������ȥ����β�հף���replaceAll������ȥ�����пհ��ַ�������
		
		//1��ȥ����λ�հ����ݣ�ʹ��trim��������
		String c = "    abc     ";//û�м�trim����֮ǰ��
		System.out.println("ԭ�ַ�����"+"["+c+"]");
		String shortstr = c.trim(); //ʹ��trim����֮��Ľ����ȥ����β�հ����ݣ�����β����
		System.out.println("ʹ��trim����֮����ַ�����"+"["+shortstr+"]");
		System.out.println();
		
		
		//2��ȥ���ַ��������пհ��ַ��������ַ����ڲ����ַ�����ʹ��replaceAll��������
		String d = "a b        c  d   e        f";
		System.out.println("ԭ�ַ�����"+"["+d+"]");
		String shortstr1 = d.replaceAll("\\s","");  //��һ��\\s��ʾ������ʽ���ڶ�����ʾ��������ʽ��ֵת����ʲô��û�У�
		System.out.println("ʹ��replaceAll����֮����ַ�����"+"["+shortstr1+"]");
		System.out.println();
		
		
		

		
		//��3���ַ����滻��ʹ��replace��������
		
		String e = "��ͷһ��һ����";
		System.out.println("ԭ�ģ�"+e);
		String replacestr = e.replace("һ","Ҽ");
		System.out.println("ʹ��replace�����滻֮��"+replacestr);
		System.out.println();
		
		
		
		
		
		//��4���ж��ַ����Ŀ�ʼ���β��ʹ��endswith��������β����startswith��������ʼ������
		
		//1����һ�֣�ʹ��endswith�����ж��Ƿ���java��β��
		String f = "HelloWorld.java";
		boolean bool1 = f.endsWith("java");
		boolean bool2 = f.endsWith(".jpg");
		System.out.println("�Ƿ���java��β��bool1����"+bool1);
		System.out.println("�Ƿ���java��β��bool2����"+bool2);
		
		//2���ڶ��֣�ʹ��stratswith�����ж��Ƿ����л���ͷ��
		String g = "�л����񹲺͹���";
		boolean bool3 = g.startsWith("�й�");
		boolean bool4 = g.startsWith("�л�");
		System.out.println("�Ƿ����л���ͷ��bool3����"+bool3);
		System.out.println("�Ƿ����л���ͷ��bool4����"+bool4);
		System.out.println();
		
		
		
		
		
		
		//��5���ж��ַ����Ƿ���ȣ�ʹ��equals��������
		
		//1�����������һ���Ǹ�ֵ��һ���Ǵ����������������𣡣�
		/*�ȷ�����ֵ��������ͬ������ϲ��ͬһ��Ů����ϲ���Ķ�����ͬ����
		 *     ��������������ͬ������ϲ��������ͬ��Ů������������ͬ��ϲ���Ķ���ͬ����
		 */
		String h = "tom";
		String i = "tom";
		System.out.println("���ø�ֵ�жϣ�"+(h == i));
		String h1 = new String("tom");
		String i1 = new String("tom");
		System.out.println( "���ô��������жϣ�"+(h1 == i1));
		
		//2��ʹ��equals������
		String h2 = new String("tom");
		String i2 = new String("tom");
		System.out.println("����equals�����жϣ�"+(h2.equals(i2)));
		System.out.println();
		
		
		
		
		
		//��6����ĸ��Сдת����ʹ��tolowercase������ת����Сд����touppercase������ת���ɴ�д������
		String j = "abc DEF";
		String low = j.toLowerCase();
		String up = j.toUpperCase();
		System.out.println("ԭ�ַ�����"+j);
		System.out.println("ת����Сд��"+low);
		System.out.println("ת���ɴ�д��"+up);
		System.out.println();
		
		
		
		
		
		//��7���ַ����ָʹ��split������
		String k = "192.168.1.1";
		String[] l = k.split("\\.");  //ע��:�ָ��ַ���Ҫ�����ţ����ҽ��зָ���Ҫ�õ�\\��ת���ַ���!
		String[] m = k.split("\\.",2);
		System.out.println("ԭ�ַ�����"+k);
		for(String l1 : l) {
			System.out.println("ʹ��split�����ָ��ַ�����"+"["+l1+"]");
		}
		for(String m1 : m) {
			System.out.println("ʹ��split�����������ηָ"+"["+m1+"]");
		}
		System.out.println("û��ʹ��for�����Ľ����"+l);
		
	}

}
