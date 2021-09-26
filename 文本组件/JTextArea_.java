
package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

                                 //文本域组件（JTextArea类）！

public class JTextArea_ extends JFrame {
	
	public JTextArea_() {     //构造方法
		
		setTitle("文本域组件JTextArea");   //设置窗体标题
		setBounds(550, 350, 500, 400);    //设置窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);     //设置窗体关闭方式，关闭窗口时关闭程序
		
		Container a = getContentPane();     //创建容器
		a.setLayout(new FlowLayout());      //设置容器的布局（流布局FlowLayout）！
		
		JTextArea jta = new JTextArea();      //创建文本域
		jta.setRows(10);     //设定行
		jta.setColumns(30);     //设定列数
		jta.setText("这是文本域");     //文本原有内容
		jta.append("添加内容");    //添加内容（使用append方法）！
		jta.insert("插入", 2);     //插入内容（使用insert方法）！在第二个字符后面插入内容
		jta.setFont(new Font("楷体", Font.BOLD, 20));       //设置文本域字体和大小
		JScrollPane jst = new JScrollPane(jta);      //给文本添加滚动条
		
		a.add(jst);     //将文本域添加到容器当中
	}

	public static void main(String[] args) {
		
		JTextArea_ k = new JTextArea_();     //创建k对象
		k.setVisible(true);      //设置窗体可见
		
	}

}
