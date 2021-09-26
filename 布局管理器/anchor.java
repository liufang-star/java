package GridBagLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

                                                    //网格组布局管理器（GridBagLayout）！

                                                                //anchor属性。

/*
 * 概念：
 *         属性anchor用来设置组件在其所在显示区域的显示位置。
 *         
 * 注意：
 *        通常上将显示区域从方向上划分为9个方位，分别为：
 *        北方（NORTH）、东北（NORTHEAST）、东方（EAST）、东南（SOUTHEAST）
 *        南方（SOUTH）、西南（SOUTHWEST）、西方（WEST）、西北（NORTHWEST）
 *        和中心（CENTER）
 */

public class anchor {
	
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("anchor属性");
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
	
	void init4() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 1;   //使用gridx属性。
		g1.gridy = 1;    //使用gridy属性。
		g1.gridwidth = 2;
		g1.gridheight = 2;
		
		g1.anchor = GridBagConstraints.SOUTH;    //使用anchor属性设置显示区域的显示位置。
		
		c.add(new JButton("@@"),g1);    //创建JButton按钮的同时设置组件
		
		
		//需要使用JPanel类！（面板！）
		g1.fill = GridBagConstraints.BOTH;
		g1.anchor = GridBagConstraints.CENTER;
		JPanel p =new JPanel();
		p.setBackground(Color.green);
		c.add(p,g1);
		
	}
	
	public static void main(String[] args) {
		anchor d = new anchor();
		d.createFrame();
		d.creatButton();
        d.init4();
		d.f.setVisible(true);


	}

}
