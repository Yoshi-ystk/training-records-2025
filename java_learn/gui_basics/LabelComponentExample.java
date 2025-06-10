// ラベルコンポーネントをウィンドウに表示するサンプル
package java_learn.gui_basics;

import java.awt.*;
import java.awt.event.*;

// Frame を継承したクラスを作成（AWTの基本的なウィンドウを構成）
public class LabelComponentExample extends Frame {
    private Label lb; // ラベル用コンポーネント

    public static void main(String[] args) {
        // ウィンドウを生成（コンストラクタが呼ばれる）
        new LabelComponentExample();
    }

    public LabelComponentExample() {
        super("サンプル"); // ウィンドウのタイトルを設定

        lb = new Label("ようこそ。");// ラベルを作成
        add(lb); // ラベルをウィンドウに追加

        lb.setForeground(Color.red);// ラベルの文字色を赤に設定
        lb.setFont(new Font("Serif", Font.BOLD, 24));// ラベルのフォントとサイズを設定

        addWindowListener(new SampleWindowListener()); // 閉じる操作に対応するリスナーを追加

        setSize(250, 200); // ウィンドウのサイズ設定
        setVisible(true); // ウィンドウを可視化
    }

    // ウィンドウを閉じる際の処理を定義する内部クラス
    class SampleWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);// アプリケーションを終了
        }
    }
}