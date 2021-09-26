package Enum_;

                                      //继承泛型（全部继承）！

/*
 * 继承泛型的四种情况：
 *                父类：abstract class Father<T1,T2>{ }
 *                
 *      （1）全部继承：class Child<T1,T2,T3> extends Father<T1,T2>{ }
 *      
 *      （2）部分继承：class Child<T1,A,B> extends Father<T1,String>{ }
 *      
 *      （3）实现父类泛型：class Child<A,B> extends Father<Integer,String>{ }
 *      
 *      （4）不实现父类泛型：class Child extends Father{ } 
 */

public class Extends_generic {

	public static void main(String[] args) {
		
		Father<Integer,String> f = new Father<Integer,String>(1, "2");
		Father<Double,Boolean> d = new Father(1.2,true);


	}

}

class Father<T1,T2>{
	
	T1 t1;
	T2 t2;
	
	public Father(T1 t1,T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
		System.out.println("t1的类型："+this.t1.getClass());
		System.out.println("t2的类型："+this.t2.getClass());
	}
}

class Child<T1,T2,T3> extends Father<T1,T3>{

	public Child(T1 t1, T3 t2) {
		super(t1, t2);
	}
	
}
