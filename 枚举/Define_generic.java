package Enum_;

                                                   //���巺�ͣ�

/*
 * ע�⣺
 *        ���÷���ʱ�����������Ѿ����ڵ�ֵ��
 */
public class Define_generic <T>{     //����һ�������࣬T��ʾδ֪���ͣ�
	
	public T getOver() {
		return over;
	}

	public void setOver(T over) {
		this.over = over;
	}

	T over;

	public static void main(String[] args) {
		
		Define_generic<Boolean> d1 = new Define_generic<Boolean>(); //ʵ����һ��Boolean�͵Ķ���
		d1.setOver(true);    //����Ҫ��������ת��
		boolean b = d1.getOver();
		System.out.println(b);
		
		Define_generic<Integer> d2 = new Define_generic<Integer>();//ʵ����һ��Integer�͵Ķ���
		d2.setOver(123456);
		Integer c = d2.getOver();     //����Ҫ��������ת��
		System.out.println(c);
		

	}

}
