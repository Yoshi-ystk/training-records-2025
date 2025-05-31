//ループによる数値入力と累積処理の基本を学ぶ目的で作成したプログラムです。
// このプログラムは、ユーザーから10回整数を入力させ、その平均値を計算して表示します。
package java_learn.looping;

import java.io.*;

public class AverageCalculator {
    public static void main(String[] args) throws IOException{
		System.out.println("整数を10回入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		int avg = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++){
			String str = br.readLine();
			int a = Integer.parseInt(str);
			sum = sum+a;
		}
			avg = sum / 10;
			System.out.println("平均値は" + avg + "です。");
	}
}