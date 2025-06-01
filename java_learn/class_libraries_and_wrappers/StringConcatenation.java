// 2つの文字列を結合して表示するプログラム
package java_learn.class_libraries_and_wrappers;

import java.io.*;

class StringConcatenation {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        String str1 = br.readLine();

        // 追加する文字列を入力させる
        System.out.println("追加する文字列を入力してください。");
        String str2 = br.readLine();

        // 文字列を追加
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);

        System.out.println(str1 + "に" + str2 + "を追加すると"
                + sb + "です。");
    }
}