package Swing程序设计.txt;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                              //流布局，使用（setLayout(new FlowLayout())）方法！

/*
 * 特点：
 *          当改变整个窗体的大小时，其中组件的摆放位置也会相应地发生变化。
 *          当组件填满一行后，将自动换行，直到所有的组件都摆放在容器中为止。
 *      
 * 缺点：
 *         当容器（窗体）   <     组件    时，无法满足显示全部组件，则有些组件会被覆盖掉。
 */

public class hh extends JFrame{
	public hh() {
		setTitle("使用流布局管理器");   //设置窗体表标题。
		setBounds(550, 350, 500, 400);   //设置窗体位置和大小。
		setDefaultCloseOperation(EXIT_ON_CLOSE);   //设置窗体关闭方式。
		Container a = getContentPane();//创建一个容器。
		
		//第一个参数：CENTER（对齐方式）、第二个参数：20（水平间隔）、第三个参数：20（垂直间隔）。
		a.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));     //设置流布局。
		
		for(int i = 1;i <=10;i++) {
			a.add(new JButton("按钮"+i));     //循环添加按钮组件。
		}
		
		
	}

	public static void main(String[] args) {
		hh k = new hh();
		k.setVisible(true);   //设置窗体可见。

	}

}
