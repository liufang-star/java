package ��Ͷ���.txt;

                                                //��Ĺ��췽����

/*ע�⣺��1�����췽��û�з���ֵ��
 *            ��2�����췽��������Ҫ�뱾���������ͬ��
 *            ���磺�������� public class bb{ }  ��   public bb{ } ������ͬ��
 */

public class bb {     
	
	int eggcount;      //����һ��int�͵ĳ�Ա������

	public bb(int eggcount) {    //�����вι��췽��
		this.eggcount = eggcount;     //������ֵ�������еĳ�Ա������
		System.out.println("���������"+eggcount+"��������");
		
	}
	public bb() {     //�����޲ι��췽����
		this(1);    //��eggcount��ֵΪ1��
	}

	public static void main(String[] args) {
		bb e = new bb();    //����e����
		bb e2 = new bb(5);    //����e2����

	}

}
