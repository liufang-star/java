package JScrollPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

                                                    //������壨JScrollPane��壡����

public class Swing_JScrollPane extends JFrame{
	public Swing_JScrollPane() {  //���췽��
		setTitle("JScrollPane���");    //�������
		setBounds(550, 350, 500, 400);    //���ô�������ʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رչ��򣬹رմ���ʱֹͣ����
		
		Container a = getContentPane();    //����һ������
		
		JTextArea area = new JTextArea();     //�����ı���
//		area.setLineWrap(true);    //����Ϊ�����Զ�����
		
		JScrollPane b = new JScrollPane(area);    //����������壬���ı�����ӹ�����
		
		area.setForeground(Color.red);    //�����ı����б�ǩ�������ɫ
		area.setFont(new Font("����",Font.BOLD,20));    //�����ı����ǩ������ʹ�С��
		a.add(b);    //������ӹ�����塣
		
	}

	public static void main(String[] args) {
		Swing_JScrollPane k = new Swing_JScrollPane();
		k.setVisible(true);    //���ô���ɼ���

	}

}
