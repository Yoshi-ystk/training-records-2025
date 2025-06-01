// メソッド内から別のメソッドを呼び出す例（showCarがshowを呼び出す）
package java_learn.classes_and_objects;

//車クラス
class Car {
    int num;
    double gas;

    void show() { // メソッド
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }

    void showCar() {
        System.out.println("これから車の情報を表示します。");
        show(); // 「自分自身」のメソッドを意味する
    }
}

class MethodCallingFromMethod {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
    }
}