package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

                            //�ļ��ַ��������������FileOutWriter��FileInputReader��

public class FileWriter_FileReader {

	public static void main(String[] args) {
		
		File f = new File("src\\kk.txt");     //�����ı��ĵ�
		
			FileWriter fw = null;       //�ļ��ַ���������д�����ݣ�
			
			try {
				fw = new FileWriter(f,false);     //���ı��ĵ����ݺ�׷������
				String str = "��ǿ��Ϣ��������";      //���ı��ĵ����������
				fw.write(str);      //д�뵽�ı���
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				if(fw != null) {
					try {
						
						fw.close();      //�رղ���
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			FileReader fr = null;
			try {
				fr = new FileReader(f);
				char ch[] = new char[1024];    //������
				int count;     //�Ѿ��������ַ���
				try { 
					
					while((count = fr.read(ch)) != -1) {    //ѭ����ȡ�ļ��е����ݣ�ֱ�������ַ������꣡
						
						//��ȡ�ı��ĵ��е����ݣ���0��count��
						System.out.println("�ı��ĵ��е�����Ϊ��"+new String(ch,0,count));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(fr != null) {
					try {
						
						fr.close();      //�رղ���
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		

	}

}
