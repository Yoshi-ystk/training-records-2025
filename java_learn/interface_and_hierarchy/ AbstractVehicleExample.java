// 抽象クラスの基本的な使い方と多態性の例
package java_learn.interface_and_hierarchy;

// 抽象クラスVehicle：共通のフィールドと抽象メソッドを持つ
abstract class Vehicle {
    protected int speed;

    // 共通のメソッド：速度を設定する
    public void setSpeed(int s) {
        speed = s;
        System.out.println("速度を" + speed + "にしました。");
    }

    // サブクラスで実装される抽象メソッド
    abstract void show();
}

// 車クラス：Vehicleを継承し、showメソッドを実装
class Car extends Vehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量"
                + gas + "の車を作成しました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("速度は" + speed + "です。");
    }
}

// 飛行機クラス：Vehicleを継承し、showメソッドを実装
class Plane extends Vehicle {
    private int flight;

    public Plane(int f) {
        flight = f;
        System.out.println("便" + flight + "の飛行機を作成しました。");
    }

    public void show() {
        System.out.println("飛行機の便は" + flight + "です");
        System.out.println("速度は" + speed + "です。");
    }
}

// メインクラス：Vehicle型の配列にCarとPlaneを代入し、多態性を確認
class AbstractVehicleExample {
    public static void main(String[] args) {
        // Vehicle型の配列を用意
        Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        // 各要素に対してshowメソッドを呼び出し、多態性の動作を確認
        for (int i = 0; i < vc.length; i++) {
            vc[i].show();
        }
    }
}