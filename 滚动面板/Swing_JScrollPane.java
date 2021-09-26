package JScrollPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

                                                    //滚动面板（JScrollPane面板！）！

public class Swing_JScrollPane extends JFrame{
	public Swing_JScrollPane() {  //构造方法
		setTitle("JScrollPane面板");    //窗体标题
		setBounds(550, 350, 500, 400);    //设置窗体坐标和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭规则，关闭窗口时停止程序
		
		Container a = getContentPane();    //创建一个容器
		
		JTextArea area = new JTextArea();     //创建文本域
//		area.setLineWrap(true);    //设置为可以自动换行
		
		JScrollPane b = new JScrollPane(area);    //创建滚动面板，给文本域添加滚动条
		
		area.setForeground(Color.red);    //设置文本域中标签字体的颜色
		area.setFont(new Font("楷体",Font.BOLD,20));    //设置文本域标签的字体和大小。
		a.add(b);    //容器添加滚动面板。
		
	}

	public static void main(String[] args) {
		Swing_JScrollPane k = new Swing_JScrollPane();
		k.setVisible(true);    //设置窗体可见。

	}

}
