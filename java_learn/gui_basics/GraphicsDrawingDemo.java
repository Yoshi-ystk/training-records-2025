// Graphicsクラスを使って図形を描画するサンプル
package java_learn.gui_basics;

import java.awt.*;
import java.awt.event.*;

// AWTのFrameを継承してウィンドウを作成し、paintメソッドで描画を行う
public class GraphicsDrawingDemo extends Frame {

    // メインメソッドでフレームを作成・表示
    public static void main(String[] args) {
        new GraphicsDrawingDemo();
    }

    // コンストラクタ：ウィンドウの初期設定を行う
    public GraphicsDrawingDemo() {
        super("サンプル");

        // ウィンドウの×ボタンが押された時の動作を設定
        addWindowListener(new SampleWindowListener());

        // ウィンドウサイズを設定し、表示
        setSize(500, 450);
        setVisible(true);
    }

    // paintメソッドをオーバーライドして描画処理を行う
    public void paint(Graphics g) {
        // 色の設定は描画命令の前に行う必要がある
        g.setColor(Color.red);

        // 四角形の描画：左上(x=70, y=50)、幅100、高さ100
        g.drawRect(70, 50, 100, 100);

        // 扇形の描画（Arc）：左上(x=145, y=110)を起点に、270度から360度分の角度
        g.drawArc(145, 110, 100, 100, 270, 360);

        // 三角形の描画：3つの頂点を指定して描画
        // (200,300), (350,400), (150,400) を結ぶ
        g.drawPolygon(
                new int[] { 200, 350, 150 },
                new int[] { 300, 400, 400 },
                3);
    }

    // ウィンドウを閉じたときの処理を定義する内部クラス
    class SampleWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0); // プログラムを終了する
        }
    }
}