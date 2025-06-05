// 例外が発生した際に処理が止まる動作を確認するサンプルプログラム
package java_learn.exceptions_and_io;

public class ExceptionNotHandledExample {
    public static void main(String[] args) {
        int[] test;
        test = new int[5];
        System.out.println("test[10]に値を代入します。");

        test[10] = 80; // 配列要素の数をこえているため例外がおきます
        // 例外が発生すると、ここから下の処理は行われません。
        System.out.println("test[10]に80を代入しました。");
        System.out.println("無事終了しました。");
    }
}