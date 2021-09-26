package JComboBox_JList;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

                                                                //列表框组件（JList）！

public class JList_  extends JFrame{
	
	public JList_() {    //构造方法
		
		setTitle("列表框组件JList");    //设置窗体标题
		setBounds(550, 350, 500, 400);     //设置窗体位置和大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //设置窗体关闭方式
		
		Container a = getContentPane();     //创建容器
		a.setLayout(null);      //给容器设置布局（绝对布局（null））！
		
		String[] items = {"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8"};   //定义一个数组列表
		
		//使用JList类构造方法创建列表框（第一种方法）！
//		JList<String> jl = new JList<>(items);
		
		
		//使用DefaultComboBoxModel模型添加列表框（第二种方法）！优点：可以添加元素！
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();   //创建列表框的数据模型
		for(String tmp : items) {     //遍历数组列表
			
			model.addElement(tmp);   //想数据模型添加元素
			
		}
		JList<String> jl = new JList<>();
		model.addElement("添加元素");    //数据模型添加新元素！
		jl.setModel(model);    //列表框载入数据模型
		
		
		/*
		 * 设置选择模式的三种形式：
		 *          （1）SINGLE_SELECTION：单选。
		 *          （2）SINGLE_INTERVAL_SELECTION：只能连续选择相邻的元素。
		 *          （3）MULTIPLE_INTERVAL_SELECTION：随便选（多选）
		 */
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);  //设置选择模式
		JScrollPane js = new JScrollPane(jl);    //创建一个滚动面板（JScrollPane类）！
		jl.setFont(new Font("楷体", Font.BOLD, 20));    //给列表元素中的内容设置字体和大小
		js.setBounds(50, 50, 110, 150);     //设置滚动面板的位置和大小
		a.add(js);   //将滚动面板添加到容器中
		
		JButton btn = new JButton("确定");     //创建JButton按钮
		btn.setBounds(180, 80, 80, 30);    //给JButton按钮设置位置和大小
		btn.addActionListener(new ActionListener() {     //添加事件监听
			
			@Override
			public void actionPerformed(ActionEvent e) {     //触发监听的方法
				
				//获取列表框中选中的所有元素。
				java.util.List<String> values = jl.getSelectedValuesList();
				
				for(String tmp : values) {     //遍历输出
					System.out.println(tmp);
				}
				System.out.println("-----------------end------------------");
			}
		});
		
		a.add(btn);    //将JButton按钮添加到容器中
	}

	public static void main(String[] args) {     //主方法
		JList_ k = new JList_();     //创建k的对象！
		k.setVisible(true);    //设置窗体可见

	}

}
