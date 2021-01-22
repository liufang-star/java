package 集合类.txt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

                                       //HashSet：散列集合（高效快速）！

/*
 * 注意：
 *        HashSet存储的对象，应该重写hashCode()和equals()两个方法！
 *        
 * 存放数据的三种情况：（重点！）
 *           （1）向集合中插入新对象
 *           （2）集合中不会保存相同的对象
 *           （3）同一个哈希地址可存放多个不同的对象
 */

public class Set_HashSet {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Set_hashCode  p1 = new Set_hashCode(1, "小明");
		Set_hashCode  p2 = new Set_hashCode(2, "大壮");
		Set_hashCode  p3 = new Set_hashCode(3, "阿强");
		Set_hashCode  p4 = new Set_hashCode(2, "大壮");
		Set_hashCode  p5 = new Set_hashCode(2, "大壮");
		Set_hashCode  p6 = new Set_hashCode(2, "大壮");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p3);
		
		/*
		 * 虽然Hash值是相同的，但仍然可以插入，因为集合中的对象与新对象不相同了。
		 */
		set.add(p4);
		
		set.add(p5);
		set.add(p6);
		
		p2.id = 5;
		set.remove(p2);      //删除是没用的，因为删除的是原值，而id改为5了。
		set.add(p2);
		set.add(null);     //和Treeset不同，Hashset可以添加null值。
		System.out.println(set.size());
		
		
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
