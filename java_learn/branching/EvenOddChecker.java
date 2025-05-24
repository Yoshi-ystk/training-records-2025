package java_learn.branching;

// 課題：整数を入力させて、偶数か奇数かを判定するプログラム
// 作成日：2025年5月
// 学習内容：BufferedReaderによる入力、if文による分岐処理
import java.io.*;

class EvenOddChecker {
    public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		if(num % 2 == 0){
			System.out.println(num + " は偶数です。");
		} else{
			System.out.println(num + " は奇数です。");
		}
	}
}