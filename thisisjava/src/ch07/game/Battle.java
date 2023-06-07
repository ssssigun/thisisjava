package ch07.game;

public class Battle {

	public static void main(String[] args) {
		Character warrior = new Warrior("warrior", 100, 10);
		Character wizard = new Wizard("wizard", 80, 5);
		
		System.out.println("전사 체력 " + warrior.hp);
		System.out.println("마법사 체력 "+ wizard.hp );
		
		randomBattle(warrior,wizard);
		
	}
	
	public static void randomBattle(Character c1,Character c2) {
		
		while(true) {
			int n =(int)(Math.random()*2);
			
			if(n ==0) {
				c1.attack(c2);
			}
			else {
				c2.attack(c1);
			}
			
			if (c1.hp ==0 || c2.hp == 0) {
				System.out.println("게임 오버");
			}
			
		}
	}

}
