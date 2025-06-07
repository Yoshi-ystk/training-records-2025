# 🧵 threads_and_synchronization の学習記録

スレッドの基本と、複数スレッドが同時に動作する環境での同期処理の仕組みを学習します。`Thread` クラスの使い方から `Runnable` インターフェース、`synchronized` による排他制御までを順を追って体験的に理解できる構成です。

---

## 📁 含まれるファイル一覧

- `SingleThreadExample.java`  
  単一スレッドで処理を順に実行する例です。

- `MultiThreadExample.java`  
  複数スレッドを同時に動かすことで並行処理を体験します。

- `ThreadSleepExample.java`  
  `Thread.sleep()` を用いて処理に遅延を挟む例です。

- `ThreadJoinExample.java`  
  `join()` によってスレッドの完了を待ってから処理を続行する例です。

- `RunnableInterfaceExample.java`  
  `Runnable` インターフェースを用いたスレッドの実装例です。

- `UnsynchronizedBankExample.java`  
  同期化されていない共有リソースへのアクセスによって不整合が生じる例です。

- `SynchronizedBankExample.java`  
  `synchronized` を使って排他制御を行い、不整合を防ぐ例です。

- `ThreadSleepInMainExample.java`  
  `main()` メソッド内で `Thread.sleep()` を使うパターンを確認します。

---

## 📌 学習のポイント

- `Thread` クラスと `Runnable` インターフェースの違い
- `start()` と `run()` の違い
- `sleep()` や `join()` を使ったスレッド制御
- 同期しない場合に発生する競合と `synchronized` による解決方法
- スレッドの同時実行がプログラム結果に与える影響

---

## 🗓️ 学習日  
2025年5月