// 車クラスに「乗り物の情報」と「材質の情報」を与える2つのインターフェースの実装例
package interfaces;

// iVehicleインターフェースを定義（共通メソッドvShowを持つ）
// 「乗り物としての情報」を出力するインターフェース
interface iVehicle {
    void vShow();
}

// 材料インターフェースを定義
// 「物体としての材質情報」を出力するインターフェース
interface iMaterial {
    void mShow();
}

// 車クラス：iVehicleとiMaterialの両方を実装
// ＝「乗り物の情報」と「材質の情報」の両方を出力可能なクラス
class Car implements iVehicle, iMaterial {
    private int num; // 車のナンバー
    private double gas; // ガソリン量

    // コンストラクタでナンバーとガソリン量を初期化
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量"
                + gas + "の車を作成しました。");
    }

    // iVehicleのメソッドを実装
    public void vShow() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("車のガソリン量は" + gas + "です。");
    }

    // iMaterialのメソッドを実装
    public void mShow() {
        System.out.println("車の材質は鉄です。");
    }
}

// メインクラス：Carオブジェクトの生成とインターフェースの動作確認
class MultipleInterfaceImplementation {
    public static void main(String[] args) {
        // Carオブジェクトを生成し、情報を表示
        Car car1 = new Car(1234, 20.5);

        // 2つのインターフェースメソッドを呼び出し
        car1.vShow(); // 乗り物としての情報を表示
        car1.mShow(); // 材質としての情報を表示
    }
}