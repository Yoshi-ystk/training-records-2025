// 変数の代入と、変数間の値のコピーを学ぶサンプル
package inputvariables;

public class VariableAssignment {
    public static void main(String[] args)
	{
		int num1, num2;
		
		num1 = 3;
		
		System.out.println("変数num1の値は" + num1 + "です。");
		
		num2 = num1;
		
		System.out.println("変数num1の値をnum2に代入しました。");
		System.out.println("変数num2の新しい値は" + num2 + "です。");
	}
}