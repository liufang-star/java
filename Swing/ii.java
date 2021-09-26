package Swing程序设计.txt;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

                                               //边界布局，使用（.setLayout(new BorderLayout())）方法！

public class ii extends JFrame{
	public ii() {
		setTitle("使用边界布局管理器");   //设置窗体标题。
		setBounds(550, 350, 500, 400);   //设置窗体位置和大小。
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式。
		Container a = getContentPane();   //创建一个容器。
		
		a.setLayout(new BorderLayout());     //设置为边界布局。
		
		JButton c1 = new JButton("中"),
				c2 = new JButton("东"),
				c3 = new JButton("西"),
				c4 = new JButton("南"),
				c5 = new JButton("北");
		
		a.add(c1,BorderLayout.CENTER);   //中部添加组件。
		a.add(c2,BorderLayout.EAST);   //东部添加组件。
		a.add(c3,BorderLayout.WEST);   //西部添加组件。
		a.add(c4,BorderLayout.SOUTH);   //南部添加组件。
		a.add(c5,BorderLayout.NORTH);    //北部添加组件。
		
		a.add(new JButton("覆盖"),BorderLayout.CENTER);    //新组件覆盖旧组件。
		
		
	}
	

	public static void main(String[] args) {
		ii k = new ii();
          k.setVisible(true);   //设置窗体可见。

	}

}
