package IO��.txt;

                      //�ַ����������������

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ff {

	public static void main(String[] args) {
		File f = new File("word.txt");  
		FileWriter fw = null;  //�ַ������������
		try {
			fw = new FileWriter(f,true);  //��ԭ�ļ��Ļ�����׷�����ݣ�
			
			String str = "���н�����ǿ��Ϣ����������������";
			fw.write(str); //���ַ���д�뵽�ı��ĵ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		FileReader fr = null;   //�ַ�������������
		try {
			fr = new FileReader(f);
			char ch[] = new char[1024]; //������
			int count;  //�Ѷ������ַ���
			try {
				while((count = fr.read(ch)) != -1) {//ѭ����ȡ�ļ��е����ݣ�ֱ�������ַ������꣡
					System.out.println("�ı��ĵ��е�����Ϊ��"+new String(ch,0,count));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
