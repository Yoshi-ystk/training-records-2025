// スレッドの終了を待つ（join）処理の例
package threads;

// CarクラスはThreadを継承してスレッドとして動作
class Car extends Thread {
    private String name;

    // コンストラクタでスレッド名（車名）を受け取る
    public Car(String nm) {
        name = nm;
    }

    // スレッドが開始されるとrun()が実行される
    public void run() {
        for (int i = 0; i < 5; i++) {
            // 処理中の車名を出力
            System.out.println(name + "の処理をしています。");
        }
    }
}

class ThreadJoinExample {
    public static void main(String[] args) {
        // Carクラスのインスタンス（スレッド）を作成
        Car car1 = new Car("1号車");

        // スレッドの開始
        car1.start();

        try {
            // car1スレッドの終了を待機する（join）
            car1.join(); // メインスレッドはcar1が終わるまで待機
        } catch (InterruptedException e) {
            // join中に割り込まれた場合の例外処理（今回は空）
        }
        // car1スレッドの終了を確認してからメッセージを表示
        System.out.println("name()の処理を終わります。");
    }
}