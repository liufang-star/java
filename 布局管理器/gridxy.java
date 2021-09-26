package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                  //网格组布局管理器（GridBagLayout）！

                                                          //gridx和gridy属性。

/*
 * 概念：
 *         这两个属性用来设置组件起始点所在单元格的索引值。
 *         
 * 注意：
 *          属性gridx设置的是X轴（即网格水平方向）的索引值，所以它表示的是组件起始点所在列的索引。
 *          属性gridy设置的是Y轴（即网格垂直方向）的索引值，所以它表示的是组件起始点所在行的索引。
 */


public class gridxy {
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("gridx_y属性");
		c = f.getContentPane();    //创建容器。
		c.setLayout(new GridBagLayout());     //设置网格组布局。
		f.setSize(800, 600);   //设置窗体宽和高。width、height。
		
		//一定要先写对齐方式再写关闭窗口方式。。
		//f.setLocationRelativeTo(null);   //使用居中对齐（null表示默认居中！）
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置窗体关闭方式。
		f.setLocationRelativeTo(null);   //使用居中对齐（null表示默认居中！）
		
	}
	
	void init() {
		
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 0;   //使用gridx属性。
		g1.gridy = 0;    //使用gridy属性。
		c.add(new JButton("组件1"),g1);    //创建JButton按钮的同时设置组件。
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 1;
		g2.gridy = 1;
		c.add(new JButton("组件2"),g2); 
		
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 2;
		g3.gridy = 2;
		c.add(new JButton("组件3"),g3); 
	}
	
	

	public static void main(String[] args) {
		gridxy d = new gridxy();   //创建对象。
		d.createFrame();   //调用createFrame()方法。
		d.init();   //调用init()方法。
		d.f.setVisible(true);   //设置窗体可见。

	}

}
