// コマンドライン引数で指定したファイルに文字列を書き込む練習問題の解答
package java_learn.cmd_args_and_files;

import java.io.*;

public class WriteToSpecifiedFile {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("ファイル名を正しく指定してください。");
            System.exit(1);
        }
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[0])));
            // ("test1.txt")ではなく(args[0])と記述することで任意のファイル名を指定できる
            pw.println("A long time ago,");
            pw.println("There was a little girl.");

            pw.close();
        } catch (IOException e) {
            System.out.println("入出力エラーです。");
        }
    }
}
// WriteSimpleTextFile.javaの課題は以下です。
// 練習問題: 次のような文字列をファイルtest1.txtに書き込むコードを記述してください。
// A long time ago,
// There was a little.

// 上記について、結果を出力するファイル名をコマンドラインから指定できるようにしてくださいという課題でした。