# 例外処理と入出力処理の学習記録

## フォルダ概要

このフォルダでは、Javaにおける**例外処理（try-catch-finally構文、例外の情報取得、独自例外の定義）**と、  
**標準入出力やファイル操作の基礎**について学習したコードをまとめています。  
実行時エラーへの適切な対応方法と、ファイルの読み書きに関する基本的な処理パターンの理解を目的としています。

- 例外をキャッチせずに放置した場合の動作の確認  
- 配列やファイル操作時の例外をtry-catch構文で安全に処理  
- finallyブロックによる後処理の保証  
- throwによる独自例外の送出と定義  
- 標準入力、ファイル入出力を通じた実用的なデータ処理の練習  

## 含まれるファイル

### 🔸 例外処理の基本
- `ExceptionNotHandledExample.java`  
  例外がキャッチされなかった場合にどうなるかを確認するサンプル。

- `HandleArrayIndexException.java`  
  配列の範囲外アクセスで発生する例外をtry-catchでハンドリング。

- `FinallyBlockExample.java`  
  finallyブロックが常に実行されることを確認するサンプル。

- `ExceptionInfoOutput.java`  
  例外発生時のクラス名やメッセージなどの詳細情報を出力する例。

- `CustomExceptionDemo.java`  
  独自例外クラスを定義し、throw文で例外を送出するサンプル。

### 🔸 標準入力の処理
- `ReadInputFromConsole.java`  
  コンソールからの入力を受け取り、処理する標準入力の例。

### 🔸 ファイルの読み書き
- `WriteToFileExample.java`  
  `BufferedWriter` を使ってテキストファイルに文字列を書き込む基本例。

- `ReadFromFileExample.java`  
  `BufferedReader` を使ってテキストファイルの内容を1行ずつ読み取るサンプル。

- `ProcessScoresFromFile.java`  
  ファイルから複数の点数を読み込み、最高点と最低点を計算・出力する処理例。

## 学びのポイント
- try-catch-finally構文を使った安全な例外処理の基本。  
- 例外オブジェクトからメッセージやクラス情報を取得する方法の理解。  
- 独自例外の定義とthrow文の使い方。  
- 標準入力の受け取りと文字列の扱い。  
- `BufferedReader` / `BufferedWriter` を用いたファイル入出力の実践。  
- ファイルデータを利用した集計処理の基礎。

## 学習日
2025年5月