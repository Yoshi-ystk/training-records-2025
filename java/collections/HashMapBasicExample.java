// HashMapに都道府県と人口のペアを格納・更新・取得するプログラム
package collections;

// HashMapを使用するためにjava.utilパッケージをインポート
import java.util.*;

public class HashMapBasicExample {
	public static void main(String[] args) {
		// HashMapを生成（キーは都道府県名、値は人口（万人））
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		
		// putメソッドで都道府県と人口のペアを登録
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		// getメソッドで指定したキーの値を取得
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);

		// removeメソッドで指定したキーとその値を削除
		prefs.remove("京都府");

		// すでに存在するキーに対してputすると値が上書きされる
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
	}
}