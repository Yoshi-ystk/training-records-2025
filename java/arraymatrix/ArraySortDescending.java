// 入力された点数を配列に格納し、降順にソートして出力する
package arraymatrix;

import java.io.*;

public class ArraySortDescending {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

        int[] test = new int[5];
        System.out.println(test.length + "人の点数を入力してください。");

        for (int i = 0; i < test.length; i++) {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }
        // 配列のソートを開始
        for (int s = 0; s < test.length - 1; s++) {
            for (int t = s + 1; t < test.length; t++) {
                if (test[t] > test[s]) {
                    int tmp = test[t];
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }
        // 配列のソートを終了
        for (int j = 0; j < test.length; j++) {
            System.out.println((j + 1) + "番目の人の点数は" + test[j] + "です。");
        }
    }
}
