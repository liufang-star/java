package ActionEvent_;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

                                   //动作事件监听（ActionEvent方法）！

public class actionPerformed_ extends JFrame{
	public actionPerformed_() {
		Container c = getContentPane();
		setTitle("动作事件监听（ActionEvent）");
		setBounds(550, 350, 600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel centerP = new JPanel();
		centerP.setLayout(new FlowLayout());
		c.add(centerP,BorderLayout.CENTER);
		
		JPanel southP = new JPanel();
		JLabel console = new JLabel("点击组件");
		southP.add(console);
		c.add(southP,BorderLayout.SOUTH);
		
		JButton btn = new JButton("确定");
		centerP.add(btn);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				console.setText("确定被点击");
				
			}
		});
		
		JTextField jt = new JPasswordField(10);
		centerP.add(jt);
		jt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				JTextField jtTmp = (JTextField)obj;
				System.out.println(jtTmp.getText());
				console.setText("文本框点击了回车");
				
			}
		});
		
		JCheckBox jc = new JCheckBox("多选框");
		centerP.add(jc);
		jc.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				console.setText("多选框被点击了");
				
			}
		});
		
		JRadioButton jr = new JRadioButton("单选框");
		centerP.add(jr);
		jr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText("单选框被点击了");
				
			}
		});
		
//		JRadioButton jr1 = new JRadioButton("单选框");
//		centerP.add(jr1);
		
		String values[] = {"选项1","选项2","选项3"};
		JComboBox  jb =new JComboBox(values);
		centerP.add(jb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText("下拉列表被选择");
				
			}
		});
		c.validate();   //重新验证以下容器中的组件
		
	}

	public static void main(String[] args) {
		actionPerformed_ k = new actionPerformed_();
		k.setVisible(true);

	}

}
