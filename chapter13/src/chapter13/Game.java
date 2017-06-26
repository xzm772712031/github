package chapter13;

import java.util.Scanner;
public class Game {
	User user = new User();
	Computer computer = new Computer();
	Welcome wc = new Welcome();
	public int count = 0;
	public void initial() {
		User user = new User();
		Computer computer = new Computer();	
	}
	public void showResult() {	
		user.setName(wc.name);
		System.out.println(computer.getName()+"vs"+user.getName());
		System.out.println("对战次数："+count);
		System.out.println(user.getName()+"得分："+user.getScore());
		System.out.println(computer.getName()+"得分："+computer.getScore());
		if(user.getScore()>computer.getScore()) {
			System.out.println("恭喜你");
		}else {
			System.out.println("下次加油");
		}
	}
	public void startGame() {
		wc.sayHello();
		initial();
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------");
		System.out.println("\t\t******************");
		System.out.println("\t\t**  猜拳, 开始    **");
		System.out.println("\t\t******************");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）： ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			computer.setName("刘备");
			break;
		case 2:
			computer.setName("孙权");
			break;
		case 3:
			computer.setName("曹操");
			break;
		default:
			break;
		}
		System.out.println("你选择了" + computer.getName() + "对战");
		System.out.println("要开始比赛吗？（y/n）");
		String flag = input.next();
		if ("y".equals(flag)) {
			int u = 0;
			int c = 0;
			String flag2 = "y";
			do {
				user.showFist();
				computer.showFist();
				if((user.choice()==1&&computer.choice()==2)||(user.choice()==2&&computer.choice()==3)||(user.choice()==3&&computer.choice()==1)) {
					System.out.println("你输了了");
					u++;	
					computer.setScore(u);				
					count++;
				}else if(user.choice()==computer.choice()) {
					System.out.println("平局");
					count++;
				}else {
					System.out.println("你赢了");
					c++;
					user.setScore(c);					
					count++;
				}
				System.out.println("是否继续(y/n)");
			} while (flag2.equals(input.next()));
			showResult();
		} else {
			System.out.println("重新选择对手");
			startGame();
		}
	}

}
