// Carクラスのインスタンスを生成し、メンバ変数に値を代入して出力する基本のサンプル
package java_learn.classes_and_objects;

//車クラス
class Car {
    int num;
    double gas;
    // Carクラスの宣言(仕様)
}

class BasicClassInstance {
    public static void main(String[] args) {

        Car car1 = new Car();
        // オブジェクトを作成

        car1.num = 1234;
        car1.gas = 20.5;
        // ナンバーとガソリン量を代入

        System.out.println("車のナンバーは" + car1.num + "です。");
        System.out.println("ガソリン量は" + car1.gas + "です。");
    }
}