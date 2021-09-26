package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

                                                     //文本框组件（JtextField类）！

public class JTextField_  extends JFrame {
	
	public JTextField_() {      //构造方法
		setTitle("文本框组件JTextField");     //设置窗体标题
		setBounds(550, 350, 400, 300);     //设置窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式
		
		Container a = getContentPane();     //创建容器
		a.setLayout(new FlowLayout());     //给容器设置布局（流布局（FlowLayout））！
		
		JTextField jt = new JTextField();    //创建文本框
		jt.setColumns(20);    //设置文本框长度，20个字符
		jt.setText("kk");    //设置文本（内容）
		jt.setFont(new Font("楷体", Font.BOLD, 20));    //设置文本格式（字体和大小）
		
		JButton btn = new JButton("确认");    //创建JButton按钮
		btn.addActionListener(new ActionListener() {     //添加事件监听
			
			@Override
			public void actionPerformed(ActionEvent e) {    //监听触发的方法
				System.out.println("文本内容为："+jt.getText());    //输出文本内容
				
				jt.setText("");     //清空文本框的内容
				jt.requestFocus();      //获取焦点，（获取光标）
				
				System.out.println("--------------------end------------------------");
				
			}
		});	
		a.add(btn);    //将创建好的按钮添加到容器当中
		a.add(jt);     //将创建好的文本框添加到容器当中

	}
	


	public static void main(String[] args) {   //主方法
		
		JTextField_ k = new JTextField_();     //创建k对象
		k.setVisible(true);     //设置窗体可见

	}

}
