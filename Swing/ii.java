package Swing�������.txt;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

                                               //�߽粼�֣�ʹ�ã�.setLayout(new BorderLayout())��������

public class ii extends JFrame{
	public ii() {
		setTitle("ʹ�ñ߽粼�ֹ�����");   //���ô�����⡣
		setBounds(550, 350, 500, 400);   //���ô���λ�úʹ�С��
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ��
		Container a = getContentPane();   //����һ��������
		
		a.setLayout(new BorderLayout());     //����Ϊ�߽粼�֡�
		
		JButton c1 = new JButton("��"),
				c2 = new JButton("��"),
				c3 = new JButton("��"),
				c4 = new JButton("��"),
				c5 = new JButton("��");
		
		a.add(c1,BorderLayout.CENTER);   //�в���������
		a.add(c2,BorderLayout.EAST);   //������������
		a.add(c3,BorderLayout.WEST);   //������������
		a.add(c4,BorderLayout.SOUTH);   //�ϲ���������
		a.add(c5,BorderLayout.NORTH);    //������������
		
		a.add(new JButton("����"),BorderLayout.CENTER);    //��������Ǿ������
		
		
	}
	

	public static void main(String[] args) {
		ii k = new ii();
          k.setVisible(true);   //���ô���ɼ���

	}

}
