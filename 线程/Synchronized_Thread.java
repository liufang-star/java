package thread_;

                             //�̵߳�ͬ�����ƣ�����Synchronizd�ؼ��֣���

public class Synchronized_Thread implements Runnable{

	public static void main(String[] args) {
		
		Synchronized_Thread t = new Synchronized_Thread();
		Thread A = new Thread(t);
		Thread B = new Thread(t);
		Thread C = new Thread(t);
		Thread D = new Thread(t);
		A.start();
		B.start();
		C.start();
		D.start();
		

	}
	
	
      int count  = 10;
	@Override
	public void run() {
		while(true) {
			synchronized(this) {     //ʹ��Synchronized�ؼ��֣�
				if(count > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Ʊ�ۣ�"+count--);
				}
			}
		}
		
		
	}

}
