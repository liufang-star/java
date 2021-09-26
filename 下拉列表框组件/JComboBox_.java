package JComboBox_JList;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

                                                      //下拉列表框组件（JComboBox类）！

public class JComboBox_ extends JFrame{
	
	public JComboBox_() {     //构造方法
		
		setTitle("JComboBox下拉列表框组件");   //设置窗体标题
		setBounds(550, 350, 500, 400);     //设置窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式
		
		
		Container a = getContentPane();    //创建容器
		a.setLayout(null);    //给容器添加布局（绝对布局）！
		
		//创建下拉列表的第一种方法！
//		JComboBox<String> comboBox = new JComboBox<>();   //创建下拉列表，应用了JDK7的新特性
//		comboBox.addItem("身份证");
//		comboBox.addItem("学生证");
//		comboBox.addItem("工作证");		
		
		
		//创建下拉列表的第二种方法！
//		String items[] = {"数组元素1","数组元素2","数组元素3"};
//		JComboBox<String> comboBox = new JComboBox<>(items);   //创建下拉列表，应用了JDK7的新特性
		
		//创建下拉列表的第三种方法！
		JComboBox<String> comboBox = new JComboBox<>();   //创建下拉列表，应用了JDK7的新特性
		String items[] = {"身份证","学生证","军人证"};
		ComboBoxModel cm = new DefaultComboBoxModel<>(items);    //使用ComboBoxModel类！
		comboBox.setModel(cm);
		
		
		JButton btn = new  JButton("确定");    //创建JButton按钮
		btn.addActionListener(new ActionListener() {    //添加监听事件
			
			@Override
			public void actionPerformed(ActionEvent e) {     //触发监听的方法
				System.out.println("选中的索引为："+comboBox.getSelectedIndex());   //获取选中的索引
				System.out.println("选中的值为："+comboBox.getSelectedItem());   //获取
				
				System.out.println("------------end-------------");
			}
			
		});
		
		btn.setBounds(160, 30, 100, 30);   //设置JButton按钮的位置和大小
		comboBox.setBounds(30, 30, 100, 30);    //设置下拉列表的位置和大小
		
//		comboBox.setEditable(true);    //是否可以编辑。
		a.add(comboBox);    //将下拉列表框添加到容器中
		a.add(btn);    //将JButton按钮添加到容器中
	}

	public static void main(String[] args) {    //主方法
		
		JComboBox_ k = new JComboBox_();
		k.setVisible(true);    //设置窗体可见

	}

}
