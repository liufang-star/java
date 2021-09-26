package Enum_;

import java.awt.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

                      //泛型的高级用法！（Advanced usage -->高级用法）！

/*
 * 泛型的高级用法包括限制泛型可用类型和使用类型通配符等...
 * 
 * 1、限制泛型可用类型
 *         语法：class 类名称<T extends anyClass>
 *         注意：
 *                   使用泛型限制之后，泛型类的类型必须实现或继承anyClass这个接口或类。
 *                   无论anyClass是接口还是类，在进行泛型限制时都必须使用extends关键字！
 *                   
 * 2、使用类型通配符
 *         语法：泛型类名称<? extends List> a = null;
 *         作用：
 *                 创建一个泛型类对象时限制这个泛型类的类型实现或继承某个接口或类的子类。
 *                 要声明这样一个对象可以使用”?“通配符来表示，
 *                 同时使用extends关键字来对泛型加以限制。
 *         注意：
 *                  <? extends List>表示类型未知，当需要使用泛型对象时，可以单独实例化。
 *                  使用通配符声明的名称实例化对象不能对其加入新的信息，只能获取或删除
 *         例句：（如果实例化没有实现List接口的泛型对象，编译器将会报错）！
 *                  A<? extends List> = null;
 *                  a = new A<ArrayList>();
 *                  a = new A<LinkedList>();
 *                  
 * 3、继承泛型类与实现泛型接口
 *        定义：
 *               泛型的类和接口也可以被继承与实现。
 */

public class Advanced_usage<T extends List> {       //限制泛型的类型

	public static void main(String[] args) {
		
		//可以实例化已经实现List接口的类
//		Advanced_usage<ArrayList> l1 = new Advanced_usage<>();
//		
//		Advanced_usage<LinkedList> l2 = new Advanced_usage<LinkedList>();
		
		//这句是错误的，因为HashMap没有实现List()接口！
		//Advanced_usage<HashMap> l3 = new Advanced_usage<HashMap>();
		
		
		
		
		
//		List<String> l1 = new ArrayList<>();
//		l1.add("成员1");
//		
//	   List<?> l2 = new ArrayList<Number>();    //使用泛型通配符！
//	   List<?> l3 = l1;
//	   
//	   l2.add(123);      //注意：当使用泛型通配符时，不能做增加和修改的操作！
//		 l1.set(0,"修改操作");
//		 System.out.println("l1："+l1.get(0));
		
		
		
		
		
/*
 * 注意：
 *         使用extends关键字和使用super关键字定义泛型通配符时，
 *         例如：
 *              List<? extends List> l4 = new ArrayList<ArrayList>();
 *                                       父类                                 子类
 *                                       不允许子类比父类大！！！
 *              List<? super List> l4 = new ArrayList<Object>();
 *                                  子类                                      父类
 *                                       不允许子类比父类大！！！  
 */
		
//		List<? extends List> l4 = new ArrayList<List>();    //指定了上界
//		List<? super List> l5 = new ArrayList<Object>();   //指定了下界

	}

}
