//入力された数までの合計を出力するプログラムです。
//ループの蓄積処理の基本を学ぶために作成したものです。

package looping;

import java.io.*;

public class SumFrom1toN {
    public static void main(String[] args) throws IOException
	{
		System.out.println("いくつまでの合計を求めますか？");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		//数を入力させる
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i = 1; i <= num; i ++){
			sum += i;
			//iが入力した数になるまでたし算を繰り返す
		}
		
		System.out.println("1から" + num + "までの合計は" + sum + "です。");
	}
}