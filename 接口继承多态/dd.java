package �ӿڼ̳ж�̬.txt;

                                 //object���е�equals()������ʹ�ã���

/*
 * ע�⣺equals()������Ĭ��ʵ����ʹ�á�==��������Ƚ�������������õ�ַ��
 *            �����ǱȽ϶�������ݣ�
 */

public class dd {

	public static void main(String[] args) {
		dd_Person p1 = new dd_Person();
		dd_Person p2 = new dd_Person();
		dd_Person p3 = new dd_Person();
		
		p1.name = "С��";
		p1.id = "123";
		
		p2.name = "С��";
		p2.id = "123";
		
		p3.name = "С��";
		p3.id = "123";
		System.out.println("ʹ��equals()�������бȽϣ�");
		System.out.println("p1��p2�Ƚϣ�"+p1.equals(p2));
		System.out.println("p1��p3�Ƚϣ�"+p1.equals(p3));
		System.out.println("p2��p3�Ƚϣ�"+p2.equals(p3));

	}

}
