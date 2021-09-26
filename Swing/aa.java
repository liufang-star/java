package Swing程序设计.txt;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

                                                     //常用窗体（JFrame窗体！）

                                                      /*JFrame窗体！*/

public class aa {


	public static void main(String[] args) {
		
		JFrame f = new JFrame("窗体标题");    //创建窗体对象！
		
		f.setVisible(true);    //设置窗体可见！使用.setVisible(ture)方法！
		
		
		/*
		 * 窗体关闭的4种方式：
		 *         （1）EXIT_ON_CLOSE：隐藏窗体，并停止程序！
		 *         （2）DO_NOTHING_ON_CLOSE：无任何操作！（点X关闭不了！！重点。。。）
		 *         （3）HIDE_ON_CLOSE：隐藏窗体，但不停止程序！
		 *         （4）DISPOSE_ON_CLOSE：释放窗体资源（会停留一段时间！）！
		 */
		
		//通过调用.setDefaultCloseOperation()方法关闭窗体！
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		f.setSize(500,400);   //设置窗体的大小、单位：像素。使用.setSize()方法！
//		f.setLocation(550, 350);   //设置窗体坐标、单位：像素。使用.setLocation()方法！
		f.setBounds(550, 350, 500, 400);  //与上面相同，设置窗体的坐标和大小、单位：像素。shiyong.setBounds()方法！
		
		
		Container c = f.getContentPane();   //获取窗体容器！
		c.setBackground(Color.CYAN);  //设置背景颜色！
		
		JLabel l = new JLabel("这是一个窗体！");        //JLabel代表Swing中的标签组件！
		l.setHorizontalAlignment(SwingConstants.CENTER);   //使窗体标签中的文字居中！
		c.add(l);    //添加组件！
		
//		c.remove(l);   //删除组件！
		
		c.invalidate();   //验证容器中的组件！（起到刷新效果！）
//		f.setContentPane(c);   //重新载入容器！和.incalidate()方法效果一样！（起到刷新效果）！
		
		f.setResizable(false);     //设置窗体是否可以改变大小！
		
		System.out.println("x = "+f.getX()+"，y = "+f.getY());
		

	}

}
