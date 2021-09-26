package thread_;

                               //�̵߳��жϻ��ƣ���interrupt()��������

/*
 * �﷨��
 *         �̶߳���.interrupt();---->˭���ã�˭�жϣ�
 *                       �׳��쳣---->throw InterruptedException
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Interrupted_Thread extends JFrame{
	
	/**
	 * @author ����
	 */
	private static final long serialVersionUID = 1L;
	private Thread ThreadA;      //���������߳�
	private Thread ThreadB;
	
	JProgressBar progressbar1 = new JProgressBar();     //��������������
	JProgressBar progressbar2 = new JProgressBar();

	public Interrupted_Thread() {      //���췽��
		
		super();
		getContentPane().add(progressbar1,BorderLayout.SOUTH);   //���ý�����λ��
		getContentPane().add(progressbar2,BorderLayout.NORTH);
		
		progressbar1.setStringPainted(true);    //���ý���������ʾ����
		progressbar2.setStringPainted(true);
		
		ThreadA = new Thread(new Runnable() {       //���������ڲ��࣬����ʵ��Runnable�ӿڣ�
			int count = 0;

			@Override
			public void run() {      //��дrun()����
				try {
					while(true) {
						progressbar1.setValue(++count);     //���ý�������ǰֵ
						
						if(count == 50) {		//�߳��жϻ���			
						   ThreadA.interrupt();     //����ThreadA��interrupt()������
						}
						
							Thread.sleep(100);     //����0.1��
						if(count == 100) {
							break;
						}
					}
				} catch (InterruptedException e) {
					System.out.println("��ǰ�߳�A���ж���......");
				
				}	
				
			}	
		});
		ThreadA.start();     //�����߳�A
		
		
		
		ThreadB = new Thread(new Runnable() {    //��дThreadB�е�run()����
			int count = 0;
			
			@Override
			public void run() {      //��дrun()����
				while(true) {
					progressbar2.setValue(++count);     //���ý�������ǰֵ
					try {
						Thread.sleep(100);    //����0.1��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(count == 100) {
						break;
					}
				}
				
			}
			
		});
		
		ThreadB.start();    //�����߳�B
	}
	
	
	
	public static void main(String[] args) {
		
		//��ʼ����
		init(new Interrupted_Thread(),200,100);
		

	}

	private static void init(JFrame frame,int width,int height) {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //���ô���رշ�ʽ
		frame.setBounds(550, 350, width, height);    //���ô�С
		frame.setVisible(true);   //���ô���ɼ�
		
		
	}

}
