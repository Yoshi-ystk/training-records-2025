// 条件演算子（三項演算子）を使って、入力された数値に応じてコースを選択するプログラム
package java_learn.branching;

import java.io.*;

public class CourseSelectorTernary {
    public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか？");
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char avs = (res == 1) ? 'A' : 'B';
		//if文を条件演算子で書きかえた
		
		System.out.println(avs + "コースを選択しました。");
	}
}