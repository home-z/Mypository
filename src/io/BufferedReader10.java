package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流,可以按行读取字符串
 * @author Administrator
 *
 */
public class BufferedReader10 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream( 
					"src"+File.separator+"io"+File.separator+"Can.java")));
			/*
			 * BufferedReader提供方法:
			 * String readLine()
			 * 该方法会连续读取若干字节,直到读取到换行符
			 * 为止,然后将换行符之前的所有字符组成一个
			 * 字符串后返回,但是返回的字符串中不含有最后
			 * 的换行符.当读取到文件末尾,返回值为NULL.
			 */
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("整行读取文件失败");
			e.printStackTrace();
		}
	}
}
