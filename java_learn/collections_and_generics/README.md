# collections_and_generics の学習記録

Javaにおけるコレクションフレームワーク（List, Set, Map）およびジェネリクスに関する基本的な使用方法を学習した記録です。  
配列とは異なる柔軟なデータ構造の使い方や、ジェネリクスによる型安全なプログラミング手法を確認しています。

## 含まれるファイル一覧

- `IntegerListExample.java`  
  `ArrayList<Integer>` に整数を追加し、拡張for文で出力する基本例です。

- `StringListIterator.java`  
  `ArrayList<String>` に文字列を格納し、`Iterator` を使って順に取り出して表示する例です。

- `SetDuplicateTest.java`  
  `HashSet` に重複要素を追加した際の動作を通じて、Setの性質を確認するプログラムです。

- `TreeSetSortedExample.java`  
  `TreeSet` を使って要素を自然順に自動ソートして保持する例です。

- `HashMapBasicExample.java`  
  `HashMap` に文字列のキーと値を格納し、Mapの基本的な使い方を学びます。

- `HashMapIterationExample.java`  
  `HashMap` に格納された要素を `entrySet()` で取り出して表示する方法を扱います。

- `HeroListExample.java`  
  ユーザー定義クラス `Hero` を `ArrayList` に格納し、カスタムオブジェクトのリスト操作を練習します。

- `HeroEnemyMapExample.java`  
  `Hero` オブジェクトと倒した敵の数を `HashMap` で紐づけて管理し、`keySet()` と `get()` で取り出す例です。

## 学習のポイント

- List（ArrayList）の基本操作とジェネリクスの使用法
- Iterator を使った要素の走査
- Set（HashSet, TreeSet）での重複排除と自動ソートの違い
- Map（HashMap）の要素追加・取得・イテレーション
- カスタムクラス（Hero）をコレクションに格納・操作する方法

## 学習日  
2025年5月