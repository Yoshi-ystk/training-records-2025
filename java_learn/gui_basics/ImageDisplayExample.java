// ウィンドウに画像を表示する基本的なサンプル
package java_learn.gui_basics;

// AWTを使ったGUIおよびイベント処理のためのパッケージをインポート
import java.awt.*;
import java.awt.event.*;

// フレームを使って画像を表示するサンプルプログラム
public class ImageDisplayExample extends Frame {
    Image im; // 画像データを保持するフィールド

    public static void main(String[] args) {
        new ImageDisplayExample(); // フレームを作成して表示
    }

    // コンストラクタ：GUI部品や画像の読み込み処理を行う
    public ImageDisplayExample() {
        super("サンプル"); // ウィンドウタイトルを指定して親クラスのコンストラクタを呼び出し

        Toolkit tk = getToolkit(); // ツールキット（リソース取得用のユーティリティ）を取得
        im = tk.getImage("Image.jpg"); // 画像ファイルを読み込み（実行時のカレントディレクトリに配置）

        addWindowListener(new SampleWindowListener()); // ウィンドウを閉じたときの処理を設定

        setSize(250, 200); // ウィンドウサイズを指定
        setVisible(true); // ウィンドウを画面に表示
    }

    // paint()メソッドをオーバーライドして画像を描画
    public void paint(Graphics g) {
        // 画像を座標(100, 100)に描画（画像は非同期で読み込まれることに注意）
        g.drawImage(im, 100, 100, this);
    }

    // ウィンドウの×ボタンがクリックされたときにアプリケーションを終了するリスナー
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0); // アプリケーション終了
        }
    }
}