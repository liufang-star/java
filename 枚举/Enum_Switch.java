package Enum_;

                             //ʹ��ö�٣�enum��ʵ��switch--case��䣡

public class Enum_Switch {
	
	public enum Seasons2{
		SPRING,SUMMER,AUTUMN,WINTER
	} 
	
	public static void doit2(Seasons2 a) {
		switch(a) {
		case SPRING:
			System.out.println("doit2()�����죡");
			break;
		case SUMMER:
			System.out.println("doit2()�����죡");
			break;
		case AUTUMN:
			System.out.println("doit2()�����죡");
			break;
		case WINTER:
			System.out.println("doit2()�����죡");
			break;
		}
	}

	public static void main(String[] args) {
		
		doit2(Seasons2.SUMMER);     //���ã������Ǿ���Ķ��󣡲����������֣�
		doit2(Seasons2.SPRING);
		

	}

}
