package ��Ͷ���.txt;

                                           //����

public class gg {     //��Ա������
	String name = "���μ�";
	public String getname() {    //��Ա������
		return name;
	}
	public gg() {    //���췽����
		System.out.println("��������");
	}

	public static void main(String[] args) {
		
		gg a = new gg();
/*ע�⣺gg ��ʾ �ࣨ��������a ��ʾ���ã����󣩣�new gg() �����ʵ�壨�����������������*/
		
		System.out.println(a.getname());
		System.out.println(new gg().getname());
		new gg();

	}

}
