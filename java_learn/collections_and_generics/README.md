# コレクションとジェネリクスの学習記録

## フォルダ概要

このフォルダでは、Javaにおける**コレクションフレームワーク（List, Set, Map）**および**ジェネリクス**の基本的な使い方を学習した内容をまとめています。  
配列とは異なる柔軟なデータ構造の使い方や、型安全性を確保するためのジェネリクスの活用を通して、実践的なデータ管理の基礎を学びました。

- `ArrayList`, `HashSet`, `TreeSet`, `HashMap` などの主要なコレクションの使い方  
- `Iterator` を使った走査方法  
- カスタムクラスをコレクションに格納する手法  
- ジェネリクスによる安全かつ再利用性の高いコードの設計  

## 含まれるファイル

### 🔸 List の基本操作と走査
- `IntegerListExample.java`  
  `ArrayList<Integer>` に整数を追加し、拡張for文で出力する基本例。

- `StringListIterator.java`  
  `ArrayList<String>` に文字列を格納し、`Iterator` を使って順に取り出して表示する例。

- `HeroListExample.java`  
  ユーザー定義クラス `Hero` のインスタンスを `ArrayList` に格納し、リストとして操作するサンプル。

### 🔸 Set の重複排除と並び順
- `SetDuplicateTest.java`  
  `HashSet` に重複要素を追加した際の挙動を通じて、Setの性質（重複排除）を確認。

- `TreeSetSortedExample.java`  
  `TreeSet` による要素の自然順ソートと保持を確認する例。

### 🔸 Map の管理とイテレーション
- `HashMapBasicExample.java`  
  `HashMap` に文字列のキーと値を格納し、基本的な追加と取得を学ぶ例。

- `HashMapIterationExample.java`  
  `HashMap` の `entrySet()` を用いて、キーと値をまとめて取り出すイテレーションの方法を学ぶサンプル。

- `HeroEnemyMapExample.java`  
  `Hero` オブジェクトをキーとして、倒した敵の数を `HashMap` に格納し、`keySet()` と `get()` で取り出す練習。

## 学びのポイント
- `ArrayList` を使ったリストの基本操作とジェネリクスによる型安全性の確保。  
- `Iterator` を活用した要素走査の方法と特徴。  
- `HashSet` や `TreeSet` による重複排除とソートの使い分け。  
- `HashMap` を用いたキーと値のペア管理とその走査方法。  
- ユーザー定義クラスを使ったコレクション管理の実践的な方法。

## 学習日  
2025年5月