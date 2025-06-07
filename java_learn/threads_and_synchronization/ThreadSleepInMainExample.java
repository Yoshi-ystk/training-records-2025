package java_learn.threads_and_synchronization;

// 別スレッドで処理を行うクラス
class Car extends Thread {
    private String name;

    public Car(String nm) {
        name = nm;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class ThreadSleepInMainExample {
    public static void main(String[] args) {
        // Car クラスのスレッドを起動
        Car car1 = new Car("1号車");
        car1.start();

        // メインスレッド側でも処理を行う
        for (int i = 0; i < 5; i++) {
            try {
                // 1秒間スリープ
                Thread.sleep(1000);
                System.out.println("main() の処理をしています。");
            } catch (InterruptedException e) {
                // スリープ中に割り込みが発生した場合の処理
                System.out.println("スリープが割り込まれました。");
            }
        }
    }
}