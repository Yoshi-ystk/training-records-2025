// 身長と体重を入力し、浮動小数点型(double)として表示するサンプル
package java_learn.variable_input;

import java.io.*;

public class DoubleInputExample {
    public static void main(String[] args) throws IOException
	{
		System.out.println("身長と体重を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("身長は" + num1 + "センチです。");
		System.out.println("体重は" + num2 + "キロです。");
	}
}