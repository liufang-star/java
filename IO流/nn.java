package IO流.txt;

               //解压缩流！！！ZipInputStream...相当于输入流！

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class nn {

	static void decompression() {
		@SuppressWarnings("unused")
		File dir = new File("");  //源文件
		File source = new File("");  //解压缩包
		byte buf[] = new byte[1024];  //缓冲区
		
		ZipEntry entry = null;
		
		try (FileInputStream fis = new FileInputStream(source);
				ZipInputStream zis = new ZipInputStream(fis)) {
			while(true) {
				entry = zis.getNextEntry();//获取一个条目
				if(entry == null) {
					break;
				}
				if(entry.isDirectory()) {
					continue;
				}
				File f = new File(entry.getName());
				if(!f.getParentFile().exists()) {  //如果压缩的文件不存在
					f.getParentFile().mkdirs(); //创建
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
