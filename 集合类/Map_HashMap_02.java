package ������.txt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_02 {

	public static void main(String[] args) {
				Map<String,String> map = new HashMap<>();      //����mapʵ��
				map.put("01", "��ͬѧ");       //�򼯺�����Ӷ���
				map.put("02", "κͬѧ");
				
				Set<String> set = map.keySet();    //����map����������key����ļ���
				Iterator<String> it = set.iterator();     //�������ϵ�����
				System.out.println("key�����е�Ԫ�أ�");
				while(it.hasNext()) {        //��������
					System.out.println(it.next());      //�������key��ֵ
				}
				
				Collection<String> co = map.values();     //����map����������values����ļ���
				it = co.iterator();
				System.out.println("values�����е�Ԫ�أ�");
				while(it.hasNext()) {        //��������
					System.out.println(it.next());    //�������values��ֵ
				}
				
				

	}

}
