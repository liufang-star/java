package JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

                                                        //单选按钮组件（JRadioButton）！

public class Swing_JRadioButton extends JFrame{
	
	public Swing_JRadioButton() {    //构造方法
		
		setTitle("单选按钮组JRadioButton");    //窗体标题
		setBounds(550, 350, 500, 400);     //窗体坐标和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //窗体关闭方式
		
		Container a = getContentPane();     //创建一个容器
		a.setLayout(new FlowLayout());     //设置容器布局（流布局）：FlowLayout！
		
		JRadioButton left = new JRadioButton("向左走");     //创建选项
		JRadioButton right = new JRadioButton("向右走");
		left.setFont(new Font("楷体",Font.BOLD,20));    //设置选项字体和大小
		right.setFont(new Font("楷体",Font.BOLD,20));
		
		ButtonGroup group = new ButtonGroup();      //按钮组
		group.add(left);    //单选按钮
		group.add(right);
		
		left.setSelected(true);    //默认选中
		
		JButton btn = new JButton("确定");
		btn.addActionListener(new ActionListener() {     //添加监听事件
			
			@Override
			public void actionPerformed(ActionEvent e) {     //监听触发的方法
				System.out.println(left.getText()+"：按钮选中状态为："+left.isSelected());
				System.out.println(right.getText()+"：按钮选中状态为："+right.isSelected());
				
				System.out.println("--------------end----------------");
				
				group.clearSelection();     //按钮组清空选项。
				
			}
		});
		
		a.add(left);     //将left对象添加到a容器中
		a.add(right);
		a.add(btn);   //将JButton按钮添加到容器当中
		
		
	}
	

	public static void main(String[] args) {
		Swing_JRadioButton k = new Swing_JRadioButton();
		k.setVisible(true);     //设置窗体可见

	}

}
