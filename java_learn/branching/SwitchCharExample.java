//switch 文を使って、入力された文字が 'a' または 'b' であるかを判定するプログラム
package java_learn.branching;

import java.io.*;

public class SwitchCharExample {
	public static void main(String[] args) throws IOException
	{
		System.out.println("aかbを入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		char res = str.charAt(0); 
		
		switch(res){
			case 'a': //コロン//
				System.out.println("aが入力されました。");
				break; //breakがないとcaseが分かれない
			case 'b':
				System.out.println("bが入力されました。");
				break;
			default:
				System.out.println("aかbを入力してください。");
				break;
		}
	}
}