package chapter13;

import java.util.Scanner;

 public class Welcome {
	/**
	 * 向用户问好
	 */
    String name = null;
	public void sayHello(){
		Scanner input = new Scanner(System.in);
		System.out.print("你叫什么？");
		name = input.next();
		System.out.println(name + ", 你好！");
	}
	
}
