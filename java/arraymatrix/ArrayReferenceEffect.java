// 同じ配列を参照する2つの変数のうち、片方の値を変更した場合の影響を確認する
package arraymatrix;

public class ArrayReferenceEffect {
    public static void main(String[] arge) {

        int[] test1;
        test1 = new int[3];
        System.out.println("test1を宣言しました。");
        System.out.println("配列要素を確保しました。");

        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;

        int[] test2;
        System.out.println("test2を宣言しました。");

        test2 = test1;
        // 配列変数に代入する
        System.out.println("test2にtest1を代入しました。");

        for (int i = 0; i < 3; i++) {
            System.out.println("test1がさす" + (i + 1) +
                    "番目の人の点数は" + test1[i] + "です。");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("test2がさす" + (i + 1) +
                    "番目の人の点数は" + test2[i] + "です。");
        }
        test1[2] = 100;
        // test1を使って配列要素の値を１つ変更する
        System.out.println("test1がさす３番目の人の点数を変更します。");

        for (int i = 0; i < 3; i++) {
            System.out.println("test1がさす" + (i + 1) +
                    "番目の人の点数は" + test1[i] + "です。");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("test2がさす" + (i + 1) +
                    "番目の人の点数は" + test2[i] + "です。");
        }
    }
}
