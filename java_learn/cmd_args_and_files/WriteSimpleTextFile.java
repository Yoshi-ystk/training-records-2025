// テキストファイルに複数行の文字列を書き込む練習問題の解答
package java_learn.cmd_args_and_files;

import java.io.*;

public class WriteSimpleTextFile {
    public static void main(String[] args) {
        // PrintWriter を使ってファイル test1.txt に文字列を書き込む
        // BufferedWriter を併用して書き込み効率を向上させている
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")))) {

            // 1行目の文字列を書き込み
            pw.println("A long time ago,");
            // 2行目の文字列を書き込み
            pw.println("There was a little girl.");

            // 書き込み成功のメッセージ表示
            System.out.println("ファイルに書き込みました。");
        }
        // 入出力例外が発生した場合の処理
        catch (IOException e) {
            System.out.println("入出力エラーです。");
        }
    }
}
// 練習問題: 次のような文字列をファイルtest1.txtに書き込むコードを記述してください。
// A long time ago,
// There was a little.