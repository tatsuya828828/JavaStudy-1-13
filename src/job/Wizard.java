package job;

import weapon.Wand;

public class Wizard {
	// 基本的にはフィールドはprivate、メソッドはpublic
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() +"のHPを"+ recovPoint +"回復した");
	}

	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎます");
		} else {
			this.name = name;
		}
	}

	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖を装備してください");
		} else {
			this.wand = wand;
		}
	}

	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		} else if(hp < 0) {
			this.hp = 0;
		} else {
			throw new IllegalArgumentException("値が不正です");
		}
	}

	public void setMp(int mp) {
		if(mp > 0) {
			this.mp = mp;
		} else {
			throw new IllegalArgumentException("値が不正です");
		}
	}


}
