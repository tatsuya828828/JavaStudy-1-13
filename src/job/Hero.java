package job;

public class Hero {
	// アクセス修飾詞:privateをつけることでクラス内のみアクセスを許可する
	// このようにすることで誤った値が代入されることを防げる
	private int hp;
	private String name;
	// 全てのアクセスを許可
	public void attack() {
		System.out.println("攻撃をした！");
	}
	// 同じパッケージ内のアクセスを許可
	void sleep() {
		// 同じクラスのメソッド内であれば呼び出すことができる
		this.hp = 100;
		System.out.println(this.name +"は、眠って回復した");
	}

	// 無闇に呼び出されないように外部からの呼び出しを制限
	private void die() {
		System.out.println(this.name +"は、死んでしまった");
		System.out.println("GAME OVER");
	}
}
