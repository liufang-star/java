package �ӿڼ̳ж�̬.txt;

                                           //instanceof�ؼ��֣�

/*
 * ��1��ע�⣺instanceof�ؼ���ֻ���жϴ��ڼ̳й�ϵ�Ķ����ӿڡ�
 *                �������������Ӹ��࣡����
 *                
 *��2��instanceof���������ж�ĳһ�������Ƿ�̳���ĳһ���ࣺ
 *            �﷨��boolean result = child instanceof parents������һ��boolean����ֵ����
 *            
 *��3��       �������  instanceof  �������ƣ�     ���磺��lencopad instanceof Pad����
 *            
 *  
 */

public class ff {      //���ࣨff�������ԣ�
public static void main(String[] args) {
		Pad ipd = new Pad();
		LenvoPad lenvopad = new LenvoPad();
		System.out.println("ƽ����ԣ�Pad���Ƿ�̳У����ࣩ�Ե��ԣ�ff������"+(ipd instanceof ff));
		System.out.println("������ԣ�LenvoPad���Ƿ�̳���ƽ����ԣ�Pad������"+(lenvopad instanceof Pad));
		System.out.println("������ԣ�LenvoPad���Ƿ�̳��Ե��ԣ�ff������"+(lenvopad instanceof ff));
		System.out.println("ƽ����ԣ�Pad���Ƿ�̳���������ԣ�LenvoPad��"+(ipd instanceof LenvoPad));
		System.out.println("�Լ��̳����Լ�����"+(ipd instanceof Pad));
		

	}
		
}
	class Pad extends ff{   //���ࣨPad���̳и��ࣨff����ƽ����ԣ�
		
	}
	class LenvoPad extends Pad{    //���ࣨLenvoPad���̳и��ࣨPad��������ƽ�����
		
	}


