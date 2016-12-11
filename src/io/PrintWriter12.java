package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriter12 {
/**
 * 
 * PrintWriter可以直接处理字节流,也可以处理字符流
 * 但是,直接处理字节流是时不能指定字符集!
 * @param args
 */
	public static void main(String[] args) {
		//直接处理字节流不能指定字符集,只能用系统默认
//		PrintWriter pw 
//			= new PrintWriter(fos);
		
		//中间添加一层OSW可以指定字符集了
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new 
					FileOutputStream("pw"+File.separator+"pw.txt",true),"UTF-8"));
			pw.println("\r\n--《智慧七柱》");
			pw.close();
		} catch (IOException e) {
			System.out.println("按字节读取文件失败");
			e.printStackTrace();
		}
		
	}

}
