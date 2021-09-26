package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

                               //密码框组件（JPasswordField类）！

public class JPasswordFileld_ extends JFrame {
	
	public JPasswordFileld_() {    //构造方法
		
		setTitle("密码框组件JPasswordField");     //设置窗体标题
		setBounds(550, 350, 400, 300);     //设置窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);     //设置窗体关闭方式，关闭窗口时关闭程序
		
		Container a = getContentPane();     //创建容器
		a.setLayout(new FlowLayout());      //给容器设置布局（流布局FlowLayout）！
		
		JPasswordField jp = new JPasswordField();      //添加密码文本框
		jp.setColumns(20);     //设置密码长度，20个字符
//		jp.setFont(new Font("Arial", Font.BOLD, 18));     //设置字体
		jp.setEchoChar('\u2605');     //设置回显字符
		
		jp.addActionListener(new ActionListener() {     //添加动作监听，回车
			
			@Override
			public void actionPerformed(ActionEvent e) {    //监听触发的方法
				char ch[] = jp.getPassword();     //获取密码的字符数组
				jp.setText("");      //清空文本框内容
				String str = new String(ch);
				System.out.println("----------------end---------------------");
				System.out.println("密码为："+str);     //输出密码信息
				
			}
		});
		
		a.add(jp);     //将密码文本框添加到容器当中
		
	}

	public static void main(String[] args) {      //主方法
		JPasswordFileld_ k = new JPasswordFileld_();     //创建j对象
		k.setVisible(true);  //设置窗体可见

	}

}
