package JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

                                                                       //JPanel��壡

public class Swing_JPanel extends JFrame{
	
	public Swing_JPanel() {
		
		setTitle("JPanel���");    //�������
		setBounds(550, 350, 800, 600);   //����λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);   //����رշ�ʽ
		
		Container a = getContentPane();   //����һ������
		a.setLayout(new GridLayout(2,2,10,10));   //������������񲼾֡���2�С�2�С�ˮƽ���10���ء���ֱ���10���أ�
		
		JPanel p1 = new JPanel();    //�������
		p1.setLayout(new GridLayout(1, 4, 10, 10));   //һ������ˮƽ��ֱ��Ϊ10����
		
		JPanel p2 = new JPanel(new BorderLayout());     //��������ӱ߽粼�֡�
		
		JPanel p3 = new JPanel(new GridLayout(2,1,10,10));    //��2�С�1�С�ˮƽ���10���ء���ֱ���10���أ�
		
		JPanel p4 = new JPanel(new GridLayout(1,2,10,10));   //������񲼾�
		
		
		/*
		 * ��ӱ߿�
		 */
		
		p1.setBorder(BorderFactory.createTitledBorder("���1"));    //���������߿�
		p2.setBorder(BorderFactory.createTitledBorder("���2"));  //���������߿�
		p3.setBorder(BorderFactory.createTitledBorder("���3"));
		p4.setBorder(BorderFactory.createTitledBorder("���4"));
		
		
		/*
		 * ��Ӱ�ť
		 */
		p1.add(new JButton("P1��1��"));      //���񲼾֣���ť����
		p1.add(new JButton("P1��2��"));
		p1.add(new JButton("P1��3��"));
		p1.add(new JButton("P1��4��"));
		
		p2.add(new JButton("p2���в���"),BorderLayout.CENTER);    //�߽粼�֣���ť����
		p2.add(new JButton("p2���ϲ���"),BorderLayout.SOUTH);
		p2.add(new  JButton("p2��������"),BorderLayout.WEST);
		p2.add(new JButton("p2��������"),BorderLayout.NORTH);
		p2.add(new JButton("p2��������"),BorderLayout.EAST);
		
		p3.add(new JButton("p3��1��"));
		p3.add(new JButton("p3��2��"));
		
		p4.add(new JButton("p4��1��"));
		p4.add(new JButton("p4��2��"));
		p4.setBackground(Color.BLUE);     //���ñ�����ɫ��
		
		a.add(p1);a.add(p2);a.add(p3);a.add(p4);
		
	}

	public static void main(String[] args) {
		Swing_JPanel k= new Swing_JPanel();
		k.setVisible(true);

	}

}
