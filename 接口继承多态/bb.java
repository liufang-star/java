package 接口继承多态.txt;

                                             //类的继承！（多继承的用法！）

//注意：java语言中，一个类只可以有一个父类！

 public  class bb {	
	 
//	 bb(){     //定义一个构造方法！
//		 System.out.println("调用父类的bb()构造方法");
//	 }
//	 
//	 class  SubParent extends bb{
//		 SubParent(){  //定义一个构造方法！
//			 System.out.println("调用子类的SubParent()构造方法");
//		 }
//		 public class Subroutine extends SubParent{
//			 Subroutine(){  //定义一个构造方法！
//				 System.out.println("调用子类的Subroutine()构造方法");
//			 }
//		 }
//	 }
//
    public static void main(String[] args) {		
    	Child child = new Child();
    	child.show();
	
	}

}
 
 class Parent1 extends Parent2{
	 
 }
 class Parent2{
	 void show() {
		 System.out.println("我是最顶层的父类~！");
	 }
 }
	 class Child extends Parent1{
		 
	 
 }
 
 
