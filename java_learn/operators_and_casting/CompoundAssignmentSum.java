// 複合代入演算子 (+=) を使って合計を求めるサンプル
package java_learn.operators_and_casting;

import java.io.*;

public class CompoundAssignmentSum {
    public static void main(String[] args) throws IOException
	{
		System.out.println("整数を3つ入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		//複合的な代入演算子を使っている
		
		System.out.println("3つの数の合計は" + sum + "です。");
	}
}
