package Swing�������.txt;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

                                        //���Բ��֣�null���֣�ʹ�ã�������.setLatout(null)��������

/*
 * ע�⣺
 *         ʹ�þ��Բ��ֵĴ���ͨ�����ǹ̶���С�ģ������λ�ú���״�������Ŵ���ĸı�������ı䡣��null���֣���
 *        
 *  ��ȱ�㣺
 *           �ŵ㣺��������������κ�һ���ط���
 *           ȱ�㣺�������ĳ��λ�þ��޷��ٸı��ˡ�
 */

public class gg extends JFrame{
	
	public gg() {
		setTitle("������ʹ�þ��Բ���");   //���øô�����⡣
		setBounds(550, 350, 500, 400);   //���Զ�λ�����λ�úʹ�С��
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //���ô���رշ�ʽ��
		Container a = getContentPane();  //������������
		
		a.setLayout(null);    //ʹ�ô���ȡ�����ֹ��������á�
		
		JButton b = new JButton("��ť1"),b1 = new JButton("��ť2");   //������ť��
		b.setBounds(20, 20, 80, 30);   //���ð�ť��λ�úʹ�С��
		b1.setBounds(80, 80, 100, 20);
		a.add(b);//ʹ��ť��ӵ������С�
		a.add(b1);
		setVisible(true);   //ʹ����ɼ���
		
	}

	public static void main(String[] args) {
		new gg();

	}

}
