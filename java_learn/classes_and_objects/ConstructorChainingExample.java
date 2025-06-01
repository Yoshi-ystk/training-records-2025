// this()を使って別のコンストラクタを呼び出すチェイニングの例
package java_learn.classes_and_objects;

//車クラス
class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public Car(int n, double g) {
        this(); // 引数２個のコンストラクタの先頭で、引数のないコンストラクタを呼び出す
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

class ConstructorChainingExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}