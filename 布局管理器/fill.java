package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                                  //网格组布局管理器（GridBagLayout）！

                                                                //fill属性！

/*
 * 概念：
 *          属性fill用来设置组件的填充方式。
 *          
 * 注意：
 *          当单元格显示区域的面积大于组件面积，
 *          或者一个组件占用多个单元格时，显示组件可能不必占用所有显示区域，
 *          在这种情况下可以通过fill属性设置组件的填充方式。
 */

public class fill {
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("fill属性");
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
	
	
	void init3() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 1;   //使用gridx属性。
		g1.gridy = 1;    //使用gridy属性。
		g1.gridwidth = 2;
		g1.gridheight = 2;
		g1.fill = GridBagConstraints.NONE;    //使用  fill  设置默认居中显示。
		c.add(new JButton("none"),g1);    //创建JButton按钮的同时设置组件。
		
		GridBagConstraints g2 = new GridBagConstraints(); 
		g2.gridx = 3;      //设置X轴的索引值。
		g2.gridy = 1;       //设置Y轴的索引值。
		g2.gridwidth = 2;     //设置组件所占网格列数。
		g2.gridheight = 2;    //设置组件所占网格行数。
		
		g2.fill = GridBagConstraints.HORIZONTAL;    //使用 fill 设置水平填充。
		c.add(new JButton("HORIZONTAL"),g2); 
		GridBagConstraints g3 = new GridBagConstraints();  
		g3.gridx = 5;
		g3.gridy = 1;
		g3.gridwidth = 2;
		g3.gridheight = 2;
		g3.fill = GridBagConstraints.VERTICAL;   //使用 fill 设置垂直填充。
		c.add(new JButton("VERTICAL"),g3); 
		
		GridBagConstraints g4 = new GridBagConstraints();  
		g4.gridx = 7;
		g4.gridy = 1;
		g4.gridwidth = 2;
		g4.gridheight = 2;
		g4.fill = GridBagConstraints.BOTH;   //使用 fill 设置垂直填充。
		c.add(new JButton("BOTH"),g4); 
	}

	public static void main(String[] args) {
		fill d = new fill();
		d.createFrame();
		d.creatButton();
        d.init3();
		d.f.setVisible(true);

	}

}
