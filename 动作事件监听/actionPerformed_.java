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

                                   //�����¼�������ActionEvent��������

public class actionPerformed_ extends JFrame{
	public actionPerformed_() {
		Container c = getContentPane();
		setTitle("�����¼�������ActionEvent��");
		setBounds(550, 350, 600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel centerP = new JPanel();
		centerP.setLayout(new FlowLayout());
		c.add(centerP,BorderLayout.CENTER);
		
		JPanel southP = new JPanel();
		JLabel console = new JLabel("������");
		southP.add(console);
		c.add(southP,BorderLayout.SOUTH);
		
		JButton btn = new JButton("ȷ��");
		centerP.add(btn);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				console.setText("ȷ�������");
				
			}
		});
		
		JTextField jt = new JPasswordField(10);
		centerP.add(jt);
		jt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				JTextField jtTmp = (JTextField)obj;
				System.out.println(jtTmp.getText());
				console.setText("�ı������˻س�");
				
			}
		});
		
		JCheckBox jc = new JCheckBox("��ѡ��");
		centerP.add(jc);
		jc.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				console.setText("��ѡ�򱻵����");
				
			}
		});
		
		JRadioButton jr = new JRadioButton("��ѡ��");
		centerP.add(jr);
		jr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText("��ѡ�򱻵����");
				
			}
		});
		
//		JRadioButton jr1 = new JRadioButton("��ѡ��");
//		centerP.add(jr1);
		
		String values[] = {"ѡ��1","ѡ��2","ѡ��3"};
		JComboBox  jb =new JComboBox(values);
		centerP.add(jb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText("�����б�ѡ��");
				
			}
		});
		c.validate();   //������֤���������е����
		
	}

	public static void main(String[] args) {
		actionPerformed_ k = new actionPerformed_();
		k.setVisible(true);

	}

}
