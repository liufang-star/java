package ���ִ�����.txt;
import java.text.DecimalFormat;

                                        //���ָ�ʽ���������˱�ʾ��������������

/*ʮ�������ָ�ʽ���ࣨDecimalFormat��������
 *DecimalFormat myformat = new DecimalFormat(pattern);�� pattern��ʾ��ʽ��ģ�壡��
 */

public class aa {
	
	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ��
	static public void SimgleFormat(String pattern,double value) {  //���庬�εľ�̬������
		DecimalFormat myformat = new DecimalFormat(pattern);  //��ʽ��DecimalFormat����
		String output = myformat.format(value);  //�����ֽ��и�ʽ����
		System.out.println("ԭֵΪ��"+value+ "\nģ�壺 "+pattern+"\n��ʽ��֮���ֵΪ��"+output+"\n");
		
	}
	
	//ʹ��applyPattern()���������ֽ��и�ʽ����
	static public void UseApplyPatternMethodFormat(String pattern,double value) {   //�����������εľ�̬������
		DecimalFormat myformat = new DecimalFormat();  //ʵ����DecimalFormat����
		myformat.applyPattern(pattern);    //����applyPattern()�������ø�ʽ��ģ�壡
		System.out.println("ԭֵΪ��"+value+"\nģ�壺 "+pattern+"\n��ʽ��֮���ֵΪ��"+myformat.format(value)+"\n");
		
	}

	public static void main(String[] args) {
		SimgleFormat("###,###,###", 123456.789);  //���þ�̬SimgleFormat()������
		SimgleFormat("000000000.###kg", 123456.789);  //�����ֺ���ϵ�λ��
		//���ø�ʽģ���ʽ�����֣������ڵ�λ��0��ʾ��
		SimgleFormat("000000.000", 123.78);
		//���þ�̬UseApplyPatternMethodFormat()������
		UseApplyPatternMethodFormat("#.###%", 0.789);  //������ת��λ�ٷ�����ʽ��
		UseApplyPatternMethodFormat("###.##", 123456.789);  //��С������ʽ��Ϊ��λ��
		UseApplyPatternMethodFormat("0.00\u2030", 0.789);  //������ת��Ϊǧ������ʽ��
		
		
		
		
		DecimalFormat myformat = new DecimalFormat();   //ʵ����DecimalFormat�����
		myformat.setGroupingSize(2);     //���ý����ַ���Ϊ2
		String output = myformat.format(123456.789);
		System.out.println("��������ÿ�����ַ���Ϊ��"+output);
		myformat.setGroupingUsed(false);   //���ò��������ֽ��з��飡
		String output2 = myformat.format(123456.789);
		System.out.println("���������ַ��飺"+output2);

		

	}

}
