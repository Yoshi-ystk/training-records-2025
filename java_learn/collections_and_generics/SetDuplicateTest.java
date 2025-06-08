// Setに重複した値を追加すると無視されることを確認するプログラム
package java_learn.collections_and_generics;

// === Setに重複した値を追加しようとすると… ===
import java.util.HashSet;
import java.util.Set;

public class SetDuplicateTest {
    public static void main(String[] args) {
        // Setは重複を許さないコレクション（順序も保持されない）
        Set<String> colors = new HashSet<String>();

        // 色の名前を追加（この時点でSetには「赤」「青」「黄」が格納される）
        colors.add("赤");
        colors.add("青");
        colors.add("黄");

        // すでに存在する「赤」を再度追加（Setでは無視される）
        colors.add("赤");

        // 格納されたユニークな色の数を表示（重複は無視されるため3になる）
        System.out.println("色は" + colors.size() + "種類");
    }
}