// このプログラムは、キーボードから整数を入力し、
// 入力された値が「1」であった場合と、それ以外の場合で異なるメッセージを表示するプログラムです。
// 「if～else文」を使用して、条件に応じた2つの分岐処理を行う基本構造を学ぶためのものです。
package java_learn.branching;

import java.io.*;

public class IfElseBasic {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		if(res == 1){
			System.out.println("1が入力されました。");
			//1が入力された場合(条件がtrueの場合)に処理される
		}
		else{
			System.out.println("1以外が入力されました。");
            //1以外が入力された場合(条件がfalseの場合)に処理される
		}
	}
}
