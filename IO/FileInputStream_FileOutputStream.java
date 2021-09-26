package IO;

                        //�ļ��ֽ��������������FileOutstream��FileInputStream��

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_FileOutputStream {

	public static void main(String[] args) {
		
		File f = new File("src\\liufang.txt");      //�����ı��ĵ�
		FileOutputStream out = null;      //�ļ��ֽ������
		
		try {
			out = new FileOutputStream(f,false);     //�ļ��������true��ʾ���ļ���ĩβ׷������
			String str = "�������ɼ���賿�ĵ��������";     //���ı����������
			byte b[] = str.getBytes();     //�ַ���ת��Ϊ�ֽ�����
			try {
			out.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(out != null) {      //�ж�out�Ƿ�Ϊ��
				try {
					out.close();     //�رղ���
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		FileInputStream in = null;       //�ļ��ֽ�������
		try {
			in = new FileInputStream(f);      //���������ļ�
			byte b2[] = new byte[1024];    //������
			int len = in.read(b2);
			System.out.println("�ļ��е������ǣ�"+new String(b2,0,len));     //0��len��ʾ��0��ʼ�������һ���ַ���
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			if(in != null) {     //�ж�in�Ƿ�Ϊ��
				try {
					in.close();      //�رղ���
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	

	}

}
