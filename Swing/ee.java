package Swing�������.txt;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

                                                     //��ǩ�����ͼ�꣨JLabel����

public class ee extends JFrame{
	public ee() {
		
		setTitle("���������");    //��������⡣
		setBounds(550, 350, 500, 400);  //����������ʹ�С��
		
		setResizable(false);  //���ô����Ƿ��������ı䣡
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //����رշ�ʽ��
		Container b = getContentPane();//����һ��������
		
		JLabel c = new JLabel("�����ǩ");    //�������ݣ���ǩ����
		
		
		b.add(c);
		c.setHorizontalAlignment(SwingConstants.CENTER);  //ʹ�����ǩ���С�
		c.setFont(new Font("����",Font.BOLD,30));  //���ֱ�ǩ���巽ʽ�ʹ�С��
		c.setForeground(Color.red);//����������ɫ��
		
		
		
	
	}
	public static void main(String[] args) {
		
		ee k = new ee();//ʵ��������
		k.setVisible(true);  //���ô���ɼ���
	}

}
