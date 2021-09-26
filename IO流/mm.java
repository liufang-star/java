package IO流.txt;

                   //压缩文件流！！！“ZipOutputStream” 相当于输出！！！输出流！！！

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class mm {
       
	static void compress() {
		
		File source = new File("");//源文件    C:\Intel
		File target = new File("");//压缩包    D:\\mr.zip
		
		try(FileOutputStream fis = new FileOutputStream(target);
				ZipOutputStream zos = new ZipOutputStream(fis)){
			if(source.isDirectory()) {
				for(File f:source.listFiles()) {   //遍历！！！
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
	 * zos --压缩流
	 * base --文件在压缩包中的路径
	 * source --被压缩的文件
	 * 
	 */
	static void addEntry(ZipOutputStream zos,String base,File source) {
		if(source.isDirectory()) {
			for(File file:source.listFiles()) {    //递归！！！
				addEntry(zos, base+source.getName()+File.separator,file);
			}
		}else {
			byte buf[] = new byte[1024];
			try (FileInputStream fis = new FileInputStream(source)){
				int count = -1;
				//在压缩包中添加新条目
				zos.putNextEntry(new ZipEntry(base + source.getName()));
				while((count = fis.read(buf)) != -1) {
					zos.write(buf, 0, count);
					zos.finish();
				}
				zos.closeEntry();//关闭条目。
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		compress();
	}

}
