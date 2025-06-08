// AWTで基本的なウィンドウフレームを表示するサンプル
// このプログラムは、AWTのFrameクラスを使用してシンプルなウィンドウを表示します。
// ウィンドウを閉じる処理には WindowListener を用いています。
package java_learn.gui_basics;

import java.awt.*;
import java.awt.event.*;

// フレームの基本構造を定義するクラス
public class BasicWindowFrame extends Frame { // フレームクラスを拡張
    // プログラムのエントリーポイント
    // フレームのインスタンスを生成して表示public static void main(String[] args){
    public static void main(String[] args) {
        new BasicWindowFrame(); // 拡張したクラスからオブジェクトを作成
    }

    // ウィンドウのタイトル、サイズ、リスナー設定を行う
    public BasicWindowFrame() {
        super("サンプル"); // ウィンドウのタイトルを設定

        addWindowListener(new SampleWindowListener());

        setSize(250, 200); // ウィンドウのサイズを設定
        setVisible(true); // ウィンドウが表示されるようにする
    }

    // ウィンドウを閉じるイベントに対応するためのリスナークラス
    class SampleWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) { // ウィンドウを閉じることができるようにする
            // プログラムを終了させる
            System.exit(0);
        }
    }
}