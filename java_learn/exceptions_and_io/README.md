# exceptions_and_io の学習記録

## フォルダ概要

このフォルダでは、Javaの例外処理（try-catch-finally構文、例外情報の出力、独自例外の作成）と、標準入出力やファイル操作の基礎について学習したコードをまとめています。

---

## 含まれるファイル一覧

- `ExceptionNotHandledExample.java`  
  例外をキャッチせずに実行するとどうなるかを確認するための例外発生サンプル

- `HandleArrayIndexException.java`  
  配列の範囲外アクセスで発生する例外をtry-catchでハンドリングするサンプル

- `FinallyBlockExample.java`  
  try-catch-finally構文を使い、finallyブロックの実行タイミングを確認するサンプル

- `ExceptionInfoOutput.java`  
  発生した例外に対して、例外のメッセージやクラス名など詳細情報を出力するサンプル

- `CustomExceptionDemo.java`  
  独自に例外クラスを定義し、throw文を使って例外を送出するサンプル

- `ReadInputFromConsole.java`  
  コンソールからユーザー入力を受け取り、適切に処理する標準入力のサンプル

- `WriteToFileExample.java`  
  `BufferedWriter` を用いて、指定したテキストファイルにデータを書き込むサンプル

- `ReadFromFileExample.java`  
  `BufferedReader` を用いて、テキストファイルの内容を1行ずつ読み込むサンプル

- `ProcessScoresFromFile.java`  
  ファイルから複数の点数を読み込み、最高点と最低点を算出する成績処理サンプル

---

## 学習のポイント

- try-catch-finally構文の基本と例外の種類
- 例外メッセージや例外オブジェクトの詳細取得方法
- 独自例外クラスの作成方法
- 標準入力やファイル入出力処理の実装パターン
- ファイルを使ったデータの集計処理

---

## 学習日

2025年6月