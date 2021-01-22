package 集合类.txt;

                                                   //HashMap类！


/*
 * HashMap通过哈希表对其内部的映射关系进行快速查找。
 *                     此类不保证映射的顺序，特别是它不保证该顺序恒久不变。
 *                     
 *概念：
 *       Map只是一个接口，不是collection的子接口或者实现类，它是以键值对的形式进行存储的。
 *       
 *       由键和值组成（key和values）！
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_01 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("String", "这是一个字符串");
		map.put("Object", new Object());
		map.put("int", 1234);
		map.put(1, "1");
		map.put("数字", 1234);
		map.put(new Object(), new Object());
		map.put(null,null);
		
		System.out.println("map中的元素个数为："+map.size());
		
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
