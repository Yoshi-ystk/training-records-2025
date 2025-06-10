// スレッドを一時停止（sleep）させる例
package threads;

// Car クラスは Thread を継承し、独自の run メソッドで処理を実行する
class Car extends Thread {
    private String name;

    public Car(String nm) {
        name = nm;
    }

    @Override
    public void run() {
        // run メソッド内で 5 回繰り返す処理を行う
        for (int i = 0; i < 5; i++) {
            try {
                // スレッドを 1000 ミリ秒（= 1 秒）一時停止する
                sleep(1000);
                System.out.println(name + "の処理をしています。");
            }
            // sleep中に割り込みが発生した場合に備えて例外をキャッチする
            catch (InterruptedException e) {
                // 今回の例では特に処理は行わない（無視）
            }
        }
    }
}

class ThreadSleepExample {
    public static void main(String[] args) {
        // Car クラスのインスタンスを生成し、スレッドとして起動
        Car car1 = new Car("1号車");
        car1.start();// run() メソッドが別スレッドで実行される

        // main メソッド側でも並行して処理が進む
        for (int i = 0; i < 5; i++) {
            System.out.println("main() の処理をしています。");
        }
    }
}