//1〜9までの数字を掛け合わせた九九表を表示するプログラムです。
package java_learn.looping;

public class MultiplicationTable {
    public static void main(String[] arge)
	{
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++){
				System.out.print(i * j + "\t");
			}
			System.out.print("\n");
		}
	}
}