// 独自例外クラスを使って例外処理を実装するサンプル
package java_learn.exceptions_and_io;

// CarException クラス: Exception を継承した独自の例外クラス
class CarException extends Exception {
    // デフォルトコンストラクタ（メッセージなし）
}

// 車クラス
class Car {
    private int num; // 車のナンバー
    private double gas; // ガソリン量

    // コンストラクタ: 初期値を設定し、作成メッセージを表示
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    // 車の情報を設定するメソッド
    // ガソリン量がマイナスの場合、CarException を送出する
    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            // 独自例外を作成して送出
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("ナンバー" + num + "ガソリン量"
                    + gas + "の車を作成しました。");
        }
    }

    // 車の情報を表示するメソッド
    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("車のガソリン量は" + gas + "です。");
    }
}

// メインクラス: 独自例外の発生と処理の流れを確認する
class CustomExceptionDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        try {
            // ガソリン量に負の値を設定して例外を発生させる
            car1.setCar(1234, -10.0);
        } catch (CarException e) {
            // 例外が発生した場合の処理
            System.out.println(e + "が送出されました。");
        }
        // setCar が失敗しても、オブジェクトの状態は確認できる
        car1.show();
    }
}