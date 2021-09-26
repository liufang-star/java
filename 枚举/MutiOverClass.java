package Enum_;

import java.util.HashMap;
import java.util.Map;

                                       //集合类声明容器的元素！

/*
 * 使用K，V两个字符代表容器中的键值和与键值相对应的具体值！（key和values）！
 */

public class MutiOverClass<K,V> {
	
/*
 * 注意：
 *      在创建集合类泛型时，HashMap集合必须是Map集合的一个子类！
 */
	public Map<K,V> m = new HashMap<K, V>();
	
	//设置put()方法，将对应的键值与键名存入集合对象中
	public void put(K k,V v) {
		m.put(k, v);
	}
	
	public V get(K k) {      //根据键名获取键值
		return m.get(k);
	}

	public static void main(String[] args) {
		
		//实例化泛型类对象
		MutiOverClass<Integer, String> mu = new MutiOverClass<Integer, String>();
		for(int i = 0;i < 6;i++) {
			mu.put(i, "我是集合成员"+i);    //根据集合的长度循环将键名与具体值放入到集合中
		}
		for(int i = 1;i < mu.m.size();i++) {
			System.out.println(mu.get(i));     //调用get()方法获取集合中的值
		}


	}

}
