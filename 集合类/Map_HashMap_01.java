package ������.txt;

                                                   //HashMap�࣡


/*
 * HashMapͨ����ϣ������ڲ���ӳ���ϵ���п��ٲ��ҡ�
 *                     ���಻��֤ӳ���˳���ر���������֤��˳���ò��䡣
 *                     
 *���
 *       Mapֻ��һ���ӿڣ�����collection���ӽӿڻ���ʵ���࣬�����Լ�ֵ�Ե���ʽ���д洢�ġ�
 *       
 *       �ɼ���ֵ��ɣ�key��values����
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_01 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("String", "����һ���ַ���");
		map.put("Object", new Object());
		map.put("int", 1234);
		map.put(1, "1");
		map.put("����", 1234);
		map.put(new Object(), new Object());
		map.put(null,null);
		
		System.out.println("map�е�Ԫ�ظ���Ϊ��"+map.size());
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj =it.next();
			System.out.println("key="+obj+"\tvalue="+map.get(obj));
		}
		System.out.println();
		System.out.println(map.get("String"));
		

	}

}
