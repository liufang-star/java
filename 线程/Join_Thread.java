package thread_;

                                       //线程的加入！（join()方法！）

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Join_Thread extends JFrame{
	
	private Thread threadA;     //定义两个线程
	private Thread threadB;
	
	
	//创建两个进度条对象（JProgressBar-->进度条）
	final JProgressBar progressBar = new JProgressBar();
	final JProgressBar progressBar2 = new JProgressBar();
	
	int count = 0;

	public static void main(String[] args) {
		
		//初始化！
		init(new Join_Thread(),200,100);
		
	}
	
	public Join_Thread() {  //创建无参构造方法
		super();
		getContentPane().add(progressBar,BorderLayout.NORTH);//将进度条设置在窗体最北面
		getContentPane().add(progressBar2,BorderLayout.SOUTH);//将进度条设置在窗体最南面
		progressBar.setStringPainted(true);    //设置进度条显示数字字符
		progressBar2.setStringPainted(true);
		
		//使用匿名内部类形式初始化Thread实例
		threadA = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {        //重写run()方法
				while(true) {
					progressBar.setValue(++count);     //设置进度条的当前值
					try {
						Thread.sleep(100);     //使线程A休眠100毫秒
						
						if(count == 35) {     //使用join()方法！
							threadB.join();     //使线程B调用join()方法！
						}
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});		
		threadA.start();      //启动线程A
		
		threadB = new Thread(new Runnable() {
			
			int count = 0;

			@Override
			public void run() {     //重写run()方法
				while(true) {
					progressBar2.setValue(++count);     //设置进度条的当前值
					try {
						Thread.sleep(100);       //使线程B休眠100毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if(count == 100) {     //当count变量增长为100时
						break;     //跳出循环
					}
					}
				}
			
		});
		
		threadB.start();       //启动线程B
	}

	private static void init(JFrame frame,int width,int height) {    //设置窗体各种属性的方法
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, width, height);
		frame.setVisible(true);
		
	}

}
