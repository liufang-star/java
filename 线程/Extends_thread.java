package thread_;

                                                    //�̳�Thread�࣡

/*
 * ����̵߳ĵ�����������
 *         run()������
 *                      �߳��������ܵĴ���飬Ҳ�����߳�����ʱִ�еķ�����
 *         start()������
 *                       ʹ�߳̿�ʼִ�еķ�����
 *ע�⣺
 *       ��1�����start()��������һ���Ѿ��������̣߳�ϵͳ���׳�IllegalThreadStateException�쳣��
 *       ��2������һ���̣߳�����ֱ�ӵ���Thread��������run()���������ǵ���Thread�����
 *                start()������Thread���start()��������һ���µ��̣߳����߳�����Thread�����
 *                run()������
 */

public class Extends_thread {

	public static void main(String[] args) {
		
	Thread a = new ThreadA();
	a.start();

	Thread b = new ThreadB();
	b.start();
		
	}

}


class ThreadA extends Thread{     //��д�Զ������̳�Thread��
	
	@Override
	public void run() {     //��дrun()����
		for(int i = 0;i <= 10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);     //����1�루ͣ��һ�룩
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
}


class ThreadB extends Thread{
	@Override
	public void run() {
		for(char i = 'a';i <= 'z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}