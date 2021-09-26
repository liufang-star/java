package FocusEvent_;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class focusLost extends JFrame{
	
	public focusLost() {
		
		setTitle("焦点事件监听器（FocusEvent）");
		setBounds(550, 350, 500, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();    //创建一个不可滚动面板
		setContentPane(contentPane);    //创建容器
		contentPane.setLayout(null);   //设置绝对布局
		
		JTextField jt1 = new JTextField(20);    //设置文本框
		jt1.setBounds(30, 30, 200, 30);
		contentPane.add(jt1);
		
		JTextField jt2 = new JTextField(20);
		jt2.setBounds(30, 90, 200, 30);
		contentPane.add(jt2);
		
		JTextField jt3 = new JTextField(20);
		jt3.setBounds(30, 150, 200, 30);
		contentPane.add(jt3);
		
		JLabel jl1 = new JLabel("未获得焦点");   //设置标签
		jl1.setBounds(260, 20, 100, 50);
		contentPane.add(jl1);
		
		JLabel jl2 = new JLabel("未获得焦点");
		jl2.setBounds(260, 80, 100, 50);
		contentPane.add(jl2);
		
		JLabel jl3 = new JLabel("未获得焦点");
		jl3.setBounds(260, 140, 100, 50);
		contentPane.add(jl3);
		

//第一种获取和失去焦点的方法！
jt1.addFocusListener(new FocusListener() {   //添加焦点事件监听
			
			@Override
			public void focusLost(FocusEvent e) {    //失去焦点产生的效果
				jl1.setText("失去焦点");
				jl1.setForeground(Color.BLUE);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {     //获取焦点产生的效果
				jl1.setText("鼠标在焦点“1”处");
				jl1.setForeground(Color.RED);
				
			}
		});
		
jt2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				jl2.setText("失去焦点");
				jl2.setForeground(Color.BLUE);
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				jl2.setText("鼠标在焦点“2”处");
				jl2.setForeground(Color.RED);
				
			}
		});


jt3.addFocusListener(new FocusListener() {
	
	@Override
	public void focusLost(FocusEvent e) {
		jl3.setText("失去焦点");
		jl3.setForeground(Color.BLUE);
		
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		jl3.setText("鼠标在焦点“3”处");
		jl3.setForeground(Color.RED);
		
	}
});


//第二种获取和失去焦点的方法！
//jt1.addFocusListener(new MyFocusListenter());
//jt3.addFocusListener(new MyFocusListenter());
//jt2.addFocusListener(new MyFocusListenter());
//
//class MyFocusListenter implements FocusListener{     //创建自定义的事件监听实现类
//
//
//	public void focusGained(FocusEvent e) {
//		JTextField tmp = (JTextField)e.getSource();    //获取触发事件的组件
//		tmp.setBorder(BorderFactory.createLineBorder(Color.green));   //给获取焦点的文本框设置边框颜色
//		
//	}
//
//	
//	public void focusLost(FocusEvent e) {
//		JTextField tmp = (JTextField)e.getSource();    //获取触发事件的组件
//		tmp.setBorder(BorderFactory.createLineBorder(Color.CYAN));   //给失去焦点的文本框设置边框颜色
//		
//		
//	}
//
//	}
		
		
	}

	public static void main(String[] args) {
		focusLost k = new focusLost();
		k.setVisible(true);

	}

}
