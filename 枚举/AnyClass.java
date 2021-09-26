package Enum_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

                                       //使用泛型类实例化常用集合类！

public class AnyClass {

	public static void main(String[] args) {
		
		//定义ArrayList容器，设置容器内的值类型为Integer
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);      //为容器添加新值      list集合使用add添加元素！
		
		for(int i = 0;i < a.size();i++) {
			//根据容器的长度，循环显示容器内的值
			System.out.println("获取ArrayList容器中的值："+a.get(i));
		}
		
		
		
		System.out.println();
		//定义HashMap容器，设置容器的键名与键值类型分别为Integer与String型
		Map<Integer, String> m = new HashMap<Integer, String>();
		for(int i = 0;i < 6;i++) {
			m.put(i, "成员："+i);    //为容器填充键名与键值，map集合使用put添加元素！
		}
		
		for(int i = 1;i <m.size();i++) {
			//根据键名获取键值
			System.out.println("获取Map容器中的值-->"+m.get(i));
		}
		
		
		
		System.out.println();
		//定义Vector容器，使容器中的内容为String型
		Vector<String> v = new Vector<String>();
		for(int i = 0;i < 6;i++) {
			v.add("成员："+i);   //为Vector容器添加内容，Vector集合使用add添加元素！
		}
		for(int i = 1;i < v.size();i++) {
			System.out.println("获取Vector容器的值-->"+v.get(i));    //显示容器中的内容！
		}


	}

}
