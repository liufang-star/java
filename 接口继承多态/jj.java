package �ӿڼ̳ж�̬.txt;

                              //�����࣡����ʹ��abstract�ؼ��֣���

//���󣨳������ʣ�����ͳ����Ϊ��û�и�����ʽ�������������ʣ���

/*
 * ע�⣺
 *      ��1���������ǲ��ܱ�ʵ�����������Ҫʵ�������󣬿���ͨ�����ཫ��ʵ��������
 *      
 *      ��2��������󷽷�ʱ����û�д����ţ���
 *              ����û�о����ʵ�֣�ֱ����ð�Ž����������������ʵ�ֳ������еĳ��󷽷���
 *                   ���磺public abstract class jj_Teacher {   //�����࣡
 *	                                   abstract public void teaching();    //���󷽷���
 *                                   }
 *                                    
 *      ��3�����󷽷���ֻ��Ҫ����������Ҫʵ�ֵģ�
 *                                      ���г��󷽷���������ǳ����࣡
 *                                    ��������뱻�̳У������󷽷����뱻���������������д��
 *                                    
 *     ��4��������̳г����ࣨ��������̳У���
 *                               ˵��һ������̳���һ��������֮��
 *                               ��Ҫʵ������������Լ����������еĳ��󷽷���
 */

public class jj {

	public static void main(String[] args) {
		System.out.println("����jj_Color�����ࣺ");
		jj_Color c1 = new Red();   //ͨ������jj_Colorʵ��������
		jj_Color c2 = new Blue();
		c1.show();   //����jj_Color��Red���Blue���show()������
		c2.show();
		System.out.println();
		
		
		//�÷����Ǵ���ģ����ܴ�����������󡣼�Ȼ�ǳ�����Ķ��󣬾Ͳ��ܽ���ʵ������
		//jj_Color c3 = new jj_Color();   
		
		
		System.out.println("����jj_Teacher�������еĳ��󷽷���");
		jj_Teacher lee = new Mathteacher();
		jj_Teacher tom = new EnglishTeacher();
		lee.teaching();
		tom.teaching();
		System.out.println();
		
		
		System.out.println("ʹ�ö�㣨jj_Animal��jj_Bird��jj_Seagull��������̳У�");
		jj_Seagull kk = new jj_Seagull("��ɫ");
		kk.eat();
		kk.move();
		kk.growFeather();
		kk.reproduce();
		System.out.println();
		
		
		System.out.println("�ڶ��֣�jj_Animal��jj_Bird��jj_Chicken����������̳У�");
		jj_Chicken tt = new jj_Chicken("��ɫ");
		tt.move();
		tt.eat();
		tt.growFeather();
		tt.reproduce();
		
		
			
		
		

	}

}
