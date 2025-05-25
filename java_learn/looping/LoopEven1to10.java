// 課題：1～10までの偶数を出力させるプログラム
// 作成日：2025年5月
// 学習内容：Javaの繰り返し処理の基本と条件分岐
package java_learn.looping;
public class LoopEven1to10 {
    public static void main(String[] args)
	{
		System.out.println("1～10の偶数を出力します。");
		
		for(int i = 1; i <= 10; i++){
			if((i % 2) == 0){
                System.out.println(i);
            }
		}
	}
}