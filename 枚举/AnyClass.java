package Enum_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

                                       //ʹ�÷�����ʵ�������ü����࣡

public class AnyClass {

	public static void main(String[] args) {
		
		//����ArrayList���������������ڵ�ֵ����ΪInteger
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);      //Ϊ���������ֵ      list����ʹ��add���Ԫ�أ�
		
		for(int i = 0;i < a.size();i++) {
			//���������ĳ��ȣ�ѭ����ʾ�����ڵ�ֵ
			System.out.println("��ȡArrayList�����е�ֵ��"+a.get(i));
		}
		
		
		
		System.out.println();
		//����HashMap���������������ļ������ֵ���ͷֱ�ΪInteger��String��
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(int i = 0;i < 6;i++) {
			m.put(i, "��Ա��"+i);    //Ϊ�������������ֵ��map����ʹ��put���Ԫ�أ�
		}
		
		for(int i = 1;i <m.size();i++) {
			//���ݼ�����ȡ��ֵ
			System.out.println("��ȡMap�����е�ֵ-->"+m.get(i));
		}
		
		
		
		System.out.println();
		//����Vector������ʹ�����е�����ΪString��
		Vector<String> v = new Vector<String>();
		for(int i = 0;i < 6;i++) {
			v.add("��Ա��"+i);   //ΪVector����������ݣ�Vector����ʹ��add���Ԫ�أ�
		}
		for(int i = 1;i < v.size();i++) {
			System.out.println("��ȡVector������ֵ-->"+v.get(i));    //��ʾ�����е����ݣ�
		}


	}

}
