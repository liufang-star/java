package ��ĸ߼�����.txt;

import static java.lang.System.out;
import java.util.Random;

                                          //final������

/*
 * ע�⣺
 *    ��java�ж���ȫ�ֳ�����ͨ��ʹ��public static final���Σ������ĳ���ֻ���ڶ���ʱ����ֵ��
 */

public class bb {
	private static Random rand = new Random();   //ʵ����һ��Random�����
	
	//�������0~10֮�������������趨��Ϊfinal��a1
	private final  int a1 = rand.nextInt(10);
	
	//�������0~10֮�������������趨��Ϊstatic final ��a2
	private static final int a2 = rand.nextInt(10);
	
	public static void main(String[] args) {
		
		bb fdata = new bb();    //ʵ����һ������
		out.println("ʵ�����������a1��ֵ��final��Ϊ��"+fdata.a1);//���ö���Ϊfinal��a1
		out.println("ʵ�����������a2��ֵΪ��static final����"+fdata.a2);//���ö���Ϊstatic final��a2
		
		
		bb fdata2 = new bb();   //ʵ������һ������
		out.println("����ʵ�����������a1��ֵ��final��Ϊ��"+fdata2.a1);//���ö���Ϊfinal��a1
		out.println("����ʵ�����������a2��ֵ��static final��Ϊ��"+fdata2.a2);//���ö���Ϊstatic final��a2
	}

}


