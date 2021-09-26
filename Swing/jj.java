package Swing程序设计.txt;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                         //网格布局管理器，使用（setLayout(new GridLayout(,,,,))）方法！

/*
 * 特点：
 *        如果尝试改变窗体的大小，将发现其中的组件大小也会相应的改变。
 */ 

public class jj extends JFrame{
	public jj() {
		
		setTitle("使用网格布局管理器");     //设置窗体标题。
		setBounds(550, 350, 500, 400);   //设置窗体位置和大小。
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //设置窗体关闭方式。
		
		Container a = getContentPane();   //创建一个容器。
		setLayout(new GridLayout(5,4,5,5));    //设置为网格布局，5行4列，水平间距为5像素，垂直间距为5像素。
		
		for(int i = 1;i <=20;i++) {
			a.add(new JButton("按钮"+i));    //循环添加按钮。
		}
		
	}

	public static void main(String[] args) {
		jj k = new jj();
		k.setVisible(true);   //设置窗体可见。

	}

}
