// クラス型の変数にオブジェクト参照を代入する例
package java_learn.class_libraries_and_wrappers;

class Car {

	private int num;
	private double gas;

	public Car() {
		// フィールドの初期化
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}

	public void setCar(int n, double g) {
		// フィールドに値をセットするメソッド
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を"
				+ gas + "にしました。");
	}

	public void show() {
		// 現在の情報を表示
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class ReferenceAssignment {
	public static void main(String[] args) {
		// car1という参照型変数を宣言
		Car car1;
		System.out.println("car1を宣言しました。");
		car1 = new Car();
		car1.setCar(1234, 20.5);

		// car2という別の参照型変数を宣言
		Car car2;
		System.out.println("car2を宣言しました。");

		// car2にcar1の参照（アドレス）を代入
		car2 = car1;
		System.out.println("car2にcar1を代入しました。");

		// 両方の参照が同じオブジェクトを指していることを確認する
		System.out.println("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
	}
}