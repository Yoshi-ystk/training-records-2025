// このプログラムは、キーボードから整数を入力し、
// 入力された値が「1」「2」「それ以外」の3通りに応じて異なるメッセージを表示するプログラムです。
// 「if～else if～else文」を使用して、複数の条件分岐を行う方法を学ぶためのものです。
package java_learn.branching;

import java.io.*;

public class IfElseIfExample {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res == 1){
			System.out.println("1が入力されました。");
			//1が入力された場合に処理される
		}
		else if(res == 2){
			System.out.println("2が入力されました。");
			//2が入力された場合に処理される
		}
		else{
			System.out.println("1か2を入力してください。");
			//1または2以外が入力された場合に処理される
		}
	}
}