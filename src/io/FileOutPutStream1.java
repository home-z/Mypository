package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * io概念，输入流：从外界获取数据到程序代码中处理，
 * 		    输出流：从程序中向外界文件写入数据。输入和输出的参考关系是程序代码本身，而不是文件
 * @author Administrator
 *
 */
public class FileOutPutStream1 {
	public static void main(String[] args) {
		try {
			/**
			 * java.io.FileOutputStream
			 * 文件字节输出流,是一个低级流,负责向文件中写出数据
			 * 同时（可以）创建一个文件
			 * 不同与RadomAccessFile，输出流不是居于指针操作的，因此只能顺序的读取数据，前者基于指针可从随意位置操作
			 * 写入的新数据会替换的文件中原有的数据(即删除原有数据),追加写模式可避免此现象，
			 * 即调用不同的构造器nwe fos(file,true)
			 */
			FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
			String io = "黑夜里哈里的一点英雄形象..";
			byte[] data = io.getBytes("UTF-8");
			fileOutputStream.write(data);
			System.out.println("写入完成");
			fileOutputStream.close();
		} catch (IOException e) {
			System.out.println("文件异常！");
			e.printStackTrace();
		}
		
	}
}
