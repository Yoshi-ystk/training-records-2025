# 演算子と型変換の学習記録

## フォルダ概要  

このフォルダでは、Java における基本的な演算子（算術演算子、代入演算子、インクリメント演算子など）や、異なる型どうしの代入や演算時の型変換（キャスト）について学んだサンプルコードをまとめています。  
演算の順序やデータ型の違いによる動作の違いなど、数値処理の基礎を理解するための教材として活用できます。

## 含まれるファイル

- `VariableAddition.java`  
  変数に整数値を代入し、加算結果を表示する基本的なサンプルです。  
  計算結果を別の変数に格納し、再利用する方法を学びます。

- `IntegerAdditionInput.java`  
  キーボードから2つの整数を入力し、その合計を表示するプログラムです。  
  ユーザー入力を `BufferedReader` で取得し、`parseInt` を使って整数に変換する基本も確認できます。

- `BasicArithmeticOperations.java`  
  加算、減算、乗算、除算、剰余（あまり）など、5種類の算術演算子を使って2つの整数の演算結果を出力する例です。  
  演算子の動作や違いを比較しやすい構成になっています。

- `PostIncrementExample.java`  
  後置インクリメント演算子（`a++`）を使って、代入後に値が増加することを確認するサンプルです。  
  前置との違いを学ぶ前段階として適しています。

- `CompoundAssignmentSum.java`  
  複合代入演算子（`+=`）を使って、複数の値を1つの変数に加算していく方法を示した例です。  
  同様に `-=` や `*=` など他の複合演算子への応用も考えられます。

- `CastDoubleToInt.java`  
  `double` 型から `int` 型への明示的なキャスト（型変換）の例です。  
  小数部分が切り捨てられる点など、型変換の注意点が学べます。

- `DivideWithCasting.java`  
  `int / int` のままだと整数除算になるため、片方を `double` にキャストして小数点のある結果を得るサンプルです。  
  演算結果の正確性や意図した出力形式をコントロールする際の基礎になります。

- `SquareAreaCalculator.java`  
  キーボードから正方形の一辺の長さを入力し、その面積を計算・出力するプログラムです。  
  入力値の数値変換と乗算の確認に加え、実用的な計算の例でもあります。

## 関連トピック

- 算術演算子：`+` `-` `*` `/` `%`
- 代入演算子と複合代入演算子：`=` `+=`
- インクリメント演算子：`++`
- キャスト（型変換）：`(int)` `(double)`
- ユーザー入力：`BufferedReader` と `parseInt`

## 今後の予定

- 前置インクリメント（`++a`）や `--` 演算子との違い
- 明示的なキャストと暗黙的な型変換の違い
- `float` や `long` など他の数値型との演算