// EmployeeクラスとManagerクラスの継承関係を使って業務内容を表示するプログラム
// ※Javaの課題として出題された問題への解答です。
// 問題文はファイルの最下部にコメントとして記載しています。
package java_learn.inheritance_and_override;

//従業員クラス
class Employee {
    String name;

    public void operation() {
        System.out.println(this.name + "は通常業務を行います。");
    }
}

// 管理者クラス
class Manager extends Employee {
    public void management() {
        System.out.println(this.name + "は管理業務を行います。");
    }
}

// Mainクラス
public class EmployeeManagerExample {
    public static void main(String[] args) {
        Employee taro = new Employee();
        taro.name = "タロウ";

        Manager hanako = new Manager();
        hanako.name = "ハナコ";

        taro.operation();
        hanako.operation();
        hanako.management();
    }
}
/*
【課題】下の仕様に基づいて、各クラスを作成してください。

（仕様）
● 従業員を表すクラス Employee を作成してください。
- フィールドを作成する。表示名を表す name を String型で宣言します。
- operation メソッドを作成する（引数：なし、戻り値：なし）
　→ 処理内容：「xxxは通常業務を行います。」と表示する。

● 従業員の管理者を表す Manager クラスを、Employee クラスを継承して作成してください。
- management メソッドを作成する（引数：なし、戻り値：なし）
　→ 処理内容：「xxxは管理業務を行います。」と表示する。

【実行結果】
タロウは通常業務を行います。
ハナコは通常業務を行います。
ハナコは管理業務を行います。
*/