package Swing程序设计.txt;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

                                        //绝对布局（null布局）使用（容器名.setLatout(null)）方法！

/*
 * 注意：
 *         使用绝对布局的窗口通常都是固定大小的，组件的位置和形状不会随着窗体的改变而发生改变。（null布局！）
 *        
 *  优缺点：
 *           优点：可以让组件放在任何一个地方。
 *           缺点：组件放在某个位置就无法再改变了。
 */

public class gg extends JFrame{
	
	public gg() {
		setTitle("本窗口使用绝对布局");   //设置该窗体标题。
		setBounds(550, 350, 500, 400);   //绝对定位窗体的位置和大小。
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //设置窗体关闭方式。
		Container a = getContentPane();  //创建容器对象。
		
		a.setLayout(null);    //使该窗体取消布局管理器设置。
		
		JButton b = new JButton("按钮1"),b1 = new JButton("按钮2");   //创建按钮。
		b.setBounds(20, 20, 80, 30);   //设置按钮的位置和大小。
		b1.setBounds(80, 80, 100, 20);
		a.add(b);//使按钮添加到容器中。
		a.add(b1);
		setVisible(true);   //使窗体可见。
		
	}

	public static void main(String[] args) {
		new gg();

	}

}
