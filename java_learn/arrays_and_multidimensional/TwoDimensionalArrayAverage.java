// 各生徒の教科ごとの点数を二次元配列に格納し、平均点を計算するプログラム
package java_learn.arrays_and_multidimensional;

public class TwoDimensionalArrayAverage {
    public static void main(String[] args) {
        int[][] test = {
                { 80, 60, 22, 50 }, { 90, 55, 68, 72 }, { 33, 75, 63 }
        };
        for (int i = 0; i < test.length; i++) {
            int sum = 0;
            for (int j = 0; j < test[i].length; j++) {
                sum = sum + test[i][j];
            }
            System.out.println((i + 1) +
                    "番目の人の平均点は" + (sum / test[i].length) + "です。");
        }
    }
}