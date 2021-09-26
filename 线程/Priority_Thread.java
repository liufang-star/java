package thread_;

                                         //线程优先级！（使用setPriority()方法！）

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class Priority_Thread extends JFrame{
	
	private Thread ThreadA;
	private Thread ThreadB;
	private Thread ThreadC;
	private Thread ThreadD;
	
	
	JProgressBar progressbar = new JProgressBar();
	JProgressBar progressbar2 = new JProgressBar();
	JProgressBar progressbar3 = new JProgressBar();
	JProgressBar progressbar4 = new JProgressBar();
	
	public Priority_Thread() {
		
		super();
		getContentPane().add(progressbar);
		getContentPane().add(progressbar2);
		getContentPane().add(progressbar3);
		getContentPane().add(progressbar4);
		
		progressbar.setStringPainted(true);
		progressbar2.setStringPainted(true);
		progressbar3.setStringPainted(true);
		progressbar4.setStringPainted(true);
		
		ThreadA = new Thread(new Runnable() {
			int count = 0;

			@Override
			public void run() {
				while(true) {
					progressbar.setValue(++count);
					try {
						Thread.sleep(100);
						setPriority("ThreadA",5,ThreadA);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count ==100) {
						break;
					}
				}
				
			}
			
		});
		ThreadA.start();     //启动线程
		
		
		
		ThreadB = new Thread(new Runnable() {
			int count = 0;

			@Override
			public void run() {
				while(true) {
					progressbar2.setValue(++count);
					try {
						Thread.sleep(100);
						ThreadB.setPriority(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count ==100) {
						break;
					}
				}
				
			}
			
		});
		ThreadB.start();     //启动线程
		
		
		
		
		ThreadC = new Thread(new Runnable() {
			int count = 0;

			@Override
			public void run() {
				while(true) {
					progressbar3.setValue(++count);
					try {
						Thread.sleep(100);
						ThreadC.setPriority(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count ==100) {
						break;
					}
				}
				
			}
			
		});
		ThreadC.start();     //启动线程
		
		
		
		
		ThreadD = new Thread(new Runnable() {
			int count = 0;

			@Override
			public void run() {
				while(true) {
					progressbar4.setValue(++count);
					try {
						Thread.sleep(100);
						ThreadD.setPriority(8);
						if(count == 50) {
						ThreadD.interrupt();
						}
					} catch (InterruptedException e) {
						System.out.println("线程D被中断了！！！");
					}
					if(count ==100) {
						break;
					}
				}
				
			}
			
		});
		ThreadD.start();     //启动线程
	}




	private void setPriority(String threadName, int priority, Thread t) {
		
		t.setPriority(priority);
		t.setName(threadName);
		t.start();
		
		
	}


	public static void main(String[] args) {
		
		init(new Priority_Thread(),200,200);

	}

	private static void init(JFrame frame,int width,int height) {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setBounds(550, 350, width, height);
		
		
	}

}
