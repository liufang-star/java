package thread_;

                                                 //�̵߳����ߣ���sleep()������

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Sleep_Thread extends JFrame{
	
	/**
	 * @author ����
	 */
	private static final long serialVersionUID = 3888002892946485195L;

	private Thread t;
	
	//�����ɫ����
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,
			                                          Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED};
	private static final Random rand = new Random();       //�����������
	
	private static Color getC() {       //��ȡ�����ɫֵ�ķ���
		return 	color[rand.nextInt(color.length)];
	}
	
	public Sleep_Thread() {      //�������췽��
		t = new Thread(new Runnable() {     //���������̶߳���
			int x = 100;
			int y = 50;
			
			public void run() {       //�����߳̽ӿڷ���
				while(true) {    //����ѭ��
					try {
					Thread.sleep(100);      //�߳�����0.1��
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
					
					Graphics graphics = getGraphics();   //��ȡ�����ͼ�����Ķ���
					graphics.setColor(getC());     //���û�ͼ��ɫ
					graphics.drawLine(x, y, 200, y++);    //��ͼֱ�߲�������ֱ����
					if(y >= 150) {
						y = 50;
					}
				}
			}
			
		});
		t.start();       //�����߳�
	}
	public static void main(String[] args) {
		
		init(new Sleep_Thread(),300,300);
		

	}

	private static void init(JFrame frame,int width,int height) {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 350, width, height);
		frame.setSize(width,height);
		frame.setVisible(true);
		
		
	}

}
