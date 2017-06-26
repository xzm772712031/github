package chapter13;

import java.util.Scanner;

public class User {
	private String name = null;
	private int score = 0 ;
	private int choice ;
	public User(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int showFist() {
		Scanner input = new Scanner(System.in);
		System.out.println("请出拳：1，剪刀2.石头3.布");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("你出拳：剪刀");
			break;
        case 2:
        	System.out.println("你出拳：石头");
			break;
        case 3:
        	System.out.println("出拳：布");
	    break;
		default:
			break;
		}
		return choice;
		} 
	public int choice() {
		
		switch (choice) {
		case 1:	
			break;
        case 2:	
			break;
        case 3:
	    break;
		default:
			break;
		}
		return choice;
		} 
	
}
