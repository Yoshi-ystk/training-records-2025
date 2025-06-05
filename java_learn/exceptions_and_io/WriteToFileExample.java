// テキストファイルに文字列を書き込むサンプル
package java_learn.exceptions_and_io;

import java.io.*;

public class WriteToFileExample {
    public static void main(String[] args) {
        try {
            // ファイルへの出力準備（書き込み先: test1.txt）
            // FileWriter: 文字ファイルを書き込むための基本クラス
            // BufferedWriter: 書き込みを効率化するためのバッファ付きラッパー
            // PrintWriter: 改行付き出力やprint系メソッドを提供するクラス
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));

            // ファイルに文字列を書き出す
            pw.println("Hello!"); // 1行目の出力
            pw.println("GoodBye!"); // 2行目の出力
            System.out.println("ファイルに書き込みました。"); // 処理完了の通知

            // ファイルをクローズしてリソースを解放
            pw.close();
        } catch (IOException e) {
            // 入出力エラーが発生した場合の処理
            System.out.println("入出力エラーです。");
        }
    }
}