package Swing�������.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                  //�Ի����������棨JDialog����


public class dd extends JDialog{
	
	public dd(JFrame frame) {
		
		//ʵ����һ��JDialog����ָ���Ի���ĸ����塢�����������͡�
		super(frame,"��׳ɹ�",true);   
		
		Container a = getContentPane();   //��ȡһ��������
//		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);   //�رշ�ʽ����Xû�ã�
       JLabel b = new JLabel("��ϲ���㣡");   //����������ӱ�ǩ��
       b.setFont(new Font("����",Font.BOLD,15));    //����������ǩ����ʹ�С��
       b.setForeground(Color.red);     //����������ɫ��
       a.add(b);   
       
       
       b.setHorizontalAlignment(SwingConstants.CENTER);   //ʹ�����еı�ǩ���С�
       setBounds(720, 450, 200, 200);   //���öԻ���������ʹ�С��
       
	}

	public static void main(String[] args) {
		
		JFrame c = new JFrame("���гɹ�");  //��������⡣
		c.setBounds(550, 350, 550, 350);     //���ø���������ʹ�С��
		
		Container d = c.getContentPane();   //����һ��������
		
		JButton e = new JButton("��ҵ���");   //����һ����ť��
		
	     d.setLayout(new FlowLayout());    //���������֡�
	     
	     c.add(e);
	     c.setVisible(true);   //���ô���ɼ���
	     c.setDefaultCloseOperation(EXIT_ON_CLOSE);   //���ô���رշ�ʽ��
	     
	     
	     
	     //����ťJButton��Ӽ���������������������¼���
	     e.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dd f = new dd(c);
				
			     f.setVisible(true);
				
			}
		});
		
		

	}

}

