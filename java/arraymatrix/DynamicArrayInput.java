// 受験者数に応じて配列を動的に作成し、点数を入力・出力するプログラム
package arraymatrix;

import java.io.*;

public class DynamicArrayInput {
	public static void main(String[] args) throws IOException {
		System.out.println("テストの受験者数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Shift_jis"));

		String str = br.readLine();
		int num = Integer.parseInt(str);
		// 配列要素の数を入力させる

		int[] test;
		test = new int[num];
		// 必要な数だけ配列要素を準備する

		System.out.println("人数分の点数を入力してください。");

		for (int i = 0; i < num; i++) {
			str = br.readLine();
			// キーボードから必要な数だけ点数を入力させる
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
			// 要素配列に点数を格納する
		}
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
			// 配列要素の値を出力する
		}
	}
}