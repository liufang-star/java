package IO��.txt;

                        //�ֽ����������������

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ee {

	public static void main(String[] args) {
		File f = new File("word.txt");//�ֽ������������
		FileOutputStream out = null;
        try {
			out = new FileOutputStream(f,false);//�ļ��������true��ʾ���ļ���ĩβ׷�����ݣ�
			String str = "�������ɼ���賿�ĵ��������";
			byte b[] = str.getBytes();//�ַ���ת�����ֽ�����
			try {
				out.write(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
        
        FileInputStream in = null; //�ֽ�������!!!
        try {
			in = new FileInputStream(f);//���������ļ�
			byte b2[] = new byte[100];//������,һ�����������ֽڣ���
			
		try {
					in.read(b2);
					System.out.println("�ļ��е������ǣ�"+new String(b2));
		} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
