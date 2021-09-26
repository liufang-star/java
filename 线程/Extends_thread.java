package thread_;

                                                    //继承Thread类！

/*
 * 完成线程的的两个方法：
 *         run()方法：
 *                      线程真正功能的代码块，也就是线程运行时执行的方法！
 *         start()方法：
 *                       使线程开始执行的方法！
 *注意：
 *       （1）如果start()方法调用一个已经启动的线程，系统将抛出IllegalThreadStateException异常！
 *       （2）启动一个线程，不是直接调用Thread子类对象的run()方法，而是调用Thread子类的
 *                start()方法，Thread类的start()方法产生一个新的线程，该线程运行Thread子类的
 *                run()方法。
 */

public class Extends_thread {

	public static void main(String[] args) {
		
	Thread a = new ThreadA();
	a.start();

	Thread b = new ThreadB();
	b.start();
		
	}

}


class ThreadA extends Thread{     //编写自定义的类继承Thread类
	
	@Override
	public void run() {     //重写run()方法
		for(int i = 0;i <= 10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);     //休眠1秒（停顿一秒）
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