

import job.Hero;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero();
		// HeroクラスのsetNameの内容に引っ掛かりエラーになる
		hero.setName("あ");
	}
}
