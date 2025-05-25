package java_learn.branching;
//年代を入力、閏年か否かを判定//
//条件1.年が4で割り切れる場合→閏年//
//条件2.年が100で割り切れて、400で割り切れない年→平年//
import java.io.*;

class LeapYearChecker
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("年代を入力してください。");
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in,"Shift_jis"));
		
		String str = br.readLine();
		
		int year = Integer.parseInt(str);
		
		if(year % 4 == 0){
			if(year % 100 == 0 && year % 400 != 0){
			//ifの中にifは例外処理//
				System.out.println("平年です。");
			} else{
				System.out.println("閏年です。");
			}
		} else{
		System.out.println("平年です。");
		}
	}
}