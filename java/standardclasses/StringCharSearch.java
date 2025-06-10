// 文字列内で指定された文字を検索するプログラム
package standardclasses;

import java.io.*;

public class StringCharSearch {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        // 検索させる文字列を入力させる
        String str1 = br.readLine();
        System.out.println("検索文字を入力してください");

        // 検索する文字を入力させる
        String str2 = br.readLine();
        char ch = str2.charAt(0);

        // 文字を検索する
        int num = str1.indexOf(ch);

        // 見つかった文字の位置を出力
        if (num != -1) {
            System.out.println(str1 + "の" + (num + 1)
                    + "番目に「" + ch + "」がみつかりました。");

            // 見つからなかったときの処理
        } else {
            System.out.println(str1 + "に「" + ch + "」はありません。");
        }
    }
}
