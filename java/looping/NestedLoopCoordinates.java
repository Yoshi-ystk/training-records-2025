//ループの入れ子構造を理解し、2次元的な繰り返し処理の動作を学ぶための基本的なコードです。
package looping;

public class NestedLoopCoordinates {
    public static void main(String[] arge)
	{
		for(int i = 1; i < 9; i++){
			for(int j = 1; j < 9; j++){
				System.out.println("iは" + i + ":jは" + j);
			}
		}
	}
}