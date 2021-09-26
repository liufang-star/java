package thread_;

                             //线程的同步机制！！（Synchronizd关键字！）

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
			synchronized(this) {     //使用Synchronized关键字！
				if(count > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("票价："+count--);
				}
			}
		}
		
		
	}

}
