package ��ĸ߼�����.txt;

import java.util.Random;
import static java.lang.System.out;   //���뾲̬��Ա������

                                              //final��������

/*
 * ע�⣺
 *        ��1��final�ؼ��ֶ���ı�������������ʱ���и�ֵ������
 *        
 *        ��2��һ��һ���������ñ�����Ϊfinal����ֻ�ܺ㶨ָ��һ�������޷��ı�ָ����һ������
 *        
 *        ��3����java�ж���ȫ�ֳ�����ͨ��ʹ��public static final���Σ������ĳ���ֻ���ڶ���ʱ����ֵ��
 *        
 *        ��4������Ϊfinal���಻�ܱ��̳У�
 *        
 *        ��5��
 */

class Test{
	int i = 0;
}
public class aa {
	
	static Random rand = new Random();
//	private final int VALUE_1 = 9;    //����һ��final������
//	private static final int VALUE_2 = 10;  //����һ��final��static������
	private final Test test = new Test();  //����һ��final���ã�
	private Test test2 = new Test();  //����һ������final�����ã�
	private final static  int[] a = {1,2,3,4,5,6};  //����һ������Ϊfinal�����飡
	private final int i4 = rand.nextInt(20);
	private final int i5 = rand.nextInt(20);
	
	public String toString() {    //��дObject�е�toString()������
		return i4 + " �� "+i5 + "";    //���ش����̵߳��ַ�����
		
	}
	
	public static  void main(String[] args) {
		
		aa data = new aa();
		
//		data.test = new Test();
		//���Զ�ָ��Ϊfinal�������еĳ�Ա������ֵ��
		//�����ܽ�����Ϊfinal������ָ���������ã�
		
//		data.value2++;
		//���ܸı䶨��Ϊfinal�ĳ���ֵ��
		
		data.test2 = new Test();
		
		for(int i = 0;i < data.a.length;i++) {
			a[i] = 9;
			//���ܶԶ���Ϊfinal�����鸳ֵ��
		}
		
		out.println(data);
		out.println("data2");
		out.println(new aa());

	}

}
