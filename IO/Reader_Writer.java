package IO;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Reader_Writer extends JFrame{     //创建类，继承JFrame类。
	
//  public Reader_Writer() {
//	  setBounds(550, 350, 500, 400);
//	  setVisible(true);
//  }
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jContenPane = null;       //创建面板对象
	private JTextArea jTextArea = null;    //创建文本域对象
	private JPanel contenPane = null;    //创建面板对象
	private JButton openButton = null;     //创建按钮对象
	private JButton closeButton = null;     //创建按钮对象
	
	private JButton getOpenButton() {
		if(openButton == null) {
			openButton = new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File("src/kk.txt");
					try {
						FileWriter out = new FileWriter(file);      //创建FileWriter对象
						String s = jTextArea.getText();        //获取文本域中的文本
						out.write(s);
						out.close();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
				}
			});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if(closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File("src/kk.txt");
					try {
						FileReader in = new FileReader(file);
						char byt[] = new char[1024];
						int len = in.read(byt);
						jTextArea.setText(new String(byt,0,len));
						in.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					
				}
			});
		}
		return closeButton;
		
	}
	
	public Reader_Writer() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getContentPane());
		this.setTitle("JFrame");
	}
	
	private JPanel getJCntenPane() {
		if(jContenPane == null) {
			jContenPane = new JPanel();
			jContenPane.setLayout(new BorderLayout());
			jContenPane.add(getJTextArea(),BorderLayout.CENTER);
			jContenPane.add(getContentPane(),BorderLayout.SOUTH);
		}
		return jContenPane;
	}
	


	private Component getJTextArea() {
		
		return null;
	}

	public static void main(String[] args) {
		Reader_Writer thisClass = new Reader_Writer();
		thisClass.setDefaultCloseOperation(EXIT_ON_CLOSE);
		thisClass.setVisible(true);
		

	}

}
