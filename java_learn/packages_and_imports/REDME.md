# packages_and_importsの学習記録

## フォルダ概要

このフォルダでは、Javaにおけるパッケージとインポート機能に関する基本的な使い方を学んだコードを収録しています。パッケージの定義方法、異なるパッケージにあるクラスの使用、インポートの有無によるクラス参照方法など、Javaのパッケージ機構の基本理解を目的とした内容です。

---

## 含まれるファイル一覧

- `AnimalInterfaceExample.java`  
  インターフェースを定義し、`Dog` と `Cat` クラスに実装。配列を使って全動物の鳴き声を出力する練習問題。

- `ImportClassFromPackage.java`  
  別パッケージのクラスを `import` 文で明示的にインポートし、クラス名にパッケージを付けずに利用する方法を学習。

- `PackageClassUsage.java`  
  `package` 宣言の基本的な使い方と、クラスを同一パッケージ内で定義して使用する例を示す基本コード。

- `SplitClassSingleFile.java`  
  複数のクラスを同じ `.java` ファイルに定義し、1つの `public` クラスのみをエントリーポイントとして扱う構成を確認。

- `UseClassFromOtherPackage.java`  
  本来は別パッケージ・別ファイルにあるクラスを使用するシナリオを、1ファイルに統合しつつコメントで本来の構成を補足する形式で表現。

---

## 学習のポイント

- `package` 宣言とディレクトリ構造の関係性を理解する  
- `import` 文を使う場合と使わない場合の違い  
- 別パッケージにあるクラスの利用方法と制約  
- 複数クラスを1つのファイルで扱う方法と制限（`public` クラスの扱い）  
- 学習用途として、構造を簡略化しつつも意図を明確に伝えるための工夫（コメント補足など）

---

## 学習日  
2025年6月