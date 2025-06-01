// 引数の型や数の違いによるメソッドのオーバーロードを示すサンプル
package java_learn.classes_and_objects;

//車クラス
class Car {
    private int num;
    private double gas;

    public void setCar(int n) {
        // int型の引数を持つメソッド
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }

    public void setCar(double g) {
        // double型の引数を持つメソッド
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました。");
    }

    public void setCar(int n, double g) {
        // 2個の引数を持つメソッド
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class MethodOverloadExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setCar(1234, 20.5);
        // ２個の引数を持つメソッドが呼び出される
        car1.show();

        System.out.println("車のナンバーだけ変更します。");
        car1.setCar(2345);
        // int型の引数をもつメソッドが呼び出される
        car1.show();

        System.out.println("ガソリン量だけ変更します。");
        car1.setCar(30.5);
        // double型の引数をもつメソッドが呼び出される
        car1.show();
    }
}
