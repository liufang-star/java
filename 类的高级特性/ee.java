package ��ĸ߼�����.txt;

                                                //�ֲ��ڲ��࣡

/*
 * ���
 *         ������һ����������һ��������������࣡
 *  
 *  ע�����
 *           ��1���ֲ��ڲ����в��ɶ��徲̬������
 *                   ���Է����ⲿ��ľֲ��������������ڵı����������Ǳ���������final�ģ�
 *                   
 *          ��2���ֲ��ڲ���ֻ�������ڵķ������������ڽ���ʵ������
 *                   �����Ҫ�����ڷ����巵�ظ��࣬��Ҫͨ���ӿ�����ת�͵Ĳ�����
 *           
 *  ���ã�
 *          ��ĳЩ����£�ĳЩҵ���߼���Ҫ��ʱ����
 *          ��Щҵ���߼�ֻ������ʹ���ֿ��Է�װ��һ����Ļ���
 *          ����û��Ҫ���½����ļ������Կ�����дһ���ֲ��ڲ���������
 */
public class ee {
	
	//Ҫ������෵�س�ȥ������Ҫͨ���ӿڣ���Ϊ�ڲ������ⲿ�������в����ڣ�
	public OutInterface action(String x) {
		
		class innerClass2 implements OutInterface {   //�ֲ��ڲ��࣡��
			
			public innerClass2(String s) {
				
			s = x;
			System.out.println(s);
			
		}
	}
	return new innerClass2("do");
}

	public static void main(String[] args) {
		
		ee kk = new ee();
		kk.action("�ֲ��ڲ��࣡");

	}

}
interface OutInterface{    //ר���������ֲ��ڲ���������ת�͵ĸ��ӿڵĲ�����
	
}