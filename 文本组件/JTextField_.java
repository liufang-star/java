package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

                                                     //�ı��������JtextField�ࣩ��

public class JTextField_  extends JFrame {
	
	public JTextField_() {      //���췽��
		setTitle("�ı������JTextField");     //���ô������
		setBounds(550, 350, 400, 300);     //���ô���λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ
		
		Container a = getContentPane();     //��������
		a.setLayout(new FlowLayout());     //���������ò��֣������֣�FlowLayout������
		
		JTextField jt = new JTextField();    //�����ı���
		jt.setColumns(20);    //�����ı��򳤶ȣ�20���ַ�
		jt.setText("kk");    //�����ı������ݣ�
		jt.setFont(new Font("����", Font.BOLD, 20));    //�����ı���ʽ������ʹ�С��
		
		JButton btn = new JButton("ȷ��");    //����JButton��ť
		btn.addActionListener(new ActionListener() {     //����¼�����
			
			@Override
			public void actionPerformed(ActionEvent e) {    //���������ķ���
				System.out.println("�ı�����Ϊ��"+jt.getText());    //����ı�����
				
				jt.setText("");     //����ı��������
				jt.requestFocus();      //��ȡ���㣬����ȡ��꣩
				
				System.out.println("--------------------end------------------------");
				
			}
		});	
		a.add(btn);    //�������õİ�ť��ӵ���������
		a.add(jt);     //�������õ��ı�����ӵ���������

	}
	


	public static void main(String[] args) {   //������
		
		JTextField_ k = new JTextField_();     //����k����
		k.setVisible(true);     //���ô���ɼ�

	}

}
