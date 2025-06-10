// 異なるパッケージのクラスを利用する例（学習用）
// 元は Car.java（package pc）と UseClassFromOtherPackage.java（package pb）の2ファイル構成
// 公開用に1ファイルに統合しており、パッケージ名やファイル構成は簡略化しています
package packages;

// Car クラス（本来は package pc に保存され、public クラスとして利用）
// ※本ファイルでは 1ファイルに統合しているため public 修飾子は外しています
class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    public void show() {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("車のガソリン量は" + gas + "です。");
    }
}

// 本来は package pb から pc.Car を利用する想定
// 公開用に 1 ファイルにまとめているため、Car インスタンス生成時の "pc." は省略しています
public class UseClassFromOtherPackage {
    public static void main(String[] args) {
        Car car1 = new Car(); // 本来は pc.Car car1 = new pc.Car(); の形式
        car1.show();
    }
}