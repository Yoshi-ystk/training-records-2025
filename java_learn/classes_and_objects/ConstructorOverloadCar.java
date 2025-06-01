// 引数の有無で異なるコンストラクタを使い分けるオーバーロードの例
package java_learn.classes_and_objects;

//車クラス//
class Car {
    private int num;
    private double gas;

    public Car() { // 引数のないコンストラクタ
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public Car(int n, double g) { // 引数を２個もつコンストラクタ
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class ConstructorOverloadCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}