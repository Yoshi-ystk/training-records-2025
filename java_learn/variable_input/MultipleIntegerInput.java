// 整数を2つ入力して、それぞれを出力するサンプル
package java_learn.variable_input;

import java.io.*;

public class MultipleIntegerInput {
    public static void main(String[] args) throws IOException
	{
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		//数値に変換してnum1とnum2に格納する
		
		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に" + num2 + "が入力されました。");
	}
}