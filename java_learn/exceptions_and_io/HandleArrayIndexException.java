// try-catchを使って配列の範囲外アクセスを処理するサンプル
package java_learn.exceptions_and_io;

public class HandleArrayIndexException {
    public static void main(String[] args) {
        try { // 例外の発生を調べる部分を指定する

            int[] test = new int[5];
            System.out.println("test[10]に値を代入します。");

            test[10] = 80; // 配列要素をこえる例外が発生すると、、、
            System.out.println("test[10]に80を代入しました。");
        } catch (ArrayIndexOutOfBoundsException e) { // このブロックの処理が行われる
            System.out.println("配列の要素をこえています。");
        }
        System.out.println("無事終了しました。");
    }
}