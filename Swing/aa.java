package Swing�������.txt;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

                                                     //���ô��壨JFrame���壡��

                                                      /*JFrame���壡*/

public class aa {


	public static void main(String[] args) {
		
		JFrame f = new JFrame("�������");    //�����������
		
		f.setVisible(true);    //���ô���ɼ���ʹ��.setVisible(ture)������
		
		
		/*
		 * ����رյ�4�ַ�ʽ��
		 *         ��1��EXIT_ON_CLOSE�����ش��壬��ֹͣ����
		 *         ��2��DO_NOTHING_ON_CLOSE�����κβ���������X�رղ��ˣ����ص㡣������
		 *         ��3��HIDE_ON_CLOSE�����ش��壬����ֹͣ����
		 *         ��4��DISPOSE_ON_CLOSE���ͷŴ�����Դ����ͣ��һ��ʱ�䣡����
		 */
		
		//ͨ������.setDefaultCloseOperation()�����رմ��壡
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		f.setSize(500,400);   //���ô���Ĵ�С����λ�����ء�ʹ��.setSize()������
//		f.setLocation(550, 350);   //���ô������ꡢ��λ�����ء�ʹ��.setLocation()������
		f.setBounds(550, 350, 500, 400);  //��������ͬ�����ô��������ʹ�С����λ�����ء�shiyong.setBounds()������
		
		
		Container c = f.getContentPane();   //��ȡ����������
		c.setBackground(Color.CYAN);  //���ñ�����ɫ��
		
		JLabel l = new JLabel("����һ�����壡");        //JLabel����Swing�еı�ǩ�����
		l.setHorizontalAlignment(SwingConstants.CENTER);   //ʹ�����ǩ�е����־��У�
		c.add(l);    //��������
		
//		c.remove(l);   //ɾ�������
		
		c.invalidate();   //��֤�����е����������ˢ��Ч������
//		f.setContentPane(c);   //����������������.incalidate()����Ч��һ��������ˢ��Ч������
		
		f.setResizable(false);     //���ô����Ƿ���Ըı��С��
		
		System.out.println("x = "+f.getX()+"��y = "+f.getY());
		

	}

}
