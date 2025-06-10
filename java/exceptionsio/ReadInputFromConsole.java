// 標準入力から文字列を読み込む基本的な入出力のサンプル
package exceptionsio;

import java.io.*;

public class ReadInputFromConsole {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください。");

        try {
            // バッファを介して読み込むようにします
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

            // １行読み込みます
            String str = br.readLine();
            System.out.println(str + "が入力されました。");
        } catch (IOException e) {
            System.out.println("入出力エラーです。");
        }
    }
}