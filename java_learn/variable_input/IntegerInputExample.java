// 入力された文字列を整数に変換し、変数に格納して出力するサンプル
package java_learn.variable_input;

import java.io.*;

public class  IntegerInputExample {
    public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		//入力した文字列をあらわす「str」を整数に変換して
		//int型(数値)の変数numに読み込む
		
		System.out.println(num + "が入力されました。");
	}
}