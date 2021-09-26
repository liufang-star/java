package IO��.txt;

                   //ѹ���ļ�����������ZipOutputStream�� �൱����������������������

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class mm {
       
	static void compress() {
		
		File source = new File("");//Դ�ļ�    C:\Intel
		File target = new File("");//ѹ����    D:\\mr.zip
		
		try(FileOutputStream fis = new FileOutputStream(target);
				ZipOutputStream zos = new ZipOutputStream(fis)){
			if(source.isDirectory()) {
				for(File f:source.listFiles()) {   //����������
					addEntry(zos, "", f);
				}
			}else {
				addEntry(zos, "", source);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * zos --ѹ����
	 * base --�ļ���ѹ�����е�·��
	 * source --��ѹ�����ļ�
	 * 
	 */
	static void addEntry(ZipOutputStream zos,String base,File source) {
		if(source.isDirectory()) {
			for(File file:source.listFiles()) {    //�ݹ飡����
				addEntry(zos, base+source.getName()+File.separator,file);
			}
		}else {
			byte buf[] = new byte[1024];
			try (FileInputStream fis = new FileInputStream(source)){
				int count = -1;
				//��ѹ�������������Ŀ
				zos.putNextEntry(new ZipEntry(base + source.getName()));
				while((count = fis.read(buf)) != -1) {
					zos.write(buf, 0, count);
					zos.finish();
				}
				zos.closeEntry();//�ر���Ŀ��
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		compress();
	}

}
