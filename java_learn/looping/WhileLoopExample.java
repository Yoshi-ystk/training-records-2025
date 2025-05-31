// whileループを使って「〜番目の繰り返しです。」と5回表示するプログラム
package java_learn.looping;

public class  WhileLoopExample {
    public static void main(String[] arge)
	{
		int i = 1;
		
		while(i <= 5){
		//条件がtrueの場合に//
			System.out.println(i + "番目の繰り返しです。");
			//このブロック内が順に繰り返される//
			i++;
			//条件がfalseに近づくようにインクリメントしている//
		}
		
		System.out.println("繰り返しが終わりました。");
	}
}