// 引数不足・数値でない場合の例外を複数catchで処理するコマンドライン引数プログラム
package java_learn.cmd_args_and_files;

public class MultiCatchArgsExample {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            System.out.println("x + y = " + (x + y));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("引数の数が足りません");
        } catch (NumberFormatException e) {
            System.out.println("引数はそれぞれ数値でなければいけません");
        }
    }
}