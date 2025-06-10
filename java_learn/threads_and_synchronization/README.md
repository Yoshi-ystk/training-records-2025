# スレッドと同期処理の学習記録

## フォルダ概要  

このフォルダでは、Javaにおける**マルチスレッド処理の基本**と、**スレッド間での同期制御（排他制御）**について学習した内容をまとめています。  
`Thread` クラスや `Runnable` インターフェースを用いたスレッドの生成・制御、`sleep()` や `join()` を使った動作調整、  
さらには `synchronized` による競合回避の仕組みを通じて、**並行処理における問題とその解決策**を体験的に理解しました。

- `Thread` クラスと `Runnable` インターフェースによるスレッドの定義と使い分け  
- 複数スレッドの同時実行と、`sleep()`・`join()` による制御  
- 共有リソースへのアクセス時の不整合と `synchronized` を使った排他制御  
- スレッドの開始タイミングと `start()` / `run()` の違い  

## 含まれるファイル

### 🔸 単一・複数スレッドの実行と制御
- `SingleThreadExample.java`  
  単一スレッドで一連の処理を順に実行する基本例。

- `MultiThreadExample.java`  
  複数のスレッドを並行して実行し、並列動作を体感する例。

- `ThreadSleepExample.java`  
  各スレッド内で `Thread.sleep()` を使って処理の遅延を発生させる例。

- `ThreadJoinExample.java`  
  `join()` によってスレッドの終了を待ち、順序を制御するサンプル。

- `ThreadSleepInMainExample.java`  
  `main()` メソッド内で `Thread.sleep()` を使用する構成の確認。

### 🔸 スレッドの定義方法の違い
- `RunnableInterfaceExample.java`  
  `Runnable` インターフェースを使ってスレッドを実装する例。  
  クラスの継承を避けたい場合の選択肢としての使い分けを確認。

### 🔸 排他制御と同期の実践
- `UnsynchronizedBankExample.java`  
  複数スレッドが同時に共有リソースへアクセスし、不整合が発生する例。

- `SynchronizedBankExample.java`  
  `synchronized` を用いて排他制御を行い、不整合を防止する正しい実装例。

## 学びのポイント
- `Thread` クラス継承と `Runnable` 実装の使い分けを明確に理解した。  
- `start()` と `run()` の違いを確認し、スレッドの開始方法を正しく実装できた。  
- `sleep()` と `join()` によるスレッドの制御タイミングの調整方法を学んだ。  
- 同期のない環境での競合状態と、それを `synchronized` によって回避する技法を体験的に理解した。  
- 並行処理の設計と実装の基本を、コード実行と出力比較を通じて習得した。

## 学習日  
2025年5月