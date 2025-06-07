// 複数のスレッドを同時に起動して並行処理を実行する例
package java_learn.threads_and_synchronization;

// CarクラスはThreadを継承し、並行実行される処理を定義
class Car extends Thread {
    private String name;

    // スレッドごとに識別するための名前を受け取るコンストラクタ
    public Car(String nm) {
        name = nm;
    }

    // スレッドが開始されると自動的に呼び出される処理
    @Override
    public void run() {
        // 同じ処理を5回繰り返す（他のスレッドと並行して実行される）
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class MultiThreadExample {
    public static void main(String[] args) {
        // Carクラスのスレッドを2つ生成し、それぞれ異なる名前を設定
        Car car1 = new Car("1号車");
        car1.start(); // スレッド1を開始

        Car car2 = new Car("2号車");
        car2.start(); // スレッド2を開始

        // mainスレッドの処理（Carのスレッドと並行して実行される）
        for (int i = 0; i < 5; i++) {
            System.out.println("main() の処理をしています。");
        }
    }
}