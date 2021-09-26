package Enum_;

                             //使用枚举（enum）实现switch--case语句！

public class Enum_Switch {
	
	public enum Seasons2{
		SPRING,SUMMER,AUTUMN,WINTER
	} 
	
	public static void doit2(Seasons2 a) {
		switch(a) {
		case SPRING:
			System.out.println("doit2()：春天！");
			break;
		case SUMMER:
			System.out.println("doit2()：夏天！");
			break;
		case AUTUMN:
			System.out.println("doit2()：秋天！");
			break;
		case WINTER:
			System.out.println("doit2()：冬天！");
			break;
		}
	}

	public static void main(String[] args) {
		
		doit2(Seasons2.SUMMER);     //调用，必须是具体的对象！不允许传入数字！
		doit2(Seasons2.SPRING);
		

	}

}
