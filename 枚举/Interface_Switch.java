package Enum_;

                             //ʹ��interface�ӿ�ʵ��switch()--case��䣡

/*
 * �׶ˣ�
 *         ���ӿ�ֵ����ʱ���ᱨ��
 *       
 */

public class Interface_Switch {
	
	public interface Seasons{      //ʹ��interface�ӿ���������Ǿ�̬����
		
		public static final int SPRING = 1;
		public static final int SUMMER = 2;
		public static final int AUTUMN= 3;
		public static final int WINTER= 4;
		
	}
	
	public static void doit(int c) {
		switch(c) {
		case Seasons.SPRING:
			System.out.println("doit()�����죡");
			break;
		case Seasons.SUMMER:
			System.out.println("doit()�����죡");
			break;
		case Seasons.AUTUMN:
			System.out.println("doit()�����죡");
			break;
		case Seasons.WINTER:
			System.out.println("doit()�����죡");
			break;
		}
	}
	

	public static void main(String[] args) {
		doit(Seasons.AUTUMN);    //����
		doit(1);   //Ҳ����������

	}

}
