// コマンドライン引数で指定したファイルの中身を読み取って表示するプログラム
package filearguments;

import java.io.*;

public class ReadFileWithArgs {
    public static void main(String[] args) {

        // if文を使用し、入力した文字列の個数を調べるブロック
        if (args.length != 1) { // 配列argsの長さを調べる
            System.out.println("ファイル名を正しく指定してください。");
            System.exit(1); // 違っていればプログラムを終了する
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            // args[0]:入力した１番目の文字列(ファイル名)から文字ストリームを作成
            String str;
            while ((str = br.readLine()) != null) {
                // strに読み込み、nullでない限り繰り返す
                System.out.print(str);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("入出力エラーです。");
        }
    }
}