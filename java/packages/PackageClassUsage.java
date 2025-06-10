// パッケージ機能の基本利用：同一パッケージ内にあるクラスを使用する例
package packages; // ※GitHub構成に合わせてこのパッケージ名を使用

// 本来は「pa」パッケージとして構成されるサンプルですが、
// GitHubリポジトリ構成に合わせて、パッケージ名を変更しています。


// Carクラス：ナンバーとガソリン量を保持するシンプルな車クラス
class Car{
	private int num;
	private double gas;
	
    // デフォルトコンストラクタ
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}

    // フィールドに値を設定する
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を"
			+ gas + "にしました。");
	}

    // 情報を表示する
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("車のガソリン量は" + gas + "です。");
	}
}

// Carクラスを利用するクラス（エントリポイント）
public class PackageClassUsage {
    public static void main(String[] args){
        // 同一パッケージ内にあるCarクラスを使用
		Car car1 = new Car();
		car1.show();
	}
}