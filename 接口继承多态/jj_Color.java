package �ӿڼ̳ж�̬.txt;

public abstract class jj_Color {      //�����ࣨjj_Color������ɫ��
	
	public void show() {   //�޲η�����
		
	}

}

class Red extends jj_Color{      //Red��̳�jj_Color�������࣡��
	public void show() {
		System.out.println("���Ǻ�ɫ...");
	}
}

class Blue extends Red{    //Blue��̳�Red�࣡
	public void show() {
		System.out.println("������ɫ...");
	}
}
