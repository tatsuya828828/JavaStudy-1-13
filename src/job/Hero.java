package job;
// クラスにもアクセス制御を設定することができる
// publicを書けば全てのクラスからアクセスを許可
// publicを書かなければ自分と同じパッケージ内のクラスのみアクセスを許可する(非publicクラス)
// 非publicクラスは、他のパッケージからアクセスできない代わりに
// クラス名はソースファイル名と異なっても良い、１つのソースファイルに、複数のクラスの宣言、といったことを許可されている
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
	// メソッドを使えば呼び出すことができるためフィールド値を取り出すためのメソッドを定義
	// これをgetterという
	// public フィールドの型 getフィールド名() といった形で定義する
	public String getName() {
		return this.name;
	}
	// フィールド値に代入するためのメソッド
	// これをsetterという
	// public void setフィールド名(フィールドの型　変数名) といった形で定義する
	// public void setName(String name) {
	// 	this.name = name;
	// }
	// setterやgetterを用いることでReadOnlyやWriteOnlyなフィールドを作ることができる
	// またフィールド名を変えたときにも修正の手間が圧倒的に少ない
	// ↓ のように、アクセスを検査することもできる
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		} else if(name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		} else if(name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		} else {
			this.name = name;
		}
	}
}
