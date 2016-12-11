package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * 当创建PrintWriter时处理的是流(字节字符均可)
 * 就可以创建具有自动行刷新功能.
 * 自动行刷新:每当使用println方法写出字符串时,会
 *          自动flush
 * @author Administrator
 *
 */
public class PrintWriter13 {

	public static void main(String[] args) {
		try {
			/*
			 * 当创建PW时第一个参数为流时,就支持第二个
			 * 参数,该参数是一个boolean值,若为true,
			 * 则PW具有自动行刷新
			 * 
			 * 在没有刷新前，你写入的数据并没有真正写入文件，只
			 * 是保存在内存中。刷新后才会写入文件，如果程序中
			 * 没有调用刷新方法，当程序执行完时会
			 * 自动刷新，也就是只有到数据全部执行完才会一次性写入，大
			 * 数据量时对运行效率有影响。
			 */
			PrintWriter pw = new PrintWriter(new FileOutputStream("pw"+File.separator+ 
					"pw1.txt"),true);
			/*
			 * 具有自动行刷新功能的PW在使用println方法
			 * 写出字符串时会自动进行flush.注意,print
			 * 方法写出字符串不会进行flush.
			 */
			pw.println("山无数，水无数，情无数");
			pw.println("dfjaoiqohnv");
			System.out.println("执行通过");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("写出自动行刷新数据异常");
			e.printStackTrace();
		}
		
	}

}
