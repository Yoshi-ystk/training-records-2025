// ファイルから点数を読み込み、最高点と最低点を出力する成績処理サンプル
package java_learn.exceptions_and_io;

import java.io.*;

// メモ：test2.txt には以下のような8人分の点数が1行ずつ記載されています：
// 80, 68, 22, 33, 56, 78, 33, 56

public class ProcessScoresFromFile {
    public static void main(String[] args) {
        try {
            // ファイル"test2.txt"を読み込み用に開く
            BufferedReader br = new BufferedReader(new FileReader("test2.txt"));

            // 点数を格納する配列（8人分のテスト結果）
            int[] test = new int[8];
            String str;

            // ファイルから1行ずつ読み取り、整数に変換して配列に格納
            for (int i = 0; i < test.length; i++) {
                str = br.readLine();
                test[i] = Integer.parseInt(str);
            }

            // 初期値として1番目の点数を最大値・最小値に設定
            int max = test[0];
            int min = test[0];

            // 配列を走査して最大点・最小点を求める
            for (int i = 0; i < test.length; i++) {
                // 点数を出力
                System.out.println(test[i]);

                // 最大値・最小値の更新
                if (max < test[i])
                    max = test[i];
                if (min > test[i])
                    min = test[i];
            }

            // 最終的な結果の出力
            System.out.println("最高点は" + max + "です。");
            System.out.println("最低点は" + min + "です。");

            // ファイルを閉じる
            br.close();

        } catch (IOException e) {
            // ファイル読み込み時のエラー処理
            System.out.println("入出力エラーです。");
        }
    }
}

/*
 * 【課題文】
 * 次のようなファイルを用意しておきます（ファイル名：test2.txt）
 * 
 * 80
 * 68
 * 22
 * 33
 * 56
 * 78
 * 33
 * 56
 * 
 * これは8人の学生のテストの点数をあらわすデータです。
 * このたくさんのデータを読み込んで、成績処理を行うコードを記述してみましょう。
 */