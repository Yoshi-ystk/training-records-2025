// 足し算・引き算・掛け算・割り算・剰余を使った演算例
package operators;

public class BasicArithmeticOperations {
    public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;
	
		System.out.println("num1とnum2にいろいろな演算を行います。");
		System.out.println("num1+num2は" + (num1+num2) + "です。");
		System.out.println("num1-num2は" + (num1-num2) + "です。");
		System.out.println("num1*num2は" + (num1*num2) + "です。");
		System.out.println("num1/num2は" + (num1/num2) + "です。");
		System.out.println("num1%num2は" + (num1%num2) + "です。");
	}
}