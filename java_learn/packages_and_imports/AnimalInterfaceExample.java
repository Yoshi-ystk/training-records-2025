// Animalインターフェースを使ってDogとCatの鳴き声を出力する練習問題
package java_learn.packages_and_imports;

// Animalインターフェースの定義
// 動物の共通動作「鳴く」をmakeSoundメソッドとして定義する
interface Animal {
    void makeSound();
}

// Animalインターフェースを実装したDogクラス
// makeSoundメソッドをオーバーライドして犬の鳴き声を出力する
class Dog implements Animal {
    public void makeSound() {
        System.out.println("ワンワン");
    }
}

// Animalインターフェースを実装したCatクラス
// makeSoundメソッドをオーバーライドして猫の鳴き声を出力する
class Cat implements Animal {
    public void makeSound() {
        System.out.println("ニャー");
    }
}

// 実行クラス
public class AnimalInterfaceExample {
    public static void main(String[] args) {
        // Animal型の配列を用意（インターフェース型を利用した多態性の活用）
        Animal[] animals = new Animal[2];

        // Dogインスタンスを代入
        animals[0] = new Dog();

        // Catインスタンスを代入
        animals[1] = new Cat();

        // 配列をループしてすべての動物の鳴き声を出力
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}
/*
 * 【学習課題】
 * 練習問題: 動物の鳴き声インターフェース
 * - Animalというインターフェースを作成し、makeSound()メソッドを定義してください。
 * - DogとCatクラスを作成して、それぞれAnimalを実装してください。
 * - Dogは「ワンワン」、Catは「ニャー」と表示するようにしてください。
 * - mainメソッドでAnimal型の配列を使って、すべての動物の鳴き声を出力してください。
 */