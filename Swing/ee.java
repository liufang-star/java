package Swing程序设计.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                     //标签组件与图标（JLabel）！

public class ee extends JFrame{
	public ee() {
		
		setTitle("父窗体标题");    //父窗体标题。
		setBounds(550, 350, 500, 400);  //父窗体坐标和大小。
		
		setResizable(false);  //设置窗体是否可以拉伸改变！
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //窗体关闭方式。
		Container b = getContentPane();//创建一个容器。
		
		JLabel c = new JLabel("窗体标签");    //窗体内容（标签）！
		
		
		b.add(c);
		c.setHorizontalAlignment(SwingConstants.CENTER);  //使窗体标签居中。
		c.setFont(new Font("楷体",Font.BOLD,30));  //这种标签字体方式和大小。
		c.setForeground(Color.red);//设置字体颜色。
		
		
		
	
	}
	public static void main(String[] args) {
		
		ee k = new ee();//实例化对象。
		k.setVisible(true);  //设置窗体可见。
	}

}
