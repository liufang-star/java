package ��ĸ߼�����.txt;

                                        //final������

public class cc {

	public static void main(String[] args) {
		Sub s = new Sub();   //ʵ������
		s.doit();  //����doit()������
		Parents p = s;   //ִ������ת�Ͳ�����
//		p.doit();  //���ܵ���private������
		p.doit2();
		p.doit3();

	}

}

class Parents{    //����һ��Parents�࣡
	
	private final void doit() {    //ʹ��private final����һ����Ա����1
		System.out.println("����.doit()");
	}
	
	final void doit2() {   //ʹ��final�ඨ��һ��doit2()��Ա������
		System.out.println("����.doit2()");
	}
	
	public void doit3() {    //ʹ��public ����һ��doit3()��Ա������
		System.out.println("����.doit3()");
	}
	
}

class Sub extends Parents{    //�̳�
	
	public final void doit() {   //����������дdoit()������
		System.out.println("����.doit()");
	}
	
//	final void doit2() {      //final�������ܱ����ǣ�
//		System.out.println("����.doit2()");
//	}
	
	public void doti3() {
		System.out.println("����.doit3()");
	}
	
}
