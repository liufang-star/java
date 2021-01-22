package 集合类.txt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_02 {

	public static void main(String[] args) {
				Map<String,String> map = new HashMap<>();      //创建map实例
				map.put("01", "李同学");       //向集合中添加对象
				map.put("02", "魏同学");
				
				Set<String> set = map.keySet();    //构建map集合中所有key对象的集合
				Iterator<String> it = set.iterator();     //创建集合迭代器
				System.out.println("key集合中的元素：");
				while(it.hasNext()) {        //遍历集合
					System.out.println(it.next());      //输出所有key的值
				}
				
				Collection<String> co = map.values();     //构建map集合中所有values对象的集合
				it = co.iterator();
				System.out.println("values集合中的元素：");
				while(it.hasNext()) {        //遍历集合
					System.out.println(it.next());    //输出所有values的值
				}
				
				

	}

}
