package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//説明文メソッド
	public void demo() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpapperのpを入力しましょう");
	}
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String myChoice = scanner.next();
		String choice1 = new String("r");
		String choice2 = new String("s");
		String choice3 = new String("p");
		
		//入力値が正しいか判定する
		if((myChoice.equals(choice1)) ||
		   (myChoice.equals(choice2)) ||
		   (myChoice.equals(choice3)) ){
			scanner.close();
		}
		
		else {
			System.out.println("入力が正しくありません");
			System.out.println("もう一度やり直してください");
		
		}
		
		return myChoice;
		
	}
		
		
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		//配列を作成しじゃんけんの手をセットする
		String[] comCard = new String[3];
		comCard[0] = "r";
		comCard[1] = "s";
		comCard[2] = "p";
		
		//乱数を取得
		String comchoice = comCard[(int)Math.floor(Math.random() * 3)];
		
		return comchoice;
	}
	//じゃんけんを行うメソッド
	public void playGame() {
		//じゃんけんの手を出力する
		HashMap<String, String> choiceMap = new HashMap<String, String>();
		
		choiceMap.put("r", "グー");
		choiceMap.put("s", "チョキ");
		choiceMap.put("p", "パー");
		
		String mine = getMyChoice();
		String com = getRandom();
		
		System.out.println("自分の手は" + choiceMap.get(mine) + ",対戦相手の手は" + choiceMap.get(com));
		
		//じゃんけんの結果を出力する
		if(mine.equals(com)) {
			System.out.println("あいこです");
		}
		else if((mine.equals("r") && com.equals("s")) ||
				(mine.equals("s") && com.equals("p")) ||
				(mine.equals("p") && com.equals("r")) ){
					System.out.println("自分の勝ちです");
				}
		else {
			System.out.println("自分の負けです");
		}
			
		
	}
	

}
