// equals()メソッドを使ってインスタンス同士の等価性を比較する
package inheritance;

//車クラス
class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}

class EqualsMethodDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);

        System.out.println("car1とcar2が同じか調べたところ"
                + bl1 + "でした。");
        System.out.println("car1とcar3が同じか調べたところ"
                + bl2 + "でした。");
    }
}
