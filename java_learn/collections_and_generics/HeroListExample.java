package java_learn.collections_and_generics;

// 練習１: 次のようなHeroクラスがあります。
// ２人の勇者(斎藤、鈴木)をHeroとしてインスタンス化してArrayListに格納し、
// １人ずつ順番に取り出して名前を表示するプログラムを作成してください。

import java.util.*;

// 勇者（Hero）クラスの定義
class Hero {
    private String name;

    // コンストラクタで名前を設定
    public Hero(String name) {
        this.name = name;
    }

    // 名前を取得するメソッド
    public String getName() {
        return this.name;
    }
}

public class HeroListExample {
    public static void main(String[] args) {

        // Heroインスタンスの生成
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        // Heroオブジェクトを格納するArrayListを作成
        List<Hero> heroes = new ArrayList<Hero>();

        // リストにHeroを追加
        heroes.add(h1);
        heroes.add(h2);

        // 拡張for文でリストからHeroを順番に取り出して名前を表示
        for (Hero h : heroes) {
            System.out.println(h.getName());
        }
    }
}