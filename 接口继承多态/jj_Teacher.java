package �ӿڼ̳ж�̬.txt;

public abstract class jj_Teacher {   //�����࣡
	 abstract public void teaching();    //���󷽷���
}

class Mathteacher extends jj_Teacher{

	@Override
	public void teaching() {
		System.out.println("������ѧ��ʦ�������ݣ���ڿν�һ�����Ǻ�����");
		
	}
	
}

class EnglishTeacher extends jj_Teacher{

	@Override
	public void teaching() {
		System.out.println("����Ӣ����ʦ�������ݣ�open the book��");
		
	}
	
}