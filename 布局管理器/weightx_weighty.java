package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                               //网格组布局管理器（GridBagLayout）！

                                                     //weightx和weighty属性。

/*
 * 概念：
 *        这两个属性用来设置网格组的每一行和每一列对额外空间的分布方式。
 *        
 * 注意：
 *         在不设置属性weigthx和weighty（即采用默认设置）的情况下，当窗体调整到足够大时，
 *         组件全部聚集在窗体的中央，在组件四周出现了大片的额外空间。
 *         为了避免这种情况出现，就可以通过weightx和weighty这两个属性进行设置。
 */

public class weightx_weighty {
	
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("weightx_weighty属性");
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
	
	void init7() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 2;   //使用gridx属性。
		g1.gridy = 2;    //使用gridy属性。
		g1.weightx = 10;    //使用weightx属性。
		g1.weighty = 10;     //使用weighty属性。
		
		c.add(new JButton("@@"),g1);    //创建JButton按钮的同时设置组件
	}
	public static void main(String[] args) {
		weightx_weighty d = new weightx_weighty();
		d.createFrame();
		d.creatButton();
        d.init7();
		d.f.setVisible(true);


	}

}
