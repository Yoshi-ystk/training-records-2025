// 入力された英字を大文字・小文字に変換するプログラム
package standardclasses;

import java.io.*;

public class StringCaseConversion {
    public static void main(String[] args) throws IOException {
        System.out.println("英字を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        String str = br.readLine();

        String stru = str.toUpperCase(); // 大文字に変換
        String strl = str.toLowerCase(); // 小文字に変換
        // 恐らくupperStrとlowerStrの方がわかりやすそうだが、テキストに倣う

        System.out.println("大文字に変換すると" + stru + "です。");
        System.out.println("小文字に変換すると" + strl + "です。");
    }
}