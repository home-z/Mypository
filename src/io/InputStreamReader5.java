package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * InputStreamReader字符输入流,可以按照指定的字符集读取字符
 * @author Administrator
 *
 */
public class InputStreamReader5 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
 			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			int d = -1;
			while ((d = isr.read()) != -1) {
				System.out.print((char)d);
			}
			isr.close();
		} catch (IOException e) {
			System.out.println("按照指定字符集读取字符失败");
			e.printStackTrace();
		}
	}
}
