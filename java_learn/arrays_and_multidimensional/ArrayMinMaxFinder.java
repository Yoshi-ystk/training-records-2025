// 配列の中から最大値と最小値を見つけて出力するプログラム
package java_learn.arrays_and_multidimensional;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        int[] test = { 48, 65, 23, 88, 73 };
        
        int test_max = test[0];
        int test_min = test[0];
        
        for (int i = 0; i < test.length; i++) {
            if (test_max < test[i]) {
                test_max = test[i];
            }
            if (test_min > test[i]) {
                test_min = test[i];
            }
        }
        System.out.println("最大値は" + test_max + "最小値は" + test_min + "です。");
    }
}