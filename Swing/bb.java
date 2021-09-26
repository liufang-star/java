package Swing程序设计.txt;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                                //JFrame窗体升级版！

public class bb extends JFrame{
	
	public bb() {   //定义一个构造方法！
		
		setVisible(true);    //设置窗体可见！
		
		setBounds(550, 350, 500, 400);     //设置坐标和大小！
		setTitle("欢迎来到刘芳界面");   //设置窗体标题！
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置关闭窗口方式！
		
		JLabel k = new JLabel("我喜欢你！");     //设置一个JLabel标签！
		k.setHorizontalAlignment(SwingConstants.CENTER);    //使标签上的文字居中！
		add(k);    //将标签添加到容器中！
		
		Container i = getContentPane();    //获取一个容器！
		i.setBackground(Color.CYAN);   //设置窗体背景颜色！
		
		setResizable(false);   //设置窗体是否可以拉大！
		
		i.invalidate();  //刷新页面效果！（验证容器中的组件！）
		
		System.out.println(" x = "+getX()+"，y = "+getY());
	}

	public static void main(String[] args) {     //在主方法中调用bb()构造方法！
		new bb();
	
	}

}
