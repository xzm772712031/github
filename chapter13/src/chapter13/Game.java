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
		System.out.println("��ս������"+count);
		System.out.println(user.getName()+"�÷֣�"+user.getScore());
		System.out.println(computer.getName()+"�÷֣�"+computer.getScore());
		if(user.getScore()>computer.getScore()) {
			System.out.println("��ϲ��");
		}else {
			System.out.println("�´μ���");
		}
	}
	public void startGame() {
		wc.sayHello();
		initial();
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------");
		System.out.println("\t\t******************");
		System.out.println("\t\t**  ��ȭ, ��ʼ    **");
		System.out.println("\t\t******************");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣��� ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			computer.setName("����");
			break;
		case 2:
			computer.setName("��Ȩ");
			break;
		case 3:
			computer.setName("�ܲ�");
			break;
		default:
			break;
		}
		System.out.println("��ѡ����" + computer.getName() + "��ս");
		System.out.println("Ҫ��ʼ�����𣿣�y/n��");
		String flag = input.next();
		if ("y".equals(flag)) {
			int u = 0;
			int c = 0;
			String flag2 = "y";
			do {
				user.showFist();
				computer.showFist();
				if((user.choice()==1&&computer.choice()==2)||(user.choice()==2&&computer.choice()==3)||(user.choice()==3&&computer.choice()==1)) {
					System.out.println("��������");
					u++;	
					computer.setScore(u);				
					count++;
				}else if(user.choice()==computer.choice()) {
					System.out.println("ƽ��");
					count++;
				}else {
					System.out.println("��Ӯ��");
					c++;
					user.setScore(c);					
					count++;
				}
				System.out.println("�Ƿ����(y/n)");
			} while (flag2.equals(input.next()));
			showResult();
		} else {
			System.out.println("����ѡ�����");
			startGame();
		}
	}

}
