
package wen_ben_zu_jian;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

                                 //�ı��������JTextArea�ࣩ��

public class JTextArea_ extends JFrame {
	
	public JTextArea_() {     //���췽��
		
		setTitle("�ı������JTextArea");   //���ô������
		setBounds(550, 350, 500, 400);    //���ô���λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);     //���ô���رշ�ʽ���رմ���ʱ�رճ���
		
		Container a = getContentPane();     //��������
		a.setLayout(new FlowLayout());      //���������Ĳ��֣�������FlowLayout����
		
		JTextArea jta = new JTextArea();      //�����ı���
		jta.setRows(10);     //�趨��
		jta.setColumns(30);     //�趨����
		jta.setText("�����ı���");     //�ı�ԭ������
		jta.append("�������");    //������ݣ�ʹ��append��������
		jta.insert("����", 2);     //�������ݣ�ʹ��insert���������ڵڶ����ַ������������
		jta.setFont(new Font("����", Font.BOLD, 20));       //�����ı�������ʹ�С
		JScrollPane jst = new JScrollPane(jta);      //���ı���ӹ�����
		
		a.add(jst);     //���ı�����ӵ���������
	}

	public static void main(String[] args) {
		
		JTextArea_ k = new JTextArea_();     //����k����
		k.setVisible(true);      //���ô���ɼ�
		
	}

}
