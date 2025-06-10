// マウスの出入りでボタンラベルが変化するサンプル
package guibasics;

// GUI部品やイベント処理に必要なクラスをインポート
import java.awt.*;
import java.awt.event.*;

// フレームを継承したクラスを定義
public class MouseEventButton extends Frame {
    // ボタン部品の定義
    private Button bt;

    // エントリーポイント（アプリケーションの開始地点）
    public static void main(String[] args) {
        new MouseEventButton(); // フレームのインスタンスを生成
    }

    // コンストラクタ：ウィンドウやボタン、イベントリスナーを設定
    public MouseEventButton() {
        super("サンプル"); // フレームのタイトル設定

        bt = new Button("ようこそ。"); // 初期表示ラベル
        add(bt); // フレームにボタンを追加

        // 閉じるボタンが押されたときの処理を設定
        addWindowListener(new SampleWindowListener());

        // マウスイベント（入る・出る）をボタンに設定
        bt.addMouseListener(new SampleMouseListener());

        setSize(250, 200); // ウィンドウサイズの設定
        setVisible(true); // ウィンドウを表示
    }

    // ウィンドウを閉じる操作に対応するリスナー
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0); // アプリケーションを終了
        }
    }

    // マウス操作に対応するイベントリスナーの実装
    class SampleMouseListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            // クリックイベントは未使用
        }

        public void mouseReleased(MouseEvent e) {
            // ボタンを離したときのイベント（未使用）
        }

        public void mousePressed(MouseEvent e) {
            // ボタンを押したときのイベント（未使用）
        }

        // マウスカーソルがボタンに入ったとき
        public void mouseEntered(MouseEvent e) {
            bt.setLabel("いらっしゃいませ"); // ラベルを変更
        }

        // マウスカーソルがボタンから出たとき
        public void mouseExited(MouseEvent e) {
            bt.setLabel("ようこそ。"); // 元のラベルに戻す
        }
    }
}