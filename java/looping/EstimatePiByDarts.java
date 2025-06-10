//正方形内にダーツをランダムに投げ、円の中に落ちた割合から円周率（π）を推定するプログラムを作成する課題でした。
//問題文は最下部に記載してあります。
package looping;

import java.io.*;

public class EstimatePiByDarts {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		int total = 0;
		int inside = 0;
		
		try{
			System.out.println("投げる回数を入力してください");
			String line = br.readLine();
			total = Integer.parseInt(line);
			
			for (int i = 0; i < total; i++){
				double x = Math.random();
				double y = Math.random();
				
				if (x * x + y * y <=1.0){
					inside++;
				}
			}
			double pi = 4.0 * inside / total;
			System.out.println("円周率: " + pi);
			
		}catch (NumberFormatException e) {
			System.out.println("数値を正しく入力してください。");
		}catch (IOException e) {
			System.out.println("入力エラーです。");
		}
	}
}
/*
練習問題: 一辺の長さが１の正方形に半径１の４分の１円が入っているとします。
この中に、次々とダーツを投げて円の中に入った数を勘定します。
投げるダーツのうちで円の中に入るダーツの個数の割合は、正方形の面積と４分の１円の面積と同じ割合です。
つまり、円の中に入ったダーツの数(nc)/投げたダーツの総数(n)=４分の１円の面積/正方形の面積です。
沢山、ダーツを投げれば投げるほどこの値は一定になります。これを使って円周率を求めることができます。
π=4*nc/nとなるからです。
ダーツを投げるには、`Math.random()[0.0,1.0]`の範囲の浮動小数点を生成、
投げたダーツが正方形の中に落ちる位置(x,y)をそれぞれ乱数で与えます。
そして、x2+y2が１より小さければ円の中に落ちたことになるので、ncを１増やします。
ダーツを投げる回数を入力して、円周率を求めるプログラムを作成してください。
*/