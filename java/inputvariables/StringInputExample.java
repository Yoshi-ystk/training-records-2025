// キーボードから文字列を入力し、表示する基本のサンプル
package inputvariables;

import java.io.*;

public class StringInputExample {
    public static void main(String[] args) throws IOException
	{
		System.out.println("文字列を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		// strは文字列を表す
		
		System.out.println(str + "が入力されました。");
	}
}