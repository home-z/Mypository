package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 字符流
 * 字符流读写数据的单位是字符.但是底层依然是读写字节
 * 所以字符流都是高级流,使用它们可以方便读写文本数据.
 * 
 * OutputStreamWriter
 * 该字符输出流的特点是可以按照指定的字符集写出字符
 * @author Administrator
 *
 */
public class OutputStreamWriter6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("outputStreamWriter.txt");
			/*
			 * 默认创建的字符输出流是按照当前系统默认
			 * 字符集将写出的字符串转换为对应的字节.
			 * 
			 * 也可以按照指定的字符集写出字符串 new OutputStreamWriter(fos,"UTF-8");
			 */
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			osw.write("..以星辰书写我志在天空,誓为你真自由..。字符流，照指定字符集写出字符");
			System.out.println("写出完毕");
			osw.close();
		} catch (IOException e) {
			System.out.println("按照指定字符集写出字符失败");
			e.printStackTrace();
		}
	}
}
