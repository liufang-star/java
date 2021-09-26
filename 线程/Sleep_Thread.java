package thread_;

                                                 //线程的休眠！（sleep()方法）

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Sleep_Thread extends JFrame{
	
	/**
	 * @author 刘芳
	 */
	private static final long serialVersionUID = 3888002892946485195L;

	private Thread t;
	
	//添加颜色数组
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,
			                                          Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED};
	private static final Random rand = new Random();       //创建随机对象
	
	private static Color getC() {       //获取随机颜色值的方法
		return 	color[rand.nextInt(color.length)];
	}
	
	public Sleep_Thread() {      //创建构造方法
		t = new Thread(new Runnable() {     //创建匿名线程对象
			int x = 100;
			int y = 50;
			
			public void run() {       //覆盖线程接口方法
				while(true) {    //无线循环
					try {
					Thread.sleep(100);      //线程休眠0.1秒
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
					
					Graphics graphics = getGraphics();   //获取组件绘图上下文对象
					graphics.setColor(getC());     //设置绘图颜色
					graphics.drawLine(x, y, 200, y++);    //绘图直线并递增垂直坐标
					if(y >= 150) {
						y = 50;
					}
				}
			}
			
		});
		t.start();       //启动线程
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
