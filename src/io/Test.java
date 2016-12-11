package io;
/**
 * finally的面试题
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(
			test(null)+","+
			test("")+","+
			test("0")		
		);
	}	
	public static int test(String str){
		try {
			return str.charAt(0)-'0';
		}catch (NullPointerException e) {
			return 1;
		}catch (Exception e) {
			return 2;
		}finally{
			return 3;
		}
	}
}
