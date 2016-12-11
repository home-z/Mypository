package io;

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 序列化和反序列化:主要用于存储对象状态为另一种通用格式，比如存储为
 * 二进制、xml、json等等，把对象转换成这种格式
 * 就叫序列化，而反序列化通常是从这种格式转换回来。
 * 使用序列化主要是因为跨平台和对象存储的需求，因为网络上只
 * 允许字符串或者二进制格式，而文件需要使用二进制流格式，如果
 * 想把一个内存中的对象存储下来就必须使用序列化转换为xml（字符串）、json（字符串）或二进制（流）
 * @author Administrator
 *
 */
public class ObjectOutputStream7 {
	public static void main(String[] args) {
		Can can = new Can();
		can.setAge(19);
		can.setName("劳伦斯");
		can.setGender("男");
		
		List<String> list = new ArrayList<>();
		list.add("写了一段自序");
		list.add("参加了二战");
		list.add("喜好机车");
		can.setOtherInfo(list);
		System.out.println(can);
		
		try {
			FileOutputStream fos = new FileOutputStream("objectOutputStream.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			/*
			 * OOS提供的写出对象的方法,该方法:
			 * 将给定的对象装换位一组字节后写出.
			 * 
			 * 调用writeObject方法后,首先将can对象
			 * 转换为了一组字节,将对象转换为一组字节
			 * 的过程称为:对象序列化
			 * 
			 * 然后将这组字节通过fos写入到文件中的
			 * 过程称为:持久化
			 */
			oos.writeObject(can);
			System.out.println("写出完成");
			oos.close();
		} catch (IOException e) {
			System.out.println("持久化失败");
			e.printStackTrace();
		}
 	}

}
