// finallyブロックの動作を確認するサンプルプログラム
package java_learn.exceptions_and_io;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int[] test = new int[5];
            System.out.println("test[10]に値を代入します。");

            test[10] = 80; // 配列要素をこえる例外が発生
            System.out.println("test[10]に80を代入しました。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の要素をこえています。");

            // 例外が発生してもしなくても、必ず実行されるブロック
        } finally {
            System.out.println("最後に必ずこの処理をします。");
        }
        System.out.println("無事終了しました。");
    }
}