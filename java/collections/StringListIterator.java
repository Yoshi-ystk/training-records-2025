// Iteratorを使ってArrayListの文字列を順に表示するプログラム
package collections;

// === イテレータを使った ArrayList の繰り返し処理 ===

import java.util.*;

public class StringListIterator {
    public static void main(String[] args) {
        // String型の要素を格納するArrayListを作成
        ArrayList<String> names = new ArrayList<String>();

        // 要素の追加（addメソッドで名前を追加）
        names.add("湊");
        names.add("朝香");
        names.add("菅原");

        // イテレータ（Iterator）を取得して、リストの走査準備
        Iterator<String> it = names.iterator();

        // イテレータを使ってリスト内の全要素を順に取り出し表示
        while (it.hasNext()) { // 次の要素が存在するかを確認
            String e = it.next(); // 次の要素を取得
            System.out.println(e); // 取得した要素を表示
        }
    }
}