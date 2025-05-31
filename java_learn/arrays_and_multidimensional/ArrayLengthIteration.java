// 配列の長さを使ってループ処理し、点数を出力するプログラム
package java_learn.arrays_and_multidimensional;

public class ArrayLengthIteration {
    public static void main(String[] arge) {

        int[] test = { 80, 60, 22, 50, 75 };

        for (int i = 0; i < test.length; i++) {
            // .lengthを使うとコードの訂正が楽になる
            System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
        }
        System.out.println("テストの受験者は" + test.length + "人です。");
    }
}