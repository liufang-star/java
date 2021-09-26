package Swing程序设计.txt;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

                                                            //对话框窗体（JDialog）！

public class cc extends JDialog{
	
	public cc(JFrame frame) {   //定义一个构造方法！
		
		/*
		 * super(frame,"对话框标题",true);解释：
		 * 第一个参数：父窗体对象
		 * 第二个参数：对话框标题
		 * 第三个参数：是否阻塞父窗体
		 */
		super(frame,"对话框标题",true);
		
		Container k =getContentPane();    //获取一个容器！
		k.add(new JLabel("这是一个对话框"));   //创建一个JLabel标签！
		setBounds(720, 450, 200, 200);  //设置窗体坐标和大小！
	}

	public static void main(String[] args) {
		JFrame k = new JFrame("父窗体");   //创建一个父窗体！
		k.setBounds(550,350,550,350);    //设置窗体坐标和大小！
		Container t = k.getContentPane();  //获取一个容器！
		JButton ko = new JButton("弹出对话框");
		t.setLayout(new FlowLayout());    //设置布局，使用流布局！
		k.add(ko);      //将ko中的按钮文字（弹出对话框）添加到容器中！
		k.setVisible(true);  //设置窗体可见！
		k.setDefaultCloseOperation(EXIT_ON_CLOSE);   //设置窗体关闭方式！
		ko.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cc a = new cc(k);
				a.setVisible(true);   //设置窗体可见！
				
			}
		});   //添加动作监听！
	

	}

}
