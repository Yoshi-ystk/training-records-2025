// 変数に値を代入して足し算する基本的なサンプル
package java_learn.operators_and_casting;

public class VariableAddition {
    public static void main(String[] args)
	{
		int num1 = 2;
		int num2 = 3;
		int sum = num1+num2;
		//num1+num2の値をsumに代入する
		
		System.out.println("変数num1の値は" + num1 + "です。");
		System.out.println("変数num2の値は" + num2 + "です。");
		System.out.println("num1+num2の値は" + sum + "です。");
	
		num1 = num1+1;
		//num1+1の値をnum1に代入する
		
		System.out.println("変数num1の値に1をたすと" + num1 + "です。");
	}
}
