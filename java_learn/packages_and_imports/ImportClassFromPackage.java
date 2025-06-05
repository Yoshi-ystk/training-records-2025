package java_learn.packages_and_imports;

// Carクラス（本来は package pc に保存され、public クラスとして定義されていた）
// 公開用に本ファイルに統合しているため public 修飾子は外しています
class Car{ //Carクラスをほかのパッケージから利用できるようにpublicにする
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を"
			+ gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("車のガソリン量は" + gas + "です。");
	}
}

// 本来の構成では import 文を使って pc パッケージの Car クラスを利用していました
// このファイルではパッケージを統合しているため import 文は不要です（学習用にそのまま残しています）
// import pc.Car; //インポートすると、、、

class ImportClassFromPackage{
	public static void main(String[] args){
        // 本来は pc.Car car1 = new pc.Car(); もしくは import を使って Car car1 = new Car(); とする形式
		// 今回はファイル統合のため、シンプルな形式で記述しています
		Car car1 = new Car();
		car1.show();
	}
}