// Integerラッパークラスを使ってArrayListに数値を格納・表示するプログラム
package java_learn.collections_and_generics;

import java.util.ArrayList;

public class IntegerListExample {
    public static void main(String[] args) {
        // Integer型のArrayListを作成
        ArrayList<Integer> points = new ArrayList<Integer>();

        // int値を追加（オートボクシングでIntegerに変換される）
        points.add(10);
        points.add(80);
        points.add(75);

        // 拡張for文でArrayListの各要素を表示
        for (int i : points) {
            System.out.println(i);
        }
    }
}