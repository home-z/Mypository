package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
	public static void main(String[] args) {
		try {
			//使用文件流实现文件复制，缓冲流没有参加
			FileInputStream origin = new 
					FileInputStream("Iceberg_in_North_Star_Bay,_Greenland.jpg");
			FileOutputStream target = new FileOutputStream("wiki2.jpg");
			//8b=1B//8位等于一字节（即 00000000）
			// 一个byte类型的数据为1个字节   1024不就是1KB 1024*1024为1MB
			//内存分配为1024的整数倍将不会内存碎片
			//文件流一次读取1M的数据存入文件输出流，若有缓冲流的包装，会一次性的将缓冲区的数据写入缓冲输出流，效率高
			byte[] data = new byte[1024*1024];
			int leng = -1;
			while ((leng = origin.read(data)) != -1) {
				target.write(data,0,leng);
			}
			System.out.println("图片复制成功");
			origin.close();
			target.close();
		} catch (IOException e) {
			System.out.println("复制图片失败");
			e.printStackTrace();
		}
		
	}
}
