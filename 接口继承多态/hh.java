package �ӿڼ̳ж�̬.txt;

                                               //��̬����

public class hh {
	/*
	 * ���
	 *         ͬһ��������ͬһ��������ִ�г���ͬ�Ľ����
	 */
	//ʵ���������ı��ζ�����������
	
	
	private hh[]  kk = new hh[6];
	private int nextindex = 0;
	
	public void draw(hh q) {    //����draw()����������Ϊ�ı��ζ���
		if (nextindex < kk.length) {
			kk[nextindex] = q;
			System.out.println(nextindex);
			nextindex++;
		}
	}
	public static void main(String[] args) {
		//ʵ���������ı��ζ������ڵ���draw()������
		hh q = new hh();  //�������ζ���Ϊ��������draw()������
		q.draw(new Square());  //��ƽ���ı��ζ���Ϊ��������draw()������
		q.draw(new Parallelogramgle());
	
	}
}
//����һ���������࣬�̳��ı����࣡
class Square extends hh{
	public Square() {
		System.out.println("���������Σ�");
	}
}

//����һ��ƽ���ı����࣬�̳��ı����࣡
class Parallelogramgle extends hh{
	public Parallelogramgle() {
		System.out.println("����ƽ���ı��Σ�");
	}
}

