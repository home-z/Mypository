package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {
	public static void main(String[] args) {
		try {
			//追加模式，不会清除目标文件的的原始数据，会在目标文件的末尾写入数据
			FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true);
			String dataLine = "。克晶最美！";
			//getBytes("可指定字符集")
			byte[] data = dataLine.getBytes();
			fileOutputStream.write(data);
			//上面两行代码可以写为 ileOutputStream.write(dataLine.getBytes()); 可提升性能和代码美观性
			System.out.println("追加数据成功");
			fileOutputStream.close();
		} catch (IOException e) {
			System.out.println("追加数据失败");
			e.printStackTrace();
		}
		
	}
}
