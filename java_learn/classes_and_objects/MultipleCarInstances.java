// Carクラスから複数のインスタンスを生成し、それぞれに異なる値を代入して表示するサンプル
package java_learn.classes_and_objects;

//車クラス
class Car {
    int num;
    double gas;
    // Carクラスの宣言(仕様)
}

class MultipleCarInstances {
    public static void main(String[] args) {

        Car car1 = new Car();
        // オブジェクトを作成
        car1.num = 1234;
        car1.gas = 20.5;
        // ナンバーとガソリン量を代入

        Car car2 = new Car();
        // オブジェクトを作成
        car2.num = 2345;
        car2.gas = 30.5;
        // ナンバーとガソリン量を代入

        System.out.println("一号車のナンバーは" + car1.num + "です。");
        System.out.println("ガソリン量は" + car1.gas + "です。");
        System.out.println();
        System.out.println("二号車のナンバーは" + car2.num + "です。");
        System.out.println("ガソリン量は" + car2.gas + "です。");
    }
}