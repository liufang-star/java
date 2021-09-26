package Swing程序设计.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

                                                           //图标的使用！（setIcon方法添加图片。）

public class ff extends JFrame{    //继承JFrame类！
	
	public ff() {   //构造方法！
		
		setBounds(550, 350, 300, 300);   //设置窗体坐标和大小。
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式。
		
		setTitle("图片窗体");    //窗体标题。
		
			Container b = getContentPane();   //创建一个容器。
			
			JLabel c = new JLabel("这是一个图片！");   //创建一个JLabel标签。使用标签展示图片。
			c.setFont(new Font("楷体",Font.BOLD,20));   //设置标签字体和大小。
			c.setForeground(Color.RED);   //设置字体颜色。
		    b.add(c);    //将JLabel标签中的内容添加到容器中。
		    
		  
//		    URL url = ff.class.getResource("WD898~E9F]}YC74_48)~CAF.jpg");   //获取图片URL路径。
//		    Icon icon = new ImageIcon(url);    //获取相应图片路径下的图片文件。
//		    c.setIcon(icon);    //添加图片。
		    
			Icon icon = new ImageIcon("src/WD898~E9F]}YC74_48)~CAF.jpg");   //第二种获取相应路径下的图片文件。
			c.setIcon(icon);   //添加图片。（setIcon方法。）
			
			setResizable(true);    //设置窗体可拉伸。
			System.out.println("x ："+getX()+"   y ："+getY());   //输出窗体的x、y坐标。
	}

	public static void main(String[] args) {
		
		ff k = new ff();   //实例化对象并调用。
		k.setVisible(true);    //设置窗体可见。
		



	}

}
