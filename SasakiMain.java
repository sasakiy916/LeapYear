import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("西暦と月を入力>>");
		String ym = s.next();
		int[] yms = csvToIntArr(ym);
		System.out.printf("%d年%d月は%d日まであります。",yms[0],yms[1],daysOfMonth(yms[0],yms[1]));
	}

	//文字列をint型配列に変換
	public static int[] csvToIntArr(String csv){
		String[] csvs = csv.split(",");
		int[] yms = new int[csvs.length];
		for(int i=0;i<csvs.length;i++){
			yms[i] = Integer.parseInt(csvs[i]);
		}
		return yms;
	}
	//指定年月の日数
	public static int daysOfMonth(int year, int month){
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)){
			days[1] = 29;
		}
		return days[month-1];
	}
	//うるう年か判定
	public static boolean isLeapYear(int year){
		if(year%400==0 || year%4==0 && year%100!=0){
			return true;
		}
		return false;
	}
}
