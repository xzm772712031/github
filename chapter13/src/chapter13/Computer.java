package chapter13;

public class Computer {
	private String name = null ;
	private int score = 0;
	private int choice ;
	public Computer(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Computer() {
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
		choice  = (int) ((Math.random()*3)+1);
		switch (choice) {
		case 1:
			System.out.println(this.name+"��ȭ������");
			break;
        case 2:
        	System.out.println(this.name+"��ȭ��ʯͷ");
			break;
        case 3:
        	System.out.println(this.name+"��ȭ����");
	    break;
		default:
			break;
		}
		return choice;} 	
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
	return choice;} 	



}
