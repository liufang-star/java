package Swing程序设计.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                  //对话框窗体升级版（JDialog）！


public class dd extends JDialog{
	
	public dd(JFrame frame) {
		
		//实例化一个JDialog对象，指定对话框的父窗体、窗体标题和类型。
		super(frame,"表白成功",true);   
		
		Container a = getContentPane();   //获取一个容器！
//		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);   //关闭方式，点X没用！
       JLabel b = new JLabel("我喜欢你！");   //在容器中添加标签。
       b.setFont(new Font("楷体",Font.BOLD,15));    //设置容器标签字体和大小。
       b.setForeground(Color.red);     //设置字体颜色。
       a.add(b);   
       
       
       b.setHorizontalAlignment(SwingConstants.CENTER);   //使容器中的标签居中。
       setBounds(720, 450, 200, 200);   //设置对话框窗体坐标和大小。
       
	}

	public static void main(String[] args) {
		
		JFrame c = new JFrame("运行成功");  //父窗体标题。
		c.setBounds(550, 350, 550, 350);     //设置父窗体坐标和大小。
		
		Container d = c.getContentPane();   //创建一个容器。
		
		JButton e = new JButton("你敢点吗？");   //定义一个按钮。
		
	     d.setLayout(new FlowLayout());    //设置流布局。
	     
	     c.add(e);
	     c.setVisible(true);   //设置窗体可见。
	     c.setDefaultCloseOperation(EXIT_ON_CLOSE);   //设置窗体关闭方式。
	     
	     
	     
	     //给按钮JButton添加监听，用来监听处理操作事件。
	     e.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dd f = new dd(c);
				
			     f.setVisible(true);
				
			}
		});
		
		

	}

}

