# gui_basics の学習記録

## 含まれるファイル一覧

- `SimpleWindowExample.java`  
  最小限の構成でウィンドウを表示する基本的な GUI プログラム。

- `LabelAndButtonExample.java`  
  ボタンを押すことでラベルの表示を切り替える、イベント処理の基本例。

- `ButtonClickAction.java`  
  ボタンを押すとラベルが変更されるイベント処理のサンプル。  
  `ActionListener`インターフェースの使い方とイベントリスナーの構成を学習。

- `MouseEventButton.java`  
  マウスクリックに反応してメッセージを表示するイベント処理の例。  
  `MouseListener`インターフェースの使い方とマウスイベントの基礎を学習。

- `ImageDisplayExample.java`  
  AWT の `Image` クラスを使って、画像をウィンドウに表示するサンプル。  
  `Toolkit.getDefaultToolkit().getImage()` を用いた画像の読み込みを確認。

- `GraphicsDrawingDemo.java`  
  `Graphics` クラスを用いて図形（四角形、弧、三角形）を描画するサンプル。  
  `drawRect` や `drawPolygon` などのメソッドで図形描画の基本を体験。

## 学習のポイント

- AWT を使用した GUI プログラムの構成方法を理解する。
- `Frame`や`Button`、`Label`など基本的なコンポーネントの使い方。
- イベント処理の基本（`ActionListener`, `MouseListener`, `WindowAdapter`, `windowClosing`）の仕組みを体験。
- `Graphics` クラスによる描画処理と、`paint()` メソッドの仕組みを確認。
- 画像の読み込みと表示（`Image`, `Toolkit`）の手順を把握。
- コードと画面表示の対応関係を確認しながら GUI 構築への理解を深める。

## 学習日

2025 年 5 月