package Swing程序设计;

//邮箱发�?�界面！�??

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

//import Swing程序设计.JButton.Swing_JButton;

public class Swing_ extends JDialog {
	public Swing_(JFrame frame) { // 定义一个构造方法！

		/*
		 * super(frame,"对话框标题",true);解释：第一个参数：父窗体对象， 第二个参数：对话框标题，第三个参数：是否阻塞父窗
		 */
		super(frame, "切换账户（账号/密码)", true);

		Container k = getContentPane(); // 获取一个容器！
		k.setLayout(null);
		setBounds(605, 355, 500, 400); // 设置窗体坐标和大小！

		JLabel jl1 = new JLabel("账号");
		jl1.setBounds(40, 60, 100, 50);
		k.add(jl1);

		JLabel jl2 = new JLabel("密码");
		jl2.setBounds(40, 120, 100, 50);
		k.add(jl2);

		JTextField jt = new JTextField(10); // 创建文本域
		jt.setBounds(90, 70, 200, 30);
		k.add(jt);

		JPasswordField jp = new JPasswordField(16);
		jp.setBounds(90, 130, 200, 30);
		jp.setEchoChar('\u2605'); // 设置回显字符
		k.add(jp);
		jt.setFont(new Font("楷体", Font.BOLD, 20)); // 设置文本格式（字体和大小）

		JButton jb4 = new JButton("登录");
		jb4.setBounds(150, 180, 60, 30);
		k.add(jb4);
		jb4.setBorderPainted(false); // 设置无边�??
		jb4.setBackground(Color.ORANGE);

		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str = jt.getText();
				String str2 = jp.getText();

				if (str.equals("2531994628") && str2.equals("123456")) {

					JOptionPane.showMessageDialog(null, "登录成功", "登录", JOptionPane.PLAIN_MESSAGE);
//					 JOptionPane.showConfirmDialog(null, "登录成功", "登录",JOptionPane.PLAIN_MESSAGE);  

				} else {
					JOptionPane.showMessageDialog(null, "登录失败", "登录", JOptionPane.WARNING_MESSAGE);
//					   int n = JOptionPane.showConfirmDialog(null, "你高兴吗?", "登录",JOptionPane.YES_NO_OPTION);
				}
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		JFrame k = new JFrame("邮箱客户端--------发送邮件"); // 创建一个父窗体对象
		k.setBounds(353, 111, 1024, 860); // 设置窗体坐标和大小

		Container a = k.getContentPane();
		a.setLayout(null);
		k.setResizable(false);

		JButton jb1 = new JButton("发送");
		jb1.setBounds(20, 20, 100, 40);
		a.add(jb1);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "确定发送吗?", "发送", JOptionPane.YES_NO_OPTION);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "发送成功！", "发送", JOptionPane.PLAIN_MESSAGE);

			}
		});

		JButton jb2 = new JButton("保存草稿");
		jb2.setBounds(135, 20, 100, 40);
		a.add(jb2);
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "保存成功", "保存草稿", JOptionPane.PLAIN_MESSAGE);

			}
		});

		JButton jb3 = new JButton("切换账户");
		jb3.setBounds(250, 20, 100, 40);
		jb3.setBorder(BorderFactory.createLineBorder(Color.green)); // 设置颜色边框
		a.add(jb3);

		JLabel jl3 = new JLabel("发件人：");
		jl3.setBounds(20, 100, 100, 50);
		jl3.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jl3);

		JLabel jl5 = new JLabel();
		jl5.setText("2531994628@qq.com");
		jl5.setFont(new Font("楷体", Font.ITALIC, 20));
		jl5.setBounds(120, 92, 180, 70);
		a.add(jl5);

		JLabel jl4 = new JLabel("收件人：");
		jl4.setBounds(20, 150, 100, 50);
		jl4.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jl4);

		JTextField jt2 = new JTextField();
		jt2.setBounds(120, 160, 250, 30);
		jt2.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jt2);

		JLabel jl6 = new JLabel("主题：");
		jl6.setBounds(40, 200, 100, 50);
		jl6.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jl6);

		JTextField jt3 = new JTextField();
		jt3.setBounds(120, 210, 250, 30);
		jt3.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jt3);

		JLabel jl7 = new JLabel("内容：");
		jl7.setBounds(20, 520, 100, 50);
		jl7.setFont(new Font("楷体", Font.BOLD, 20));
		a.add(jl7);

		JTextArea jt4 = new JTextArea();
		jt4.setBounds(75, 350, 615, 400);
		jt4.setFont(new Font("楷体", Font.BOLD, 20));
		jt4.setLineWrap(true);
		jt4.setRows(30);
		jt4.setColumns(50);
		a.add(jt4);

		JComboBox<String> box = new JComboBox<>();
		String[] itmes = { "宋体", "楷体", "隶书" };
		ComboBoxModel<String> cm = new DefaultComboBoxModel<String>(itmes);
		box.setModel(cm);
		box.setBounds(120, 280, 80, 30);
		a.add(box);

		JButton jb4 = new JButton("确定");
		jb4.setBounds(240, 280, 60, 30);
		jb4.setBackground(Color.PINK);
		a.add(jb4);

		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("选中的颜色为：" + box.getSelectedItem());
				System.out.println("----------------end----------------");

			}
		});

		JCheckBox jc1 = new JCheckBox("普通邮件");
		jc1.setBounds(390, 250, 90, 40);
		jc1.setFont(new Font("楷体", Font.BOLD, 13));
		a.add(jc1);

		JCheckBox jc2 = new JCheckBox("紧急邮件");
		jc2.setBounds(500, 250, 90, 40);
		jc2.setFont(new Font("楷体", Font.BOLD, 13));
		a.add(jc2);

		JCheckBox jc3 = new JCheckBox("阅读回执");
		jc3.setBounds(610, 250, 90, 40);
		jc3.setFont(new Font("楷体", Font.BOLD, 13));
		a.add(jc3);

		JRadioButton jr1 = new JRadioButton("普通发送");
		jr1.setBounds(500, 280, 90, 40);
		jr1.setFont(new Font("楷体", Font.BOLD, 13)); // 设置选项字体和大小
		JRadioButton jr2 = new JRadioButton("加密发送");
		jr2.setBounds(610, 280, 90, 40);
		jr2.setFont(new Font("楷体", Font.BOLD, 13)); // 设置选项字体和大小
		jr1.setSelected(true); // 默认选中
		ButtonGroup group = new ButtonGroup(); // 按钮组
		group.add(jr1); // 单选按纽
		group.add(jr2);
		a.add(jr1);
		a.add(jr2);

		JLabel jl8 = new JLabel("联系人");
		jl8.setBounds(720, 20, 90, 30);
		jl8.setFont(new Font("楷体", Font.BOLD, 18));
		a.add(jl8);

