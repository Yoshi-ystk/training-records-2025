// synchronizedを使って排他制御を行う同期処理の例
package threads;

// 会社クラス：合計金額を管理
class Company {
    private int sum = 0;

    // 振込処理（合計金額に加算）を同期化
    // 複数スレッドからの同時アクセスによる不整合を防ぐために synchronized を使用
    public synchronized void add(int a) {
        int tmp = sum;
        System.out.println("現在、合計額は" + tmp + "円です。");
        System.out.println(a + "円稼ぎました。");
        tmp = tmp + a;
        System.out.println("合計額を" + tmp + "円にします。");

        sum = tmp; // 合計額を更新
    }
}

// 運転手クラス（スレッド）
class Driver extends Thread {
    private Company comp;

    // コンストラクタでCompanyオブジェクトを受け取る
    public Driver(Company c) {
        comp = c;
    }

    // スレッドが実行する処理：3回振込を行う
    public void run() {
        for (int i = 0; i < 3; i++) {
            comp.add(50); // 各振込で50円追加
        }
    }
}

// メインクラス
class SynchronizedBankExample {
    public static void main(String[] args) {
        Company cmp = new Company(); // 共有される会社オブジェクト

        // 2つの運転手スレッドを生成し、同時に実行
        Driver drv1 = new Driver(cmp);
        drv1.start();

        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}