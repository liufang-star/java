package FocusEvent_;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

                               //焦点事件监听器（FocusEvent）！

public class focusLost_focusGained extends JFrame{
	
	public focusLost_focusGained() {
		setTitle("焦点事件监听器（FocusEvent）");
		setBounds(550, 350, 500, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField jt1 = new JTextField(10);
		jt1.setBounds(30, 30, 200, 30);
		contentPane.add(jt1);
		
		JTextField jt2 = new JTextField(10);
		jt2.setBounds(30, 90, 200, 30);
		contentPane.add(jt2);
		
		JTextField jt3 = new JTextField(10);
		jt3.setBounds(30, 150, 200, 30);
		contentPane.add(jt3);
		
		JLabel jl1 = new JLabel("未获得焦点");
		jl1.setBounds(260, 20, 100, 50);
		contentPane.add(jl1);
		
		JLabel jl2 = new JLabel("未获得焦点");
		jl2.setBounds(260, 80, 100, 50);
		contentPane.add(jl2);
		
		JLabel jl3 = new JLabel("未获得焦点");
		jl3.setBounds(260, 140, 100, 50);
		contentPane.add(jl3);
		
		
	}

	public static void main(String[] args) {
		focusLost_focusGained k = new focusLost_focusGained();
		k.setVisible(true);

	}

}
