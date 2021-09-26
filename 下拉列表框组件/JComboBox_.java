package JComboBox_JList;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

                                                      //�����б�������JComboBox�ࣩ��

public class JComboBox_ extends JFrame{
	
	public JComboBox_() {     //���췽��
		
		setTitle("JComboBox�����б�����");   //���ô������
		setBounds(550, 350, 500, 400);     //���ô���λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ
		
		
		Container a = getContentPane();    //��������
		a.setLayout(null);    //��������Ӳ��֣����Բ��֣���
		
		//���������б�ĵ�һ�ַ�����
//		JComboBox<String> comboBox = new JComboBox<>();   //���������б�Ӧ����JDK7��������
//		comboBox.addItem("���֤");
//		comboBox.addItem("ѧ��֤");
//		comboBox.addItem("����֤");		
		
		
		//���������б�ĵڶ��ַ�����
//		String items[] = {"����Ԫ��1","����Ԫ��2","����Ԫ��3"};
//		JComboBox<String> comboBox = new JComboBox<>(items);   //���������б�Ӧ����JDK7��������
		
		//���������б�ĵ����ַ�����
		JComboBox<String> comboBox = new JComboBox<>();   //���������б�Ӧ����JDK7��������
		String items[] = {"���֤","ѧ��֤","����֤"};
		ComboBoxModel cm = new DefaultComboBoxModel<>(items);    //ʹ��ComboBoxModel�࣡
		comboBox.setModel(cm);
		
		
		JButton btn = new  JButton("ȷ��");    //����JButton��ť
		btn.addActionListener(new ActionListener() {    //��Ӽ����¼�
			
			@Override
			public void actionPerformed(ActionEvent e) {     //���������ķ���
				System.out.println("ѡ�е�����Ϊ��"+comboBox.getSelectedIndex());   //��ȡѡ�е�����
				System.out.println("ѡ�е�ֵΪ��"+comboBox.getSelectedItem());   //��ȡ
				
				System.out.println("------------end-------------");
			}
			
		});
		
		btn.setBounds(160, 30, 100, 30);   //����JButton��ť��λ�úʹ�С
		comboBox.setBounds(30, 30, 100, 30);    //���������б��λ�úʹ�С
		
//		comboBox.setEditable(true);    //�Ƿ���Ա༭��
		a.add(comboBox);    //�������б����ӵ�������
		a.add(btn);    //��JButton��ť��ӵ�������
	}

	public static void main(String[] args) {    //������
		
		JComboBox_ k = new JComboBox_();
		k.setVisible(true);    //���ô���ɼ�

	}

}
