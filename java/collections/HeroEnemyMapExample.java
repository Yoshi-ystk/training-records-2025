// Heroオブジェクトと倒した敵の数をHashMapで管理・表示するプログラム
package collections;

// 練習２: 練習１の２人の勇者をインスタンス化し、それぞれの勇者が倒した敵の数(3,7)と
// 勇者をペアでコレクションに格納してください。次に１つずつ取り出し、
// 「斎藤が倒した敵＝3」「鈴木が倒した敵＝7」のような画面表示を行ってください(表示順は不問)。

import java.util.*;

// 勇者（Hero）クラスの定義
class Hero {
    private String name;

    // コンストラクタで勇者の名前を設定
    public Hero(String name) {
        this.name = name;
    }

    // 名前を取得するgetterメソッド
    public String getName() {
        return this.name;
    }
}

public class HeroEnemyMapExample {
    public static void main(String[] args) {

        // Heroインスタンスの作成
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        // Heroと倒した敵の数（Integer）を対応させて保持するMapを作成
        Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();

        // 勇者とそれぞれが倒した敵の数をMapに登録
        heroes.put(h1, 3);
        heroes.put(h2, 7);

        // Mapからキー（Heroオブジェクト）を1つずつ取り出して値とともに表示
        for (Hero key : heroes.keySet()) {
            int value = heroes.get(key); // キーに対応する値を取得
            System.out.println(key.getName() + "が倒した敵＝" + value);
            // getName()を使うことでHeroオブジェクトから名前を取得して表示できる
        }
    }
}