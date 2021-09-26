package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


                                                     //�ύ��ť�������JButton����


public class Swing_JButton extends JFrame{
	
	public Swing_JButton() {   //���췽��
		
		setTitle("JButton��ť");    //�������
		setBounds(550, 350, 500, 400);    //���ô���λ�úͱ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ
		
		Container a = getContentPane();    //����һ������
		a.setLayout(new GridLayout(3, 2,10,10));     //������������
		
		JButton btn[] = new JButton[7];    //����6��JButton��ť
		for(int i = 1;i <=6;i++) {     //ѭ����ť
		   btn[i] = new JButton();     //��ʼ����ť
			a.add(btn[i]);   //����ť��ӵ�������
		}
		
		btn[1].setText("�����ð�ť");    //�����ı�
		btn[1].setEnabled(false);    //�������Ϊ������
		
		btn[2].setText("�б���ɫ��ť");    //�����ı�
		btn[2].setBackground(Color.CYAN);   //���ð�ť��ɫ
		
		btn[3].setText("�ޱ߿�ť");   //�����ı�
		btn[3].setBorderPainted(false);     //����ʾ�߿�
		
		btn[4].setText("�б߿�ť");   //�����ı�
		btn[4].setBorder(BorderFactory.createLineBorder(Color.orange));    //������ɫ�߿�
		
		Icon icon = new ImageIcon("src/WD898~E9F]}YC74_48)~CAF.jpg");    //��ȡ��ť
		btn[5].setIcon(icon);    //����ť����ͼƬ
		btn[5].setToolTipText("ͼƬ��ť");    //�����ͣ��ʾ
		
		btn[6].setText("�ɵ����ť");
		btn[6].addActionListener(new ActionListener() {     //����¼�����
			
			@Override
			public void actionPerformed(ActionEvent e) {     //���������ķ���
				JOptionPane.showMessageDialog(Swing_JButton.this, "�����ť");     //����С�Ի���
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		Swing_JButton k = new Swing_JButton();
		k.setVisible(true);    //���ô���ɼ���

	}

}
