package IO��.txt;

               //��ѹ����������ZipInputStream...�൱����������

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class nn {

	static void decompression() {
		@SuppressWarnings("unused")
		File dir = new File("");  //Դ�ļ�
		File source = new File("");  //��ѹ����
		byte buf[] = new byte[1024];  //������
		
		ZipEntry entry = null;
		
		try (FileInputStream fis = new FileInputStream(source);
				ZipInputStream zis = new ZipInputStream(fis)) {
			while(true) {
				entry = zis.getNextEntry();//��ȡһ����Ŀ
				if(entry == null) {
					break;
				}
				if(entry.isDirectory()) {
					continue;
				}
				File f = new File(entry.getName());
				if(!f.getParentFile().exists()) {  //���ѹ�����ļ�������
					f.getParentFile().mkdirs(); //����
				}
				int count = -1;
				FileOutputStream fos = new FileOutputStream(f);
				while((count = zis.read(buf)) != -1) {
					fos.write(buf, 0, count);
					fos.flush();
				}
				fos.close();
				zis.closeEntry();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		decompression();

	}

}
