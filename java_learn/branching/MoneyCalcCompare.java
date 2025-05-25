// 課題：金額を入力すると各紙幣と硬貨の枚数を計算して出力するプログラムを作成してください。
// この時点では、配列やループは習っていません。
package java_learn.branching;

import java.io.*;

public class MoneyCalcCompare {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        System.out.println("金額を入力してください：");
        String str = br.readLine();
        int amount = Integer.parseInt(str);

        System.out.println("\n===== 自作プログラム（if文を使って各金種を個別に処理）=====");
        myVersion(amount);

        System.out.println("\n===== 解答例（同じ変数を再利用して計算と出力を交互に処理）=====");
        answerVersion(amount);
    }

    /**
     * 自作プログラム（if文を使い、各金種ごとに変数を分けて管理）
     */
    public static void myVersion(int res) {
        int count10000 = 0;
        int count5000 = 0;
        int count1000 = 0;
        int count500 = 0;
        int count100 = 0;
        int count50 = 0;
        int count10 = 0;
        int count5 = 0;
        int count1 = 0;

        if(res >= 10000){
            count10000 = res / 10000;
            res = res % 10000;
        }
        if(res >= 5000){
            count5000 = res / 5000;
            res = res % 5000;
        }
        if(res >= 1000){
            count1000 = res / 1000;
            res = res % 1000;
        }
        if(res >= 500){
            count500 = res / 500;
            res = res % 500;
        }
        if(res >= 100){
            count100 = res / 100;
            res = res % 100;
        }
        if(res >= 50){
            count50 = res / 50;
            res = res % 50;
        }
        if(res >= 10){
            count10 = res / 10;
            res = res % 10;
        }
        if(res >= 5){
            count5 = res / 5;
            res = res % 5;
        }
        if(res >= 1){
            count1 = res / 1;
            res = res % 1;
        }
        // 出力はまとめて書くスタイル
        System.out.println("10000円札は" + count10000 + "枚です。");
        System.out.println("5000円札は" + count5000 + "枚です。");
        System.out.println("1000円札は" + count1000 + "枚です。");
        System.out.println("500円玉は" + count500 + "枚です。");
        System.out.println("100円玉は" + count100 + "枚です。");
        System.out.println("50円玉は" + count50 + "枚です。");
        System.out.println("10円玉は" + count10 + "枚です。");
        System.out.println("5円玉は" + count5 + "枚です。");
        System.out.println("1円玉は" + count1 + "枚です。");
    }
        // 【感想】
        // 習ったばかりのif文を使いたくて頑張ってみた。
        // 「計算する部分」と「表示する部分」を分けて書いたことで、
        // どこで何をしているか分かりやすくなった。
        // ただ、同じような計算が続いているので、もっと短く書ける方法がある気がした。

    /**
     * 解答例プログラム（同じ変数「mai」を再利用しながら出力を交互に処理）
     */
    public static void answerVersion(int res) {
        int mai = 0;

        mai = res / 10000;
        res = res % 10000;
        System.out.println("10000円札は" + mai + "枚です。");

        mai = res / 5000;
        res = res % 5000;
        System.out.println("5000円札は" + mai + "枚です。");

        mai = res / 1000;
        res = res % 1000;
        System.out.println("1000円札は" + mai + "枚です。");

        mai = res / 500;
        res = res % 500;
        System.out.println("500円玉は" + mai + "枚です。");

        mai = res / 100;
        res = res % 100;
        System.out.println("100円玉は" + mai + "枚です。");

        mai = res / 50;
        res = res % 50;
        System.out.println("50円玉は" + mai + "枚です。");

        mai = res / 10;
        res = res % 10;
        System.out.println("10円玉は" + mai + "枚です。");

        mai = res / 5;
        res = res % 5;
        System.out.println("5円玉は" + mai + "枚です。");

        mai = res / 1;
        res = res % 1;
        System.out.println("1円玉は" + mai + "枚です。");
        // 【感想】
        // 出力と計算を交互に書いていて、見た目は少し散らかって見える気がする。
        // でも行数が短くなっていて、すっきりしているのはすごい。
        // if文は使っていないけど、これはこれで一つの書き方として勉強になった。
    }
}