package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

                               //压缩文件（ZipOutputStream）！“输出流”

public class ZipOutputStream_ {
	
	static void compress() {      //创建一个静态的压缩方法！
		
		//创建实例对象
		File source = new File("");     //源文件（source）    //源文件路径
		File target = new File("");     //压缩包（target）    //压缩包之后的路径
		
		//创建输出流和压缩流
		try(FileOutputStream fis = new FileOutputStream(target);
				ZipOutputStream zos = new ZipOutputStream(fis)){
			
			if(source.isDirectory()) { 
				
				//因为是文件夹，所以需要遍历所有文件
				for(File f : source.listFiles()) {
					
					addEntry(zos, "", f);
					
				}
				
			}else {
				addEntry(zos, "", source);
			}
			
		}
		catch(Exception e){
           e.printStackTrace();			
		}
		
	}
	
	/**
	 * 
	 * @param zos--压缩流
	 * @param base--文件在压缩包中的路径
	 * @param source--被压缩的文件
	 */
	//创建条目（判断是否为文件夹，如果是，做递归操作）！
	static void addEntry(ZipOutputStream zos,String base,File source) {
		
		if(source.isDirectory()) {
		
		for(File file : source.listFiles()) {
			addEntry(zos, base+source.getName() +File.separator, file);
		}
		
		}else {
			byte buf[] = new byte[1024];
			try(FileInputStream fis = new FileInputStream(source)) {
				
				int count = -1;
				
				//在压缩包当中添加新条目
				zos.putNextEntry(new ZipEntry(base+source.getName()));
				
				while((count = fis.read(buf)) != -1) {
					
					zos.write(buf,0,count);      
					
					zos.flush();     //刷新！
				}
				
				zos.closeEntry();     //关闭条目！
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		compress();

	}

}
