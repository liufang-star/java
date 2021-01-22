package 集合类.txt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

                                                   //Collection接口。
/*
 * 概念：
 *         Collection接口是层次结构中的根接口。构成Collection的单位为元素。
 *         Collection接口通常不能直接使用，但该接口提供了添加元素、删除元素、管理数据的方法。
 *     
 * Collection接口的常用方法：
 *          add() ：将指定的对象添加到该集合中
 *          remove()：将指定的对象从该集合中移除
 *          isEmpty()：返回boolean值，用于判断当前集合是否为空
 *          iterator()：返回在此Collection的元素上进行迭代的迭代器，用于遍历集合中的对象
 *          size()：返回int型值，获取该集合中元素的个数
 *          
 *注意：
 *        Iterator的next()方法返回的是Object
 */

public class collection_ {

	public static void main(String[] args) {
		System.out.println("添加元素前：");
		Collection co = new ArrayList();
		System.out.println("集合是否为空："+co.isEmpty()+"\t集合的长度为："+co.size());
		
		System.out.println();
		System.out.println("添加元素后：");
		co.add("你好！");
		co.add(3.14);
		co.add(new Object());
		System.out.println("集合是否为空："+co.isEmpty()+"\t集合的长度为："+co.size());
		Iterator tmp = co.iterator();
		while(tmp.hasNext()) {
			 Object o = tmp.next();
			System.out.println(o);
		}
		
		System.out.println();
		System.out.println("删除一个元素之后的数为：");
		co.remove(3.14);
		Iterator  it = co.iterator();
		while(it.hasNext()) {
			Object k = it.next();
			System.out.println(k);
		}
		
		

	}

}
