//入力された回数だけ `*` を出力する単純な繰り返し処理の練習プロフラム。
package java_learn.looping;

import java.io.*;

class AsteriskPrinter
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("いくつ*を出力しますか？");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		//数を入力させる//
		int num = Integer.parseInt(str);
		
		for(int i = 1; i <= num; i ++){
			System.out.println("*");
			//入力した数だけ*を繰り返し出力//
		}
	}
}