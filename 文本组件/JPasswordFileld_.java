package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

                               //����������JPasswordField�ࣩ��

public class JPasswordFileld_ extends JFrame {
	
	public JPasswordFileld_() {    //���췽��
		
		setTitle("��������JPasswordField");     //���ô������
		setBounds(550, 350, 400, 300);     //���ô���λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);     //���ô���رշ�ʽ���رմ���ʱ�رճ���
		
		Container a = getContentPane();     //��������
		a.setLayout(new FlowLayout());      //���������ò��֣�������FlowLayout����
		
		JPasswordField jp = new JPasswordField();      //��������ı���
		jp.setColumns(20);     //�������볤�ȣ�20���ַ�
//		jp.setFont(new Font("Arial", Font.BOLD, 18));     //��������
		jp.setEchoChar('\u2605');     //���û����ַ�
		
		jp.addActionListener(new ActionListener() {     //��Ӷ����������س�
			
			@Override
			public void actionPerformed(ActionEvent e) {    //���������ķ���
				char ch[] = jp.getPassword();     //��ȡ������ַ�����
				jp.setText("");      //����ı�������
				String str = new String(ch);
				System.out.println("----------------end---------------------");
				System.out.println("����Ϊ��"+str);     //���������Ϣ
				
			}
		});
		
		a.add(jp);     //�������ı�����ӵ���������
		
	}

	public static void main(String[] args) {      //������
		JPasswordFileld_ k = new JPasswordFileld_();     //����j����
		k.setVisible(true);  //���ô���ɼ�

	}

}
