// 文字列の特定の文字を取り出し、長さを取得するプログラム
package java_learn.class_libraries_and_wrappers;

public class StringCharLength {
    public static void main(String[] args) {

        String str = "Hello";

        char ch1 = str.charAt(0);
        // １番目の文字を取り出す

        char ch2 = str.charAt(1);
        // ２番目の文字を取り出す

        int len = str.length();
        // 文字列の長さを返す

        System.out.println(str + "の１番目の文字は" + ch1 + "です。");
        System.out.println(str + "の２番目の文字は" + ch2 + "です。");
        System.out.println(str + "の長さは" + len + "です。");
    }
}