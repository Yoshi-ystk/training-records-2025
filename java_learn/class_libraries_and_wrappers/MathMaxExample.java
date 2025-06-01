// 入力された2つの整数のうち、大きい方を出力するプログラム
package java_learn.class_libraries_and_wrappers;

import java.io.*;

class MathMaxExample {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を２つ入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        String str1 = br.readLine();
        String str2 = br.readLine();

        // 整数を２つ用意
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math.max(num1, num2);

        System.out.println(num1 + "と" + num2 + "のうち大きいほうは"
                + ans + "です。");
    }
}