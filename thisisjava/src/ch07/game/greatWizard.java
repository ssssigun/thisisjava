package ch07.game;

public class greatWizard extends Wizard{

	greatWizard(String name, int hp, int ap) {
		super(name, hp+30, ap+50);
	}

	void attack(Chracter c) {
		System.out.println("대마법사 "+this.name+"가 " );
	}
}
