package �ӿڼ̳ж�̬.txt;

                                             //��ļ̳У�����̳е��÷�����

//ע�⣺java�����У�һ����ֻ������һ�����࣡

 public  class bb {	
	 
//	 bb(){     //����һ�����췽����
//		 System.out.println("���ø����bb()���췽��");
//	 }
//	 
//	 class  SubParent extends bb{
//		 SubParent(){  //����һ�����췽����
//			 System.out.println("���������SubParent()���췽��");
//		 }
//		 public class Subroutine extends SubParent{
//			 Subroutine(){  //����һ�����췽����
//				 System.out.println("���������Subroutine()���췽��");
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
		 System.out.println("�������ĸ���~��");
	 }
 }
	 class Child extends Parent1{
		 
	 
 }
 
 
