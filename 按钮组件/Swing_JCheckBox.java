package JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

                                                            //复选框组件（JCheckBox）！

public class Swing_JCheckBox extends JFrame{
	
	public Swing_JCheckBox() {    //构造方法
		
		setTitle("JCheckBox复选框组件");    //窗体标题
		setBounds(600, 350, 350, 250);     //设置窗体坐标和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体 关闭状态
		
		Container a = getContentPane();    //创建体格容器
		a.setLayout(new FlowLayout());    //设置容器布局（流布局） FlowLayout！
		
		JCheckBox b1 = new JCheckBox("按钮1");     //设置复选框按钮1
		JCheckBox b2 = new JCheckBox("按钮2");    //设置复选框按钮2
		JCheckBox b3 = new JCheckBox("按钮3");    //设置复选框按钮3
		
		b1.setSelected(true);    //默认选中的状态 （按钮1）
		
		JButton btn = new JButton("确定");    //创建JButton按钮组件
		btn.addActionListener(new ActionListener() {     //添加监听事件
			
			@Override
			public void actionPerformed(ActionEvent e) {    //触发监听的方法
				System.out.println(b1.getText()+"：复选框选中状态为："+b1.isSelected());
				System.out.println(b2.getText()+"：复选框选中状态为："+b2.isSelected());
				System.out.println(b3.getText()+"：复选框选中状态为："+b3.isSelected());
				
				System.out.println("---------------end----------------");
				
			}
		});
		
		a.add(btn);   //将JButton按钮添加到容器当中
		
		a.add(b1);a.add(b2);a.add(b3);    //将复选框按钮添加到容器当中
		
	}

	public static void main(String[] args) {
		Swing_JCheckBox k = new  Swing_JCheckBox();
		k.setVisible(true);    //设置窗体可见

	}

}
