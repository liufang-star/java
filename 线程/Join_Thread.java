package thread_;

                                       //�̵߳ļ��룡��join()��������

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Join_Thread extends JFrame{
	
	private Thread threadA;     //���������߳�
	private Thread threadB;
	
	
	//������������������JProgressBar-->��������
	final JProgressBar progressBar = new JProgressBar();
	final JProgressBar progressBar2 = new JProgressBar();
	
	int count = 0;

	public static void main(String[] args) {
		
		//��ʼ����
		init(new Join_Thread(),200,100);
		
	}
	
	public Join_Thread() {  //�����޲ι��췽��
		super();
		getContentPane().add(progressBar,BorderLayout.NORTH);//�������������ڴ������
		getContentPane().add(progressBar2,BorderLayout.SOUTH);//�������������ڴ���������
		progressBar.setStringPainted(true);    //���ý�������ʾ�����ַ�
		progressBar2.setStringPainted(true);
		
		//ʹ�������ڲ�����ʽ��ʼ��Threadʵ��
		threadA = new Thread(new Runnable() {
			int count = 0;
			
			@Override
			public void run() {        //��дrun()����
				while(true) {
					progressBar.setValue(++count);     //���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);     //ʹ�߳�A����100����
						
						if(count == 35) {     //ʹ��join()������
							threadB.join();     //ʹ�߳�B����join()������
						}
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});		
		threadA.start();      //�����߳�A
		
		threadB = new Thread(new Runnable() {
			
			int count = 0;

			@Override
			public void run() {     //��дrun()����
				while(true) {
					progressBar2.setValue(++count);     //���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);       //ʹ�߳�B����100����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if(count == 100) {     //��count��������Ϊ100ʱ
						break;     //����ѭ��
					}
					}
				}
			
		});
		
		threadB.start();       //�����߳�B
	}

	private static void init(JFrame frame,int width,int height) {    //���ô���������Եķ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 500, width, height);
		frame.setVisible(true);
		
	}

}
