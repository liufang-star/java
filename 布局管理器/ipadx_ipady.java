package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                //网格组布局管理器（GridBagLayout）！

                                                        //ipadx和ipady属性。

/*
 * 概念：
 *         这两个属性用来修改组件的首选大小。
 *         
 * 注意：
 *         属性ipadx用来修饰组件的宽度，属性ipady用来修饰组件的高度；
 *         如果为正数，则在首选位置的基础上添加指定的宽度和高度；
 *         如果为负数，则在首选位置的基础上减小指定的宽度和高度。
 */

public class ipadx_ipady {
	
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("ipadx_ipady属性");
		c = f.getContentPane();    //创建容器。
		c.setLayout(new GridBagLayout());     //设置网格组布局。
		f.setSize(800, 600);   //设置窗体宽和高。width、height。
		
		//一定要先写对齐方式再写关闭窗口方式。。
		//f.setLocationRelativeTo(null);   //使用居中对齐（null表示默认居中！）
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置窗体关闭方式。
		f.setLocationRelativeTo(null);   //使用居中对齐（null表示默认居中！）
		
	}
	
	void creatButton() {
		for(int i = 0;i <9;i++) {
			
			GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
			g1.gridx = i;   //使用gridx属性。X轴坐标
			g1.gridy = 0;    //使用gridy属性。Y轴坐标
			c.add(new JButton("组件"),g1);    //创建JButton按钮的同时设置组件。
			
			GridBagConstraints g2 = new GridBagConstraints(); 
			g2.gridx = 0;
			g2.gridy = i;
			c.add(new JButton("组件"),g2); 
		}
	}
	
	void init6() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 2;   //使用gridx属性。
		g1.gridy = 2;    //使用gridy属性。
		g1.ipadx = 10;    //使用ipadx关键字在首选位置的基础上添加10宽度。
		g1.ipady = 10;    //使用ipady关键字在首选位置的基础上添加10高度。
		c.add(new JButton("组件"),g1);    //创建JButton按钮的同时设置组件。
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 4;      //设置X轴的索引值。
		g2.gridy = 2;       //设置Y轴的索引值。
		g2.ipadx = -10;     //使用ipadx关键字在首选位置的基础上减小10宽度。
		g2.ipady = -10;     //使用ipadx关键字在首选位置的基础上减小10高度。
		c.add(new JButton("组件"),g2);    //创建JButton按钮的同时设置组件。
	}

	public static void main(String[] args) {
		ipadx_ipady d = new ipadx_ipady();
		d.createFrame();
		d.creatButton();
        d.init6();
		d.f.setVisible(true);

	}

}
