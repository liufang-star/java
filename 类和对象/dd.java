package ��Ͷ���.txt;

                                    //��̬������Ǿ�̬����������

/*���𣺾�̬�����ǹ���ġ���a.x��b.x��ֵһ������a.y��b.y��ֵ��һ������
 * x��ֵ�Ǿ�̬�ģ���y��ֵ�ǷǾ�̬�ģ�
 * x����̬��ָ�����ͬһ�����򣬶�y���Ǿ�̬��ָ����ǲ�ͬ����
 * ���Ծ�ֵ̬ǰ��һ�������Ǿ�̬��ֵ�ǻ������ŵģ�
*/

public class dd {     //����dd   ��Ա������
	
	static int x;     //����һ��int�;�̬����x��
	
	int y;    //����һ���Ǿ�̬����int y��
	
	public dd(int x,int y) {      //����һ�����췽������������������ͬ��
		this.x = x;    //������ֵ�������еĳ�Ա��������static int x��
		this.y = y;   //������ֵ�������еĳ�Ա��������int y��
		
	}
	public static void main(String[] args) {
		dd a = new dd(1,2);
		dd b = new dd(13,17);
		
		System.out.println("a.x��ֵΪ��"+a.x);
		System.out.println("a.y��ֵΪ��"+a.y);
		
		System.out.println("b.x��ֵΪ��"+b.x);
		System.out.println("b.y��ֵΪ��"+b.y);
		
	}

}
