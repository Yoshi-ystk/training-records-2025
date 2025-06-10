// 後置インクリメント演算子の挙動を確認するサンプル
package operators;

public class PostIncrementExample {
    public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
	
		b = a++;
		//後置インクリメント演算子を使う
		System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
	}
}
