// 2つの引数を受け取るメソッドでCarクラスの情報を一括設定するサンプル
package java_learn.classes_and_objects;

//車クラス
class Car {
    int num;
    double gas;

    // ２つの引数を持つメソッド
    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を"
                + gas + "にしました。");
    }

    void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class MethodWithTwoArguments {
    public static void main(String[] args) {

        Car car1 = new Car();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }
}