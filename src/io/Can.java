package io;

import java.util.List;
import java.io.Serializable;
/**
 * 该类是用于测试对象流的读写对象操作
 * 若一个类需要被ObjectOutputStream写出
 * 该类必须实现接口Serializable
 * @author Administrator
 *
 */
public class Can  implements Serializable {
	/**
	 * 当一个类实现了序列化接口后,应当定义一个常量
	 * 表示版本号.
	 * 版本号对对象的反序列化结果产生直接影响.
	 * 
	 * 对象在进行序列化时,会将版本号信息也加入到
	 * 字节中.若我们没有定义版本号,对象输出流会
	 * 根据当前类的结构生成一个版本号,只要当前类的
	 * 属性没有发生过结构上的变化,版本号是不变的.
	 * 但是建议将版本号自行定义出来,以便维护.
	 * 
	 * 对象输入流ObjectInputStream在反序列化
	 * 对象时,会检查该对象的版本号与当前类版本号
	 * 是否一致:
	 * 若字节中该对象的版本号与当前类版本号一致,
	 * 反序列化成功.就算类的结构发生了变化,也一样
	 * 可以成功.
	 * 但是若版本号不一致,那么反序列化时会抛出异常.
	 * 
	 * 序列化和反序列化:主要用于存储对象状态为另一种通用格式，比如存储为
	 * 二进制、xml、json等等，把对象转换成这种格式
	 * 就叫序列化，而反序列化通常是从这种格式转换回来。
	 * 使用序列化主要是因为跨平台和对象存储的需求，因为网络上只
	 * 允许字符串或者二进制格式，而文件需要使用二进制流格式，如果
	 * 想把一个内存中的对象存储下来就必须使用序列化转换为xml（字符串）、json（字符串）或二进制（流）
	 */
	private static final Long serialVersionUID = 1L;
	/*
	 * 当前类若想序列化,除了当前类需要实现序列化
	 * 接口外,引用类型的属性都要实现序列化接口.
	 * java API提供的类基本都实现了.例如下面
	 * 使用的String.
	 */
	
	private String name;
	private Integer age;
	private String gender;
	
	/**
	 * transient关键字修饰的属性的作用:
	 * 当前对象在进行序列化时,该属性的值将被忽略.
	 */
	private transient List<String> otherInfo;
	
	public Can(String name, Integer age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public Can() {
		
	}
	
	public Can(String name, Integer age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	
}
