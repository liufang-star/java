package GridBagLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

                                            //网格组布局管理器（GridBagLayout）！

                                                         //insets属性。

/*
 * 概念：
 *          属性insets用来设置组件四周与单元格边缘之间的最小距离。
 *          
 * 注意：
 *         该属性的类型为Insets，Insets类有一个构造方法Insets(int top,int left,int bottom,int right)；
 *         它的4个入口参数依次为组件上方、左侧、下方、右侧的最小距离，单位为像素。
 */

public class insets {
	
	JFrame f = new JFrame();   //创建窗体。
	Container c;   //主容器。
	
	
	void createFrame() {
		f.setTitle("insets属性");
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
	
	void init5() {
		GridBagConstraints g1 = new GridBagConstraints();         //创建约束条件。
		g1.gridx = 2;   //使用gridx属性。
		g1.gridy = 2;    //使用gridy属性。
		
		g1.insets = new Insets(10, 10, 10, 10);   //使用insets类设置组件四周与单元格之间的最小距离。
		
		c.add(new JButton("@@"),g1);    //创建JButton按钮的同时设置组件
	}

	public static void main(String[] args) {
		insets d = new insets();
		d.createFrame();
		d.creatButton();
        d.init5();
		d.f.setVisible(true);


	}

}
