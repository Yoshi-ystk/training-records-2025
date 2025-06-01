// 引数を使ってCarクラスのメンバ変数を設定するメソッドのサンプル
package java_learn.classes_and_objects;

//車クラス

class Car {
    int num;
    double gas;

    // 引数を持つメソッド
    void setNum(int n) // 値を受け取る仮引数
    {
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }

    void setGas(double g) {
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました。");
    }

    void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        // 引数をもたないメソッド//
    }
}

class MethodWithArguments {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
        // 実引数として1234などを渡して呼び出す
    }
}