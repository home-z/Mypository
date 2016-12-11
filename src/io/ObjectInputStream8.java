package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * java.io.ObjectInputStream
 * 对象输入流,是一个高级流,可以读取一组字节
 * 然后将其还原为对象.
 * 读取的字节应当是由ObjectOutputStream将对象
 * 转换的.
 * @author Administrator
 *
 */
public class ObjectInputStream8 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("objectOutputStream.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			/*
			 * 将一组字节还原回对象的过程称为:
			 * 对象反序列化
			 */
			Can can = (Can)ois.readObject();
			System.out.println(can);
			System.out.println("反序列化完成");
			ois.close();
		} catch (IOException e) {
			System.err.println("反序列化失败");
			e.printStackTrace();
		}

	}
}
