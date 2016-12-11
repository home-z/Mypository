package io;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * java.io.FileInputStream
 * 文件字节输入流
 * 一个低级流,作用是从文件中读取字节数据
 * @author Administrator
 *
 */
public class FileInputStream3 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("test.txt");
			byte[] data = new byte[100];
			int len = fileInputStream.read(data);
			//从指定文件的自定义位置(无特殊情况皆从0开始)开始读取数据到指定字节长度为止的数据
			String str = new String(data, 0, len,"UTF-8");
			System.out.println("取出数据:"+str);
			fileInputStream.close();
		} catch (IOException e) {
			System.out.println("读取文件数据出错！");
			e.printStackTrace();
		}
	}
}
