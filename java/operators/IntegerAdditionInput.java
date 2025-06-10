// キーボードから2つの整数を入力して足し算するプログラム
package operators;

import java.io.*;

public class IntegerAdditionInput {
    public static void main(String[] args) throws IOException
	{
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		//入力した数を変数num1とnum2に記憶させる
		
		System.out.println("足し算の結果は" + (num1+num2) + "です。");
		//num1とnum2の値のたし算した結果を出力する
	}
}