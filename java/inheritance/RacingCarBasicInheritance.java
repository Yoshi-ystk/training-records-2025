// スーパークラスを継承し、基本的な機能を持つサブクラスを定義する
package inheritance;

//スーパークラスの宣言
class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を"
                + gas + "にしました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

// Carクラスを継承したサブクラス（レーシングカー）
class RacingCar extends Car {
    // 追加するフィールド
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }

    public void setCourse(int c) {
        // 引数の値をcourseに代入（※現在は0に固定されている）
        course = 0;
        System.out.println("コース番号を" + course + "にしました。");
    }
}

class RacingCarBasicInheritance {
    public static void main(String[] args) {
        // RacingCar型の変数を宣言
        RacingCar rccar1;
        // RacingCarのインスタンスを生成（Carの機能も引き継がれる）
        rccar1 = new RacingCar();
        // 継承したメソッドの呼び出し
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
    }
}