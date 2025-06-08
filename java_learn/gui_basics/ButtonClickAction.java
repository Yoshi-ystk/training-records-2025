// GUIアプリケーションの基本例：ボタンをクリックするとラベルが変化するイベント処理を実装
package java_learn.gui_basics;

import java.awt.*;
import java.awt.event.*;

public class ButtonClickAction extends Frame {
    private Button bt;

    public static void main(String[] args) {
        // アプリケーションの起点となるウィンドウを生成
        new ButtonClickAction();
    }

    public ButtonClickAction() {
        super("サンプル");

        // ボタンの生成と画面への追加
        bt = new Button("ようこそ。");
        add(bt);

        // ウィンドウを閉じたときに終了するようにイベントリスナーを設定
        addWindowListener(new SampleWindowListener());

        // ボタンをクリックしたときのアクションを定義
        bt.addActionListener(new SampleActionListener());

        // ウィンドウのサイズと表示
        setSize(250, 200);
        setVisible(true);
    }

    class SampleWindowListener extends WindowAdapter {
        // ウィンドウを閉じるときの処理
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class SampleActionListener implements ActionListener {
        // ボタンがクリックされたときに呼び出される
        public void actionPerformed(ActionEvent e) {
            bt.setLabel("こんにちは。");
        }
    }
}
// ボタンはウィンドウ全体に表示される。
// 押下時にラベルを変更する処理は SampleActionListener 内に記述されている。