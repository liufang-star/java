package Enum_;

                                      //�̳з��ͣ�ȫ���̳У���

/*
 * �̳з��͵����������
 *                ���ࣺabstract class Father<T1,T2>{ }
 *                
 *      ��1��ȫ���̳У�class Child<T1,T2,T3> extends Father<T1,T2>{ }
 *      
 *      ��2�����ּ̳У�class Child<T1,A,B> extends Father<T1,String>{ }
 *      
 *      ��3��ʵ�ָ��෺�ͣ�class Child<A,B> extends Father<Integer,String>{ }
 *      
 *      ��4����ʵ�ָ��෺�ͣ�class Child extends Father{ } 
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
		System.out.println("t1�����ͣ�"+this.t1.getClass());
		System.out.println("t2�����ͣ�"+this.t2.getClass());
	}
}

class Child<T1,T2,T3> extends Father<T1,T3>{

	public Child(T1 t1, T3 t2) {
		super(t1, t2);
	}
	
}
