package chapter13;

import java.util.Scanner;

 public class Welcome {
	/**
	 * ���û��ʺ�
	 */
    String name = null;
	public void sayHello(){
		Scanner input = new Scanner(System.in);
		System.out.print("���ʲô��");
		name = input.next();
		System.out.println(name + ", ��ã�");
	}
	
}
