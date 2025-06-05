// 同一フォルダ内にクラスを分割して定義・利用する基本的な例
// Car.javaとSplitClassSingleFile.javaを作成し、同じフォルダ内に置いたままで実行します。
package java_learn.packages_and_imports;

// ファイル名: Car.java
// 車を表すシンプルなクラス（パッケージ内にクラスを分割して定義する練習）
class Car {
    private int num;
    private double gas;

    // デフォルトコンストラクタ（初期値の設定）
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    // 車の情報を設定するメソッド
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を"
                + gas + "にしました。");
    }

    // 車の情報を表示するメソッド
    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("車のガソリン量は" + gas + "です。");
    }
}

// ファイル名: SplitClassSingleFile.java
// Carクラスのインスタンスを生成し、動作確認を行うクラス（mainメソッドを含む）
class SplitClassSingleFile {
    public static void main(String[] args) {
        // Carクラスのインスタンスを生成
        Car car1 = new Car();

        // 車の情報を表示（デフォルト値のまま）
        car1.show();
    }
}