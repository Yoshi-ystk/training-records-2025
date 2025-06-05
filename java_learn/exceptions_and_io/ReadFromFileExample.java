// テキストファイルから文字列を読み込むサンプル
package java_learn.exceptions_and_io;

import java.io.*;

public class ReadFromFileExample {
    public static void main(String[] args) {
        try {
            // ファイル "test1.txt" を読み込むための文字ストリームを作成
            // FileReader：ファイルから文字を読み込む基本クラス
            // BufferedReader：効率よく読み込むためにバッファを利用
            BufferedReader br = new BufferedReader(new FileReader("test1.txt")); // ファイル名を指定して文字ストリームを作成

            // １行ずつ読み込みます
            String str1 = br.readLine(); // 1行目（"Hello!"）の読み込み
            String str2 = br.readLine(); // 2行目（"GoodBye!"）の読み込み

            // 読み込んだ文字列を出力
            System.out.println("ファイルに書き込まれている２つの文字列は");
            System.out.println(str1 + "です。");
            System.out.println(str2 + "です。");

            // 使用後はリソースを解放（クローズ）
            br.close();
        } catch (IOException e) {
            // ファイルの読み込み中に問題が発生した場合の処理
            System.out.println("入出力エラーです。");
        }
    }
}