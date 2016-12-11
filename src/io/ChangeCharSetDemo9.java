package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 修改文件编码
 * @author Administrator
 *
 */
public class ChangeCharSetDemo9 {

	public static void main(String[] args) {
		try {
			/*
			 * test.txt文件是以UTF-8编码保存的文本数据
			 * 现需要将其转换为GBK编码
			 */
			InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"),"UTF-8");
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("set-gbk.txt"),"GBK");
			int d = -1;
			while ((d = isr.read())!= -1) {
				osw.write(d);
			}
			System.out.println("转码完成");
			isr.close();
			osw.close();
		} catch (IOException e) {
			System.out.println("转码失败");
			e.printStackTrace();
		}
	}

}
