package thread_;

                                                //实现Runnable接口！！

import java.awt.Container;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Implements_Runnable extends JFrame{
	
	/**
	 * @author 刘芳
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1 = new JLabel();     //声明JLabel对象（标签对象）
	private static Thread t;
	private int count = 0;     //声明计数变量
	private Container c = getContentPane();    //声明容器
	
	public Implements_Runnable() {     //构造方法 
		setTitle("移动的表情...");
		setBounds(500, 350, 300, 120);     //绝对定位窗体大小和位置
		c.setLayout(null);     //使窗体不使用任何布局管理器
		
		try {
		//获取图片的URL，此图片与本类在同一包下
		URL url = Implements_Runnable.class.getResource("[2Q{6F0$FLS12T9]H$JT[LD.jpg");
		Icon icon = new ImageIcon(url);    //实例化一个Icon
		j1.setIcon(icon);     //将图标放置在标签中
	}catch(NullPointerException ex) {
		System.out.println("图片不存在，请将图片拷贝到当前目录下！");
		return;
		}
		//设置图片在标签的最左方
		j1.setHorizontalAlignment(SwingConstants.LEFT);
		j1.setBounds(count, 10, 300,150);   //设置标签的位置与大小
		j1.setOpaque(true); 
		
		t = new Thread(new Runnable() {      //定义匿名内部类，该类实现Runnable接口

			@Override
			public void run() {      //重写run()方法
				
				while(count <= 300) {    //设置循环条件
					j1.setBounds(count, 10, 300, 50);   //设置标签的位置与大小
					try {
						Thread.sleep(500);    //休眠0.5秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					count += 4;    //使横坐标每次增加4
					
					if(count == 300) {    //当图标到达标签的最右边时，使其回到标签最左边
						count = 10;
					}
				}
				
			}	
		});
		
		t.start();    //启动线程
		c.add(j1);    //使标签添加到容器中
		setVisible(true);     //使窗体可见
		
		//设置窗体的关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Implements_Runnable();    //实例化一个Implements_Runnable对象
	


	}

}
