package �ӿڼ̳ж�̬.txt;

                                                         //��̬����

public class ii {

	public static void main(String[] args) {
		
		Animal jack = new Fish(); //���Ϊ������ ��Animal��--> jack  ��   -->   һ���㣨Fish����
		jack.move();
		
	    jack = new Hawk();
		jack.move();

	}

}

class Animal{  //����һ��Animal�࣡
	
	void move() {    //����һ���޲η�����
		
	}
}

class Fish extends Animal{
	void move() {
		System.out.println("��Ӿ��");
	}
}

class Hawk extends Animal{
	void move() {
		System.out.println("���裡");
	}
}