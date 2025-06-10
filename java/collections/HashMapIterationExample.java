package collections;

// HashMapに格納された情報を1件ずつ取り出して表示するプログラム

import java.util.*;

public class HashMapIterationExample {
	public static void main(String[] args) {
		// 都道府県と人口（万人）を格納するマップを作成
		Map<String, Integer> prefectures = new HashMap<String, Integer>();
		
		// 各都道府県とその人口をマップに追加
		prefectures.put("京都府", 255);
		prefectures.put("東京都", 1261);
		prefectures.put("熊本県", 181);
		
		// マップからキー一覧を取り出し、1件ずつループで処理
		for (String key : prefectures.keySet()) { // 県名（キー）を順番に取得
			int value = prefectures.get(key);    // キーを使って対応する値（人口）を取得
			System.out.println(key + "の人口は、" + value); // 結果を出力
		}
	}
}