// フィールドをprivateにし、publicなメソッドで値の検証と設定を行うカプセル化の例
package java_learn.classes_and_objects;

//車クラス
class Car {
    private int num;
    private double gas;
    // フィールドはプライベートに設定

    public void setNumGas(int n, double g) {
        // メソッドはpublicに設定

        if (g > 0 && g < 1000) {
            // 渡された値を調べて・・・

            num = n;
            gas = g;
            // 正しければ値を設定

            System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
        } else {
            System.out.println(g + "は正しいガソリン量ではありません");
            System.out.println("ガソリン量を変更できませんでした");
            // 誤った値を設定できないようにしている
        }
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class EncapsulationWithValidation {
    public static void main(String[] args) {

        Car car1 = new Car();

        // このようなアクセスはできなくなる
        // car1.num = 12134;
        // car1.gas = -10.0
        // privateメンバにはアクセスできない

        car1.setNumGas(1234, 20.5);
        // 必ずpublicメンバを呼び出して値を設定
        car1.show();

        System.out.println("ただしくないガソリン量(-10.0)を指定してみます・・・。");

        car1.setNumGas(1234, -10.0);
        car1.show();
    }
}