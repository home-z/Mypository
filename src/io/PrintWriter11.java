package io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  java.io.PrintWriter
 * 缓冲字符输出流
 * 特点:可以按行写出字符串.并且带有自动行刷新功能
 * 通常创建PrintWriter时,其内部会自行创建一个
 * 高级流BufferedWriter作为缓冲功能.
 * 
 * java.io.BufferedWriter
 * 缓冲字符输出流
 * @author Administrator
 *
 */
public class PrintWriter11 {
	public static void main(String[] args) {
		try {
			/*
			 * 针对文件写出操作的构造方法:
			 * PrintWriter(File file)
			 * PrintWriter(String path)
			 */
			PrintWriter pw = new PrintWriter("pw"+File.separator+"pw.txt","UTF-8");
			pw.println("新建了目录pw其中文件pw.txt");
			pw.println("我爱你，所以我才领此波涛人马在手中，"+"\r\n"
						+"以星辰书写我志在天空，"+"\r\n"
						+"誓为你争自由：那七柱之宝屋，"+"\r\n"
						+"当我到临，"+"\r\n"
						+"你的明眸也将为我晶莹泪涌。"+"\r\n"
						+"死神沿路对我唯唯诺诺，直到目标就在前头"+"\r\n"
						+"并看到你在鹄候："+"\r\n"
						+"你展颜微笑，令他伤心嫉妒不再对我称臣俯首"+"\r\n"
						+"并欺前将你掳走："+"\r\n"
						+"囚入他死寂的冥幽。"+"\r\n"
						+"爱，旅途疲惫，摸索着寻你的躯壳，"+"\r\n"
						+"这是我们的报酬，只有片刻，"+"\r\n"
						+"在大地以柔软的手对你的形貌探索、"+"\r\n"
						+"盲目的蛆也借着你的骸体长胖之前，"+"\r\n"
						+"暂时是我们的。"+"\r\n"
						+"人们祈求我将我们的成果，那座神圣的华宅，"+"\r\n"
						+"当作对你的缅怀。"+"\r\n"
						+"但我将它拆碎，重建适合你的纪念堂，尚未完成：现在"+"\r\n"
						+"那些卑琐的东西爬出来"+"\r\n"
						+"在你的礼物残缺不全的影子中，"+"\r\n"
						+"替他们自己拼凑陋室。");
			System.out.println("写出完成");
			pw.close();
		} catch (IOException e) {
			System.out.println("按行写出文本数据出错");
			e.printStackTrace();
		}
	}

}
