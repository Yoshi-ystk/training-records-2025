// サブクラスでスーパークラスのメソッドをオーバーライドして出力を変更する
package inheritance;

//車クラス
class Car {
    protected int num;
    protected double gas;

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

    // スーパークラスのshow()メソッド
    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

// レーシングカークラス
class RacingCar extends Car {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("コース番号を" + course + "にしました。");
    }

    // サブクラスのshow()メソッド
    public void Show() {
        System.out.println("レーシングカーのナンバーは" + num +
                "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("コース番号は" + course + "です。");
    }
}

class OverrideShowMethod {
    public static void main(String[] args) {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
        rccar1.show();
    }
}