package �ַ���.txt;

import java.util.Date;

public class dd {
	
	                                 //��ʽ���ַ�����ʹ��format�������и�ʽ���ַ�������

	public static void main(String[] args) {
		
		//��1�����ں�ʱ���ַ�����ʽ����ʹ��format�������и�ʽ����
		
		Date date = new Date();
		String s = String.format("%tF",date);
		System.out.println("ԭ�ַ���ʱ�䣺"+date);
		System.out.println("ʹ��format��ʽ���ַ���֮���ʱ�䣺"+s);
		System.out.println();
		
		
		String year = String.format("%tY", date); //%tY��ʾ��ȡ��ǰ��ݡ�2020��
		String month = String.format("%tB", date); //%tB��ʾָ�����Ի������·�ȫ�ơ�February��Ӣ�ģ������£����ģ�
		String tian = String.format("%te", date);  //%te��ʾһ�����е�ĳһ�졣
		System.out.println("�����ǣ�"+year+"��"+"\t�����ǣ�"+month+"\t�����ǣ�"+tian+"��");
		System.out.println();
		
		
		String hour = String.format("%tH", date);  //%tH��ʾ��2λ���ֵ�24Сʱ�Ƶ�Сʱ��00-23����
		String minte = String.format("%tM", date);  //%tM��ʾ��2λ���ֵķ��ӣ�00-59����
		String miao = String.format("%tS", date);  //%tS��ʾ��2λ���ֵ�������00-60����
		String wu = String.format("%tp", date);  //%tp��ʾ�����������
		System.out.println("�����ǣ�"+hour+"ʱ"+minte+"��"+miao+"��\t"+wu);
		System.out.println();
		
		
		String str1 = String.format("%tF", date);   //����- ��-�ա���ʽ��4λ��ݣ�
		System.out.println("%tF��ʽ��"+str1);
		String str2 = String.format("%tD", date);   //����/��/�ꡱ��ʽ��2λ��ݣ�
		System.out.println("%tD��ʽ��"+str2);
		String str3 = String.format("%tc", date);   //ȫ�����ں�ʱ����Ϣ
		System.out.println("%tc��ʽ��"+str3);
		String str4 = String.format("%tr", date);   //��ʱ:��:�� PM(AM)����ʽ��12ʱ�ƣ�
		System.out.println("%tr��ʽ��"+str4);
		String str5 = String.format("%tA", date);   //����---
		System.out.println("%tA��ʽ��"+str5);
		String str6 = String.format("%tT", date);   //��ʱ:��:�� ����ʽ��24ʱ�ƣ�
		System.out.println("%tT��ʽ��"+str6);
		String str7 = String.format("%tR", date);   //��ʱ:�֡���ʽ��24ʱ�ƣ�
		System.out.println("%tR��ʽ��"+str7);
		System.out.println();
		
		
		
		
		
		
		
		//(2)�������͸�ʽ��
		
		String kk = String.format("��ĸx�Ĵ�дΪ��%c", 'X');
		System.out.println(kk);
		System.out.println(String.format("123456+456789�Ľ��Ϊ��%d", 123456+456789));
		System.out.println(String.format("Բ����ȡ��λС��Ϊ��%.2f", Math.PI));
		System.out.println(String.format("1200000000.1�ÿ�ѧ��������ʾΪ��%e", 1200000000.1));
		System.out.println(String.format("2>3�� %b", 2>3));
		System.out.println(String.format("�������%d%%����к�%d%%�ĺ�ˮ��", 1,99));

	}

}
