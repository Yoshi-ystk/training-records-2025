// 国語と算数の点数を二次元配列に格納して出力するプログラム
package arraymatrix;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] test;
        test = new int[2][5];
        // 科目×人数分の値を格納する配列を準備

        test[0][0] = 80;
        test[0][1] = 60;
        test[0][2] = 22;
        test[0][3] = 50;
        test[0][4] = 75;
        test[1][0] = 90;
        test[1][1] = 55;
        test[1][2] = 68;
        test[1][3] = 72;
        test[1][4] = 58;
        // ２次元配列の要素に１つずつ値を代入

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) +
                    "番目の人の国語の点数は" + test[0][i] + "です。");
            System.out.println((i + 1) +
                    "番目の人の算数の点数は" + test[1][i] + "です。");
        }
    }
}
