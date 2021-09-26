package JComboBox_JList;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

                                                                //�б�������JList����

public class JList_  extends JFrame{
	
	public JList_() {    //���췽��
		
		setTitle("�б�����JList");    //���ô������
		setBounds(550, 350, 500, 400);     //���ô���λ�úʹ�С
		setDefaultCloseOperation(EXIT_ON_CLOSE);    //���ô���رշ�ʽ
		
		Container a = getContentPane();     //��������
		a.setLayout(null);      //���������ò��֣����Բ��֣�null������
		
		String[] items = {"Ԫ��1","Ԫ��2","Ԫ��3","Ԫ��4","Ԫ��5","Ԫ��6","Ԫ��7","Ԫ��8"};   //����һ�������б�
		
		//ʹ��JList�๹�췽�������б�򣨵�һ�ַ�������
//		JList<String> jl = new JList<>(items);
		
		
		//ʹ��DefaultComboBoxModelģ������б�򣨵ڶ��ַ��������ŵ㣺�������Ԫ�أ�
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();   //�����б�������ģ��
		for(String tmp : items) {     //���������б�
			
			model.addElement(tmp);   //������ģ�����Ԫ��
			
		}
		JList<String> jl = new JList<>();
		model.addElement("���Ԫ��");    //����ģ�������Ԫ�أ�
		jl.setModel(model);    //�б����������ģ��
		
		
		/*
		 * ����ѡ��ģʽ��������ʽ��
		 *          ��1��SINGLE_SELECTION����ѡ��
		 *          ��2��SINGLE_INTERVAL_SELECTION��ֻ������ѡ�����ڵ�Ԫ�ء�
		 *          ��3��MULTIPLE_INTERVAL_SELECTION�����ѡ����ѡ��
		 */
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);  //����ѡ��ģʽ
		JScrollPane js = new JScrollPane(jl);    //����һ��������壨JScrollPane�ࣩ��
		jl.setFont(new Font("����", Font.BOLD, 20));    //���б�Ԫ���е�������������ʹ�С
		js.setBounds(50, 50, 110, 150);     //���ù�������λ�úʹ�С
		a.add(js);   //�����������ӵ�������
		
		JButton btn = new JButton("ȷ��");     //����JButton��ť
		btn.setBounds(180, 80, 80, 30);    //��JButton��ť����λ�úʹ�С
		btn.addActionListener(new ActionListener() {     //����¼�����
			
			@Override
			public void actionPerformed(ActionEvent e) {     //���������ķ���
				
				//��ȡ�б����ѡ�е�����Ԫ�ء�
				java.util.List<String> values = jl.getSelectedValuesList();
				
				for(String tmp : values) {     //�������
					System.out.println(tmp);
				}
				System.out.println("-----------------end------------------");
			}
		});
		
		a.add(btn);    //��JButton��ť��ӵ�������
	}

	public static void main(String[] args) {     //������
		JList_ k = new JList_();     //����k�Ķ���
		k.setVisible(true);    //���ô���ɼ�

	}

}
