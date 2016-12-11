package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲输入流bfs 批量读取数据
 * @author Administrator
 *
 */

//复制文件
public class BufferedInputStreamCopy {
	public static void main(String[] args) {
		//缓冲流读写效率高，故使用频率高
		try {
			//高级流套低级流
			//数据源 缓冲字符流(高级流)套字节流(低级流)
			BufferedInputStream bis = new 
					BufferedInputStream(new FileInputStream("伍思凯 - 特别的爱给特别的你.mp3"));
			//目标文件
			BufferedOutputStream bos = new 
					BufferedOutputStream(new FileOutputStream("tebiede...mp3"));
			int d = -1;
			long start = System.currentTimeMillis();
			//读取
			while ((d = bis.read()) != -1) {
				//写入目标
				bos.write(d);
			}
			long end = System.currentTimeMillis();
			System.out.println("数据copy成功,耗时:"+(end-start)+"毫秒");
			bis.close();
			bos.close();
		} catch (IOException e) {
			System.out.println("缓冲区数据写入失败");
			e.printStackTrace();
		}
		
	}
}
