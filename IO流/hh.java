package IO��.txt;

                         //�����ֽ������������

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class hh {

	public static void main(String[] args) {
		File f = new File("word2.txt");
		FileOutputStream out = null;
		BufferedOutputStream bo = null;
		try {
			out = new FileOutputStream(f);
			bo = new BufferedOutputStream(out);  //��װ�ļ������
			String str = "�����Ҳı����ã�ǧ��ɢ����������";
			byte b[] = str.getBytes();
			bo.write(b);
			//ʹ�û����ֽ������ʱ��Ҫ�����ˢ�²�����
			bo.flush();  //ˢ�¡�ǿ�ƽ�����������д���ļ��У���ʹ������û��д����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bo != null) {
				try {
					bo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
