package �ӿڼ̳ж�̬.txt;

public abstract class jj_Bird  extends jj_Animal{   //�������ࣺ���࣡
	String feather;   //��ë
	
	public jj_Bird(String feather) {    //����һ���вι��췽����
		System.out.println("������һ�����ࡣ");
		this.feather = feather;   //���ñ������this�ؼ��֣�
	}
	
	public void growFeather() {    //���ǳ��󷽷���
		
		//��ë���ǳ����࣡���Բ���Ҫ��abstract�ؼ������Σ�
		System.out.println("����"+feather+"��ë��");  //feather��̬�����ԡ�
	}
	
	abstract public void move();    //move�����ࡣ��Ҫ��abstract�ؼ������Σ�
	
	public void reproduce() {
		System.out.println("�µ���");
	}

}
