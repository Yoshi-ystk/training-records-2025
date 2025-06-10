// インターフェースiVehicleをCarとPlaneが実装し、共通のshowメソッドを定義
package interfaces;

// iVehicleインターフェースを定義（共通メソッドshowを持つ）
interface iVehicle {
    void show();
}

// 車クラス：iVehicleを実装し、車の情報を出力する
class Car implements iVehicle {
    private int num;
    private double gas;

    // コンストラクタでナンバーとガソリン量を初期化
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量"
                + gas + "の車を作成しました。");
    }

    // インターフェースのshowメソッドをオーバーライド
    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("車のガソリン量は" + gas + "です。");
    }
}

// 飛行機クラス：iVehicleを実装し、飛行機の情報を出力する
class Plane implements iVehicle {
    private int flight;

    // コンストラクタで便の番号を初期化
    public Plane(int f) {
        flight = f;
        System.out.println("便" + flight + "の飛行機を作成しました。");
    }

    // インターフェースのshowメソッドをオーバーライド
    public void show() {
        System.out.println("飛行機の便は" + flight + "です");
    }
}

// メインクラス：インターフェース型の配列で多態性を実現
class InterfaceImplementationExample {
    public static void main(String[] args) {
        // iVehicle型の配列を用意（CarやPlaneのインスタンスを格納可能）
        iVehicle[] ivc;
        ivc = new iVehicle[2];

        // CarとPlaneのインスタンスを格納
        ivc[0] = new Car(1234, 20.5);
        ivc[1] = new Plane(232);

        // 配列の各要素に対してshowメソッドを呼び出す（多態性）
        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }
    }
}