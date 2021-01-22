package 集合类.txt;

import java.util.ArrayList;
import java.util.List;

                                                            //List集合

/*
 * ArrayList和LinkedList的区别：
 *         ArrayList类实现了可变数组，允许保存所有元素，包括null值。
 *         Linked List类采用链表结构保存对象。
 *         
 * 区别：
 *          ArrayList类可以根据索引位置对集合进行快速的随机访问；缺点：
 *                                                             向指定的索引位置插入对象或删除对象的速度较慢。
 *          LinkedList类便于向集合插入和删除对象，查找起来较慢。
 *          
 * 特点：与数组相同，集合的索引也是从0开始。
 */

public class List_ {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("清明时节雨纷纷");
		list.add("孤家寡人欲断魂");
		list.add("借问美女何处有");
		list.add("牧童遥指三里屯");
		
		list.remove(1);      //remove()方法：删除。 
		list.add(1, "我插一句...");         //add()方法也可以插入。
		list.set(2,"这句我改了！");    //set()方法：修改。
		list.add(null);
		
		for(int i =0;i < list.size();i++) {
			System.out.println("索引位置为"+i+"的元素为："+list.get(i));     //get()方法：获取。
		}
		System.out.println("长度为："+list.size());

	}

}
