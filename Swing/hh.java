package Swing�������.txt;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

                                              //�����֣�ʹ�ã�setLayout(new FlowLayout())��������

/*
 * �ص㣺
 *          ���ı���������Ĵ�Сʱ����������İڷ�λ��Ҳ����Ӧ�ط����仯��
 *          ���������һ�к󣬽��Զ����У�ֱ�����е�������ڷ���������Ϊֹ��
 *      
 * ȱ�㣺
 *         �����������壩   <     ���    ʱ���޷�������ʾȫ�����������Щ����ᱻ���ǵ���
 */

public class hh extends JFrame{
	public hh() {
		setTitle("ʹ�������ֹ�����");   //���ô������⡣
		setBounds(550, 350, 500, 400);   //���ô���λ�úʹ�С��
		setDefaultCloseOperation(EXIT_ON_CLOSE);   //���ô���رշ�ʽ��
		Container a = getContentPane();//����һ��������
		
		//��һ��������CENTER�����뷽ʽ�����ڶ���������20��ˮƽ�������������������20����ֱ�������
		a.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));     //���������֡�
		
		for(int i = 1;i <=10;i++) {
			a.add(new JButton("��ť"+i));     //ѭ����Ӱ�ť�����
		}
		
		
	}

	public static void main(String[] args) {
		hh k = new hh();
		k.setVisible(true);   //���ô���ɼ���

	}

}
