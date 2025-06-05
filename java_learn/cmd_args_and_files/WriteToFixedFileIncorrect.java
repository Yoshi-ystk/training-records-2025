// 本来の課題「コマンドライン引数でファイル名を指定し、そのファイルに書き込む」に対し、
// 誤って「コマンドライン引数で指定したファイルを読み込む」実装をしてしまった誤解例。
// WriteToSpecifiedFile.java の作成前に記述したもので、学習の記録として参考までに残しています。
package java_learn.cmd_args_and_files;

import java.io.*;

public class WriteToFixedFileIncorrect {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("ファイル名を正しく指定してください。");
            System.exit(1);
        }
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("入出力エラーです。");
        }
    }
}
// ※この実装は誤解によるもので、WriteToFixedFileIncorrect.java は正解例ではありません。