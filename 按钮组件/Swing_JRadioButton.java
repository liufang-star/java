package JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

                                                        //��ѡ��ť�����JRadioButton����

public class Swing_JRadioButton extends JFrame{
	
	public Swing_JRadioButton() {    //���췽��
		
		setTitle("��ѡ��ť��JRadioButton");    //�������
		setBounds(550, 350, 500, 400);     //��������ʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //����رշ�ʽ
		
		Container a = getContentPane();     //����һ������
		a.setLayout(new FlowLayout());     //�����������֣������֣���FlowLayout��
		
		JRadioButton left = new JRadioButton("������");     //����ѡ��
		JRadioButton right = new JRadioButton("������");
		left.setFont(new Font("����",Font.BOLD,20));    //����ѡ������ʹ�С
		right.setFont(new Font("����",Font.BOLD,20));
		
		ButtonGroup group = new ButtonGroup();      //��ť��
		group.add(left);    //��ѡ��ť
		group.add(right);
		
		left.setSelected(true);    //Ĭ��ѡ��
		
		JButton btn = new JButton("ȷ��");
		btn.addActionListener(new ActionListener() {     //��Ӽ����¼�
			
			@Override
			public void actionPerformed(ActionEvent e) {     //���������ķ���
				System.out.println(left.getText()+"����ťѡ��״̬Ϊ��"+left.isSelected());
				System.out.println(right.getText()+"����ťѡ��״̬Ϊ��"+right.isSelected());
				
				System.out.println("--------------end----------------");
				
				group.clearSelection();     //��ť�����ѡ�
				
			}
		});
		
		a.add(left);     //��left������ӵ�a������
		a.add(right);
		a.add(btn);   //��JButton��ť��ӵ���������
		
		
	}
	

	public static void main(String[] args) {
		Swing_JRadioButton k = new Swing_JRadioButton();
		k.setVisible(true);     //���ô���ɼ�

	}

}
