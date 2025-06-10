// わり算の際にキャストして小数として出力する例
package operators;

public class DivideWithCasting {
    public static void main(String[] arge)
	{
		int num1 = 5;
		int num2 = 4;
		
		// double div = num1 / num2;
		//5÷4を計算したいが、1.25という出力を得るためには
		//少なくとも一方をdouble型に変換する必要がある
		
		double div = (double)num1 / (double)num2;
		System.out.println("5/4は" + div + "です。");
		//わり算の部分をキャスト演算子を使って変数numをdouble型に変換する
	}
}