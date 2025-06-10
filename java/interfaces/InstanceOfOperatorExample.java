// instanceof演算子でクラス判定を行う
package interfaces;

// 抽象クラスVehicle：共通のフィールドと抽象メソッドを持つ
abstract class Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("速度を" + speed + "にしました。");
    }

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

// メインクラス：Vehicle型の配列にCarとPlaneを代入し、instanceof演算子でクラス判定
class InstanceOfOperatorExample {
    public static void main(String[] args) {
        // Vehicle型の配列を用意（CarやPlaneなどのインスタンスを格納できる）
        Vehicle[] vc;
        // Vehicle型の配列を作成し、CarとPlaneのインスタンスを格納
        vc = new Vehicle[2];
        vc[0] = new Car(1234, 20.5);
        vc[1] = new Plane(232);

        // instanceof演算子を使って、配列内の各オブジェクトがCarのインスタンスかどうかを判定
        // 動的な型チェックにより、多態性を利用していることを確認
        for (int i = 0; i < vc.length; i++) {
            if (vc[i] instanceof Car)
                System.out.println((i + 1)
                        + "番目のオブジェクトはCarクラスです。");
            else
                System.out.println((i + 1)
                        + "番目のオブジェクトはCarクラスではありません。");
        }
    }
}