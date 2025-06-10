// 正方形の辺の長さを入力して面積を計算するプログラム
package operators;

import java.io.*;

public class SquareAreaCalculator {
    public static void main(String[] args) throws IOException
	{
		System.out.println("正方形の辺の長さを入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		
		int num1 = Integer.parseInt(str);
		
		System.out.println("正方形の面積は" + (num1*num1) + "です。");
	}
}