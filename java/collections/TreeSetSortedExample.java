// TreeSetに格納した文字列が自然順（辞書順）で自動的にソートされることを確認するプログラム
package collections;

// === TreeSetから文字列を取り出すと… ===
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortedExample {
    public static void main(String[] args) {
        // TreeSetを使用すると、要素は自動的に昇順（文字列なら辞書順）に並べ替えられる
        Set<String> words = new TreeSet<String>();

        // 単語をセットに追加（順不同で追加しても…）
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");

        // TreeSetに格納された順番で出力（自然順＝辞書順に整列される）
        for (String s : words) {
            System.out.println(s + "→");
        }
    }
}

// 実行結果
// cat→dog→panda→wolf→