package ������.txt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

                                       //HashSet��ɢ�м��ϣ���Ч���٣���

/*
 * ע�⣺
 *        HashSet�洢�Ķ���Ӧ����дhashCode()��equals()����������
 *        
 * ������ݵ�������������ص㣡��
 *           ��1���򼯺��в����¶���
 *           ��2�������в��ᱣ����ͬ�Ķ���
 *           ��3��ͬһ����ϣ��ַ�ɴ�Ŷ����ͬ�Ķ���
 */

public class Set_HashSet {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Set_hashCode  p1 = new Set_hashCode(1, "С��");
		Set_hashCode  p2 = new Set_hashCode(2, "��׳");
		Set_hashCode  p3 = new Set_hashCode(3, "��ǿ");
		Set_hashCode  p4 = new Set_hashCode(2, "��׳");
		Set_hashCode  p5 = new Set_hashCode(2, "��׳");
		Set_hashCode  p6 = new Set_hashCode(2, "��׳");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p3);
		
		/*
		 * ��ȻHashֵ����ͬ�ģ�����Ȼ���Բ��룬��Ϊ�����еĶ������¶�����ͬ�ˡ�
		 */
		set.add(p4);
		
		set.add(p5);
		set.add(p6);
		
		p2.id = 5;
		set.remove(p2);      //ɾ����û�õģ���Ϊɾ������ԭֵ����id��Ϊ5�ˡ�
		set.add(p2);
		set.add(null);     //��Treeset��ͬ��Hashset�������nullֵ��
		System.out.println(set.size());
		
		
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
