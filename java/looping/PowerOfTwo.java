// 1から7までのループを使って、2を7回かけて「2の7乗」の値を求めるサンプルプログラム
package looping;

public class PowerOfTwo {
    public static void main(String[] args) {
	int num = 1;
    
        for(int i = 1; i <= 7; i++){
		num *= 2;
	    }
	System.out.println("2の7乗は" + num + "です。");
	}
}