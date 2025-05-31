// double型の値をint型にキャストして代入する例
package java_learn.operators_and_casting;

public class CastDoubleToInt {
    public static void main(String[] arge)
	{
		double dnum = 160.5;
		
		System.out.println("身長は" + dnum + "センチです。");
		
		System.out.println("int型の変数に代入します。");
		
		// int inum = dnum; 
		//小さなサイズの型には代入できない
		
		int inum = (int)dnum;
		// ()内で変換する型を指定する。「キャスト演算子」
		//ただし、その型であらわせない部分は切り捨てられる。
		//「160.5」という値は小数点以下が切り捨てられ「160」という整数になる
		
		System.out.println("身長は" + inum + "センチです。");
	}
}