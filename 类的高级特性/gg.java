package ��ĸ߼�����.txt;

                                           //�����ڲ��࣡

/*
 * ���
 *        һ��û�����ֵ��࣬���ڲ���ļ�д����
 *    
 * ���ʣ�
 *          ��ʵ�Ǽ̳и������ʵ�ֽӿڵ�������������
 *          
 * ���ã�
 *         �ڿ�����ʱ�򣬻����������࣬���߽ӿ���Ϊ������
 *         �����ʱ��ʵ����Ҫ����һ���������
 *         ����÷�����������һ�Σ����ǾͿ���ʹ�������ڲ���ĸ�ʽ�򻯡�
 */

public class gg {
	public OutInerfaces action() {
		return new innerClass2();   //��һ�֣��٣�
//		return new OutInerfaces() {//�ڶ��֣��ڣ�
//			private int i = 0;
//			public int getValue() {
//				return i;
//			}
//		};
	}

	        //��һ�֣��٣��͵ڶ��֣��ڣ���һ���ģ�
}

interface OutInerfaces {   //�����ӿڣ�
	
}
class innerClass2 implements OutInerfaces{    //��һ�֣��٣�
	private int i = 0;
	public int getValue() {
		return i;
	}
}