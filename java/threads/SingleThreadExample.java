// 複数のスレッドを同時に起動して並行処理を実行する例
package threads;

// スレッドを起動するクラスを定義（Threadクラスを継承）
class Car extends Thread {
    private String name;

    // スレッドに付与する名前をコンストラクタで受け取る
    public Car(String nm) {
        name = nm;
    }

    // スレッドが実行されると呼ばれるメソッド（処理の内容を定義）
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

// メインスレッドでCarスレッドを起動する例
class SingleThreadExample {
    public static void main(String[] args) {
        // Carクラスのスレッドを生成
        Car car1 = new Car("1号車");

        // 新しいスレッドとして処理を開始（run()が呼ばれる）
        car1.start();

        // メインスレッドの処理（Carスレッドと並行して実行される）
        for (int i = 0; i < 5; i++) {
            System.out.println("main() の処理をしています。");
        }
    }
}