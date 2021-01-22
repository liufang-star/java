package 集合类.txt;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

                                      //TreeSet：树状集合（存放有序）！

/*
 *注意：
 *         要想指定集合的存放顺序，被排序的对象需实现Comparable接口！ 
 */

public class Set_TreeSet {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		Set_Comparable p1 = new Set_Comparable(1, 18, "小明");
		Set_Comparable p2 = new Set_Comparable(2, 5, "大壮");
		Set_Comparable p3 = new Set_Comparable(3, 20, "阿强");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p3);    //重复的元素不会被添加到集合中
		//set.add(null);    //不可以存放null值。
		
		System.out.println(set.size());
		
		Iterator itt = set.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
		

	}

}
