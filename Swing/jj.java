package Swing�������.txt;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                         //���񲼾ֹ�������ʹ�ã�setLayout(new GridLayout(,,,,))��������

/*
 * �ص㣺
 *        ������Ըı䴰��Ĵ�С�����������е������СҲ����Ӧ�ĸı䡣
 */ 

public class jj extends JFrame{
	public jj() {
		
		setTitle("ʹ�����񲼾ֹ�����");     //���ô�����⡣
		setBounds(550, 350, 500, 400);   //���ô���λ�úʹ�С��
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //���ô���رշ�ʽ��
		
		Container a = getContentPane();   //����һ��������
		setLayout(new GridLayout(5,4,5,5));    //����Ϊ���񲼾֣�5��4�У�ˮƽ���Ϊ5���أ���ֱ���Ϊ5���ء�
		
		for(int i = 1;i <=20;i++) {
			a.add(new JButton("��ť"+i));    //ѭ����Ӱ�ť��
		}
		
	}

	public static void main(String[] args) {
		jj k = new jj();
		k.setVisible(true);   //���ô���ɼ���

	}

}
