package JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

                                                            //��ѡ�������JCheckBox����

public class Swing_JCheckBox extends JFrame{
	
	public Swing_JCheckBox() {    //���췽��
		
		setTitle("JCheckBox��ѡ�����");    //�������
		setBounds(600, 350, 350, 250);     //���ô�������ʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô��� �ر�״̬
		
		Container a = getContentPane();    //�����������
		a.setLayout(new FlowLayout());    //�����������֣������֣� FlowLayout��
		
		JCheckBox b1 = new JCheckBox("��ť1");     //���ø�ѡ��ť1
		JCheckBox b2 = new JCheckBox("��ť2");    //���ø�ѡ��ť2
		JCheckBox b3 = new JCheckBox("��ť3");    //���ø�ѡ��ť3
		
		b1.setSelected(true);    //Ĭ��ѡ�е�״̬ ����ť1��
		
		JButton btn = new JButton("ȷ��");    //����JButton��ť���
		btn.addActionListener(new ActionListener() {     //��Ӽ����¼�
			
			@Override
			public void actionPerformed(ActionEvent e) {    //���������ķ���
				System.out.println(b1.getText()+"����ѡ��ѡ��״̬Ϊ��"+b1.isSelected());
				System.out.println(b2.getText()+"����ѡ��ѡ��״̬Ϊ��"+b2.isSelected());
				System.out.println(b3.getText()+"����ѡ��ѡ��״̬Ϊ��"+b3.isSelected());
				
				System.out.println("---------------end----------------");
				
			}
		});
		
		a.add(btn);   //��JButton��ť��ӵ���������
		
		a.add(b1);a.add(b2);a.add(b3);    //����ѡ��ť��ӵ���������
		
	}

	public static void main(String[] args) {
		Swing_JCheckBox k = new  Swing_JCheckBox();
		k.setVisible(true);    //���ô���ɼ�

	}

}
