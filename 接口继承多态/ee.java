package �ӿڼ̳ж�̬.txt;

                                                   //�������͵�ת������

/*
 * ����ת�ͺ�����ת�ͣ�
 * ��1������ת�ͣ�����Ķ���ת���ɸ���Ķ���
 *               �﷨��Praents object = new Child();
 *                         Praents���ø�����������Child��������ʵ��������
 *                         
 * ��2������ת�ͣ�����Ķ���ǿ��ת��������Ķ���
 *               �﷨��Parents p = new Parents();
 *                          Child c = (Child)p;   //ǿ��ת�����﷨����
 * 
 */


public class ee {

	public static void main(String[] args) {
		
		//����ת�ͣ���������һ������������ʵ��������
		ee_Personname tom = new ee_students("tom��");
		
		//����ת�ͣ�����ǿ��ת�������࣡��
		ee_Personname jack = new ee_Doctor("Jack") ;
		ee_Doctor dr = (ee_Doctor)jack;
		
		
	}

}
