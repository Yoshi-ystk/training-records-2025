// Carクラスに定義したメソッドを複数回呼び出して実行するサンプル
package java_learn.classes_and_objects;

//車クラス
class Car {
    int num;
    double gas;

    void show() {
        // ここからメソッドの定義を行う
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class MethodCallExample {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = 20.5;

        // メソッドを２回呼び出してみる
        car1.show();
        car1.show();
    }
}