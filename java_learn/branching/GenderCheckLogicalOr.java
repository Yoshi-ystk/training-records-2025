//論理演算子 || を使って、複数の条件を組み合わせた判定を行うプログラム
package java_learn.branching;

import java.io.*;

public class GenderCheckLogicalOr {
    	public static void main(String[] args) throws IOException
	{
		System.out.println("あなたは男性ですか？");
		System.out.println("YまたはNを入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		if(res == 'Y' || res == 'y'){
			System.out.println("あなたは男性ですね。");
			//Yまたはyが入力された場合に処理//
		}
		else if(res == 'N' || res == 'n'){
			System.out.println("あなたは女性ですね。");
			//Nまたはnが入力された場合に処理//
		}
		else{
			System.out.println("YまたはNを入力してください。");
			//Y,y,N,n以外が入力された場合に処理//
		}
	}
}
