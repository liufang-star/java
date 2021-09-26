package thread_;

                               //线程的中断机制！（interrupt()方法！）

/*
 * 语法：
 *         线程对象.interrupt();---->谁调用，谁中断！
 *                       抛出异常---->throw InterruptedException
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Interrupted_Thread extends JFrame{
	
	/**
	 * @author 刘芳
	 */
	private static final long serialVersionUID = 1L;
	private Thread ThreadA;      //创建两个线程
	private Thread ThreadB;
	
	JProgressBar progressbar1 = new JProgressBar();     //创建两个进度条
	JProgressBar progressbar2 = new JProgressBar();

	public Interrupted_Thread() {      //构造方法
		
		super();
		getContentPane().add(progressbar1,BorderLayout.SOUTH);   //设置进度条位置
		getContentPane().add(progressbar2,BorderLayout.NORTH);
		
		progressbar1.setStringPainted(true);    //设置进度条上显示数字
		progressbar2.setStringPainted(true);
		
		ThreadA = new Thread(new Runnable() {       //定义匿名内部类，该类实现Runnable接口！
			int count = 0;

			@Override
			public void run() {      //重写run()方法
				try {
					while(true) {
						progressbar1.setValue(++count);     //设置进度条当前值
						
						if(count == 50) {		//线程中断机制			
						   ThreadA.interrupt();     //调用ThreadA的interrupt()方法！
						}
						
							Thread.sleep(100);     //休眠0.1秒
						if(count == 100) {
							break;
						}
					}
				} catch (InterruptedException e) {
					System.out.println("当前线程A被中断了......");
				
				}	
				
			}	
		});
		ThreadA.start();     //启动线程A
		
		
		
		ThreadB = new Thread(new Runnable() {    //重写ThreadB中的run()方法
			int count = 0;
			
			@Override
			public void run() {      //重写run()方法
				while(true) {
					progressbar2.setValue(++count);     //设置进度条当前值
					try {
						Thread.sleep(100);    //休眠0.1秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count == 100) {
						break;
					}
				}
				
			}
			
		});
		
		ThreadB.start();    //启动线程B
	}
	
	
	
	public static void main(String[] args) {
		
		//初始化！
		init(new Interrupted_Thread(),200,100);
		

	}

	private static void init(JFrame frame,int width,int height) {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置窗体关闭方式
		frame.setBounds(550, 350, width, height);    //设置大小
		frame.setVisible(true);   //设置窗体可见
		
		
	}

}
