package �ӿڼ̳ж�̬.txt;

public  class jj_Seagull  extends jj_Bird{  //��������࣡��Ÿ�࣡
	
	public jj_Seagull(String feather) {
		super(feather);
		System.out.println("����һֻ��Ÿ��");
	}

	//˵��һ������̳���һ��������֮������Ҫʵ������������Լ����������еĳ��󷽷���

	@Override
	public void move() {   //move()��д�ķ���������jj_Bird�࣡
		System.out.println("��Ÿ���裡");
		
		
	}

	@Override
	public void eat() {    //eat()��д�����������ĸ��ࣨjj_Animal�ࣩ
		System.out.println("��Ÿ���㣡");
		
	}

}
