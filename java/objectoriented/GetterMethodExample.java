package objectoriented;

//車クラス
class Car {
    int num;
    double gas;

    int getNum() {
        // int型の値を返すメソッド

        System.out.println("ナンバーを調べました。");
        return num;
        // 呼び出し元に値を返す
    }

    double getGas() {
        System.out.println("ガソリン量を調べました。");
        return gas;
    }

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

class GetterMethodExample {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setNumGas(1234, 20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();
        // get***で戻り値をもつメソッドを呼び出す
        // 戻り値を変数number・gasolineに代入

        System.out.println("サンプルから車を調べたところ");
        System.out.println("ナンバーは" + number + "ガソリン量は"
                + gasoline + "でした。");
        car1.show();
    }
}
