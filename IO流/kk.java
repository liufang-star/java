package IO��.txt;

                       //�����ַ�������������

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class kk {

	public static void main(String[] args) {
		 File f = new File("word3.txt");
		 FileReader fr = null;
		 BufferedReader br =null;
		 try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);//���ļ��ַ���������װ�ɻ����ַ�������
			String tmp = null;
			int i =1; //������
			while((tmp = br.readLine()) != null) {  //ѭ����ȡ�ļ��е����ݣ�
				System.out.println("��"+i+"�У�"+tmp);
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