//		JTextArea jt5 = new JTextArea();
//		jt5.setBounds(720, 60, 265, 300);
//		jt5.setLineWrap(true);
//		jt5.setRows(15);       //给文本域设置行数
//		jt5.setColumns(30);     //给文本域设置列数
//		jt5.setFont(new Font("楷体",Font.BOLD,18));

		String[] itmes2 = { "4006751066@qq.com", "zhangsan@163.com", "mingrisoft@mingrisoft.com", "53498653@qq.com",
				"mingrixueyuan@126.com", "admiin@qq.com", "mrsoft@qq.com", "xiaoqiang@163.com", "2531994628@qq,com",
				"xxx", "xxx", "xxx", "xxx", "xxx" };

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		for (String tmp : itmes2) {
			model.addElement(tmp);
		}
		JList<String> jl = new JList<String>();
		jl.setModel(model);
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // 设置选择模式
		JScrollPane js = new JScrollPane(jl); // 创建一个滚动面板（JScrollPane类）
		jl.setFont(new Font("楷体", Font.BOLD, 20)); // 给列表元素中的内容设置字体和大小
		js.setBounds(710, 60, 290, 300); // 设置滚动面板的位置和大小
		a.add(js); // 将滚动面板添加到容器中

//		a.add(jt5);

		JButton jb5 = new JButton("确定");
		jb5.setBounds(910, 370, 90, 30);
		jb5.setFont(new Font("黑体", Font.BOLD, 20));
		jb5.setBackground(Color.CYAN);
		a.add(jb5);

		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				java.util.List<String> values = jl.getSelectedValuesList();
				for (String tmp2 : values) {
					System.out.println("你选择的联系人是：" + tmp2);
				}
				System.out.println("----------------end-----------------");

			}
		});

		k.add(jb3); // 将ko中的按钮文字（弹出对话框）添加到容器中！
		k.setVisible(true); // 设置窗体可见
		k.setDefaultCloseOperation(EXIT_ON_CLOSE); // 设置窗体关闭方式
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Swing_ a = new Swing_(k);
				a.setVisible(true); // 设置窗体可见

			}
		}); // 添加动作监听

	}
}
