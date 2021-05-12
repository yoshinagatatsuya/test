package jp.co.aforce.test;

import java.util.Calendar;

public class PracticeTest4 {
	public static void main(String args[]) {
		//２番str２＝str２＋cをしているるから
		String[] animal= {"犬","猫","兎","へび"};
		String name ="ライオン";
		System.out.println(name+"はリストに含まれません"); 
		Calendar calendar = Calendar.getInstance();
		String dayOfMonth = null;
		int a=3;
		
		switch (a) {

		
	case 1:
		dayOfMonth = "元日，成人式";
	break;
	case 2:
		dayOfMonth = "建国記念日，天皇誕生日";
	break;
	case 3:
		dayOfMonth = "春分の日";
	break;
	case 4:
		dayOfMonth = "昭和の日";
	break;
	case 5:
		dayOfMonth = "憲法記念日，緑の日，子供の日";
	break;
	case 6:
		dayOfMonth = "なし";
	break;
	case 7:
		dayOfMonth = "海の日，スポーツの日";
	break;
	case 8:
		dayOfMonth = "山の日";
	break;
	case 9:
		dayOfMonth = "敬老の日，秋分の日";
				
	break;
	case 10:
		dayOfMonth = "なし";
	break;
	case 11:
		dayOfMonth = "文化の日，勤労感謝の日";
				
	break;
	case 12:
		dayOfMonth = "なし";
	break;
		}
	System.out.println("私の誕生日の月は"+ dayOfMonth +"があります");
	//switch文の方が書きやすかった
				
		}
	}


