package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

                                                                       //JPanel面板！

public class Swing_JPanel extends JFrame{
	
	public Swing_JPanel() {
		
		setTitle("JPanel面板");    //窗体标题
		setBounds(550, 350, 800, 600);   //窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);   //窗体关闭方式
		
		Container a = getContentPane();   //创建一个容器
		a.setLayout(new GridLayout(2,2,10,10));   //给容器添加网格布局。（2行、2列、水平间距10像素、垂直间距10像素）
		
		JPanel p1 = new JPanel();    //创建面板
		p1.setLayout(new GridLayout(1, 4, 10, 10));   //一行四列水平垂直各为10像素
		
		JPanel p2 = new JPanel(new BorderLayout());     //给容器添加边界布局。
		
		JPanel p3 = new JPanel(new GridLayout(2,1,10,10));    //（2行、1列、水平间距10像素、垂直间距10像素）
		
		JPanel p4 = new JPanel(new GridLayout(1,2,10,10));   //添加网格布局
		
		
		/*
		 * 添加边框。
		 */
		
		p1.setBorder(BorderFactory.createTitledBorder("面板1"));    //添加面板标题边框
		p2.setBorder(BorderFactory.createTitledBorder("面板2"));  //添加面板标题边框
		p3.setBorder(BorderFactory.createTitledBorder("面板3"));
		p4.setBorder(BorderFactory.createTitledBorder("面板4"));
		
		
		/*
		 * 添加按钮
		 */
		p1.add(new JButton("P1（1）"));      //网格布局（按钮）。
		p1.add(new JButton("P1（2）"));
		p1.add(new JButton("P1（3）"));
		p1.add(new JButton("P1（4）"));
		
		p2.add(new JButton("p2（中部）"),BorderLayout.CENTER);    //边界布局（按钮）。
		p2.add(new JButton("p2（南部）"),BorderLayout.SOUTH);
		p2.add(new  JButton("p2（西部）"),BorderLayout.WEST);
		p2.add(new JButton("p2（北部）"),BorderLayout.NORTH);
		p2.add(new JButton("p2（东部）"),BorderLayout.EAST);
		
		p3.add(new JButton("p3（1）"));
		p3.add(new JButton("p3（2）"));
		
		p4.add(new JButton("p4（1）"));
		p4.add(new JButton("p4（2）"));
		p4.setBackground(Color.BLUE);     //设置背景颜色。
		
		a.add(p1);a.add(p2);a.add(p3);a.add(p4);
		
	}

	public static void main(String[] args) {
		Swing_JPanel k= new Swing_JPanel();
		k.setVisible(true);

	}

}
