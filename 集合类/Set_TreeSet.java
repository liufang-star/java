package ������.txt;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

                                      //TreeSet����״���ϣ�������򣩣�

/*
 *ע�⣺
 *         Ҫ��ָ�����ϵĴ��˳�򣬱�����Ķ�����ʵ��Comparable�ӿڣ� 
 */

public class Set_TreeSet {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		Set_Comparable p1 = new Set_Comparable(1, 18, "С��");
		Set_Comparable p2 = new Set_Comparable(2, 5, "��׳");
		Set_Comparable p3 = new Set_Comparable(3, 20, "��ǿ");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p3);    //�ظ���Ԫ�ز��ᱻ��ӵ�������
		//set.add(null);    //�����Դ��nullֵ��
		
		System.out.println(set.size());
		
		Iterator itt = set.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
		

	}

}
