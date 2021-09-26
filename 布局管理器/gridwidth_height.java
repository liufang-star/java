package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                       //网格组布局管理器（GridBagLayout）！

                                                           //gridwidth和gridheight属性。

/*
 * 概念：
 *           这两个属性用来设置组件占用网格组的行数和列数。
 *           
 * 注意：
 *         属性gridwidth为组件占用网格组的列数，也可以理解为以单元格为单位组件的宽度。
 *         属性gridheight为组件占用网格组的行数，也可以理解为以单元格为单位组件的高度。
 */

public class gridwidth_height {
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("gridwidth_gridheight属性");
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
	
	void init2() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 1;   //使用gridx属性。
		g1.gridy = 1;    //使用gridy属性。
		c.add(new JButton("组件1"),g1);    //创建JButton按钮的同时设置组件。
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 2;      //设置X轴的索引值。
		g2.gridy = 2;       //设置Y轴的索引值。
		g2.gridwidth = 2;     //设置组件所占网格列数。
		g2.gridheight = 1;    //设置组件所占网格行数。
		c.add(new JButton("组件2"),g2); 
		
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 4;
		g3.gridy = 4;
		g3.gridwidth = 2;
		g3.gridheight = 2;
		c.add(new JButton("组件3"),g3); 
	}

	public static void main(String[] args) {
		gridwidth_height d = new gridwidth_height();
		d.createFrame();
		d.creatButton();
		d.init2();
		d.f.setVisible(true);

	}

}
