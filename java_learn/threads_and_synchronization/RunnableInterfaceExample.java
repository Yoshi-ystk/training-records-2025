// Runnableインターフェースを実装してスレッドを起動する例
package java_learn.threads_and_synchronization;

// CarクラスはRunnableインターフェースを実装することでスレッドとして実行可能に
class Car implements Runnable {
    private String name;

    // コンストラクタでスレッド名（車名）を受け取る
    public Car(String nm) {
        name = nm;
    }

    // Runnableインターフェースのrun()メソッドをオーバーライド
    // この処理がスレッドとして実行される
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class RunnableInterfaceExample {
    public static void main(String[] args) {
        // Runnableを実装したCarクラスのインスタンスを作成
        Car car1 = new Car("1号車");

        // ThreadクラスのコンストラクタにCarのインスタンスを渡す
        Thread th1 = new Thread(car1);

        // スレッドを起動（run()メソッドが非同期で実行される）
        th1.start();

        // メインスレッド側の処理
        for (int i = 0; i < 5; i++) {
            System.out.println("メインスレッドの処理をしています。");
        }
    }
}
