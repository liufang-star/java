package IO��.txt;

                         //�����ַ������������
         
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ii {

	public static void main(String[] args) {
		File f = new File("word3.txt");
		FileWriter fw = null; 
        BufferedWriter bw =null;
        try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw); //���ļ��ַ��������װ�ɻ����ַ���
			String str1 = "������ô�󣡣�";
			String str2 = "����ȥ����������";
			bw.write(str1);  //��һ������
			bw.newLine();  //����һ������
			bw.write(str2);  //�ڶ�������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//Ҫע�����Ĺر�˳���ȴ����ĺ�رա�
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
