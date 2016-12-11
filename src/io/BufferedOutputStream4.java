package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream4 {
	public static void main(String[] args) {
		try {
			//低级输出流FOS
			FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
			//高级流缓冲流BOS 包装了低级流
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write("这是缓冲输出流的最近及到图片的本及到图片的本及到图片".getBytes());
			System.out.println("缓存输出流执行成功");
			//void flush() 强制/立即执行缓冲流中的数据写入到文件中，缓冲区将被清空
//			bufferedOutputStream.flush();
			//关闭流之前，缓冲区中的内容将被一次性写出
			bufferedOutputStream.close();
		} catch (IOException e) {
			System.out.println("缓存流写入失败");
			e.printStackTrace();
		}
		
	}
}
