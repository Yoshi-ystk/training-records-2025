// このプログラムは、キーボードから整数を入力し、
// 入力された値が「1」であった場合にメッセージを表示するプログラムです。
// 「if文」だけを使用した、条件分岐の基本を学ぶためのもので、
// 「else」などの拡張構文は使用していません。
package branching;

import java.io.*;

public class IfOnlyExample {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		//変数resにキーボードからの入力を格納
		
		if(res == 1)
		//1が入力された場合、この条件がtrueとなり
			System.out.println("1が入力されました。");
		//この文が処理される
		
		System.out.println("処理を終了します。");
	}
}