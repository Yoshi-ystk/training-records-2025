// 複数のスレッドが同時に同じメソッドにアクセスした場合の問題を再現するサンプル
// 排他制御（synchronized）をしていないため、合計額の更新が競合して不正確になります
package java_learn.threads_and_synchronization;

//会社クラス
class Company {
    private int sum = 0;

    public void add(int a) { // 振込処理です
        // 排他制御をしていないため、複数スレッドがこのメソッドを同時に実行すると、
        // tmpに代入されたsumの値が古いまま処理され、合計額の計算が狂う可能性があります
        int tmp = sum;
        System.out.println("現在、合計額は" + tmp + "円です。");
        System.out.println(a + "円稼ぎました。");
        tmp = tmp + a;
        System.out.println("合計額を" + tmp + "円にします。");

        sum = tmp; // ← 実行順序次第で意図しない結果になる
    }
}

// 運転手クラス
class Driver extends Thread {
    private Company comp;

    public Driver(Company c) {
        comp = c;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            comp.add(50); // 振込処理をする
        }
    }
}

class UnsynchronizedBankExample {
    public static void main(String[] args) {
        Company cmp = new Company(); // 会社オブジェクトを作成

        // 2つのスレッド（運転手）が同時に会社に入金処理を行う
        // 排他制御していないため、同時アクセスにより合計額が正しくならないことがある
        Driver drv1 = new Driver(cmp);
        drv1.start();

        Driver drv2 = new Driver(cmp); // 運転手オブジェクト2を作成
        drv2.start();
    }
}
/*
【このプログラムの目的】
 - 排他制御をしていない `add()` メソッドに複数のスレッドが同時にアクセスした場合、
   合計額の更新処理が競合し、意図しない結果（合計額が合わない）になることを示す。

【改善方法】
 - add() メソッドに synchronized をつけて排他制御を行えば、1つのスレッドが処理中は他のスレッドは待機するため、
   データ競合が防げます。
*/