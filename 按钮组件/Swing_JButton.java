package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


                                                     //提交按钮组件！（JButton）！


public class Swing_JButton extends JFrame{
	
	public Swing_JButton() {   //构造方法
		
		setTitle("JButton按钮");    //窗体标题
		setBounds(550, 350, 500, 400);    //设置窗体位置和标题
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式
		
		Container a = getContentPane();    //创建一个容器
		a.setLayout(new GridLayout(3, 2,10,10));     //设置容器布局
		
		JButton btn[] = new JButton[7];    //创建6个JButton按钮
		for(int i = 1;i <=6;i++) {     //循环按钮
		   btn[i] = new JButton();     //初始化按钮
			a.add(btn[i]);   //将按钮添加到容器中
		}
		
		btn[1].setText("不可用按钮");    //设置文本
		btn[1].setEnabled(false);    //设置组件为不可用
		
		btn[2].setText("有背景色按钮");    //设置文本
		btn[2].setBackground(Color.CYAN);   //设置按钮颜色
		
		btn[3].setText("无边框按钮");   //设置文本
		btn[3].setBorderPainted(false);     //不显示边框
		
		btn[4].setText("有边框按钮");   //设置文本
		btn[4].setBorder(BorderFactory.createLineBorder(Color.orange));    //设置颜色边框
		
		Icon icon = new ImageIcon("src/WD898~E9F]}YC74_48)~CAF.jpg");    //获取按钮
		btn[5].setIcon(icon);    //给按钮设置图片
		btn[5].setToolTipText("图片按钮");    //鼠标悬停提示
		
		btn[6].setText("可点击按钮");
		btn[6].addActionListener(new ActionListener() {     //添加事件监听
			
			@Override
			public void actionPerformed(ActionEvent e) {     //监听触发的方法
				JOptionPane.showMessageDialog(Swing_JButton.this, "点击按钮");     //弹出小对话框
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		Swing_JButton k = new Swing_JButton();
		k.setVisible(true);    //设置窗体可见。

	}

}
