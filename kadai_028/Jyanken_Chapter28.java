package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	private Scanner scanner;
	
	public Jyanken_Chapter28(Scanner scanner) {
		this.scanner = scanner;
	}
	//じゃんけんの手を入力
	public String getMyChoice() {
		
		String hand;
		
		//正しい入力(r,s,p)があるまで入力を促す
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう");
			//入力値1行文取得
			hand = scanner.nextLine().trim();
			
		if (hand.equals("r") || hand.equals("s") || hand.equals("p")) {
			return hand;

		} else {
			System.out.println("不正な入力値です。もう一度、じゃんけんの手を入力してください。\n");
		}
		}	
	}
	
	
	public String getRandom() { //じゃんけんの手を乱数で選ぶ
		String[] rand = {"r", "s", "p"};
		int index = (int) Math.floor(Math.random() * 3);
		
		return rand[index];
	}
	
	public void playGame (String user, String computer){ //じゃんけんを行う
		HashMap<String,String> handNameMap = new HashMap<String,String>();
		handNameMap.put("r", "グー");
		handNameMap.put("s", "チョキ");
		handNameMap.put("p", "パー");
		
		String userHandName = handNameMap.get(user);
		String computerHandName = handNameMap.get(computer);
		
		System.out.println("自分の手は" + userHandName + ",対戦相手の手は" + computerHandName);
		
	if(user.equals(computer)) {
		System.out.println("あいこです");
			
		}else if(
				(user.equals("r") && computer.equals("s")) ||
				(user.equals("s") && computer.equals("p")) ||
				(user.equals("p") && computer.equals("r")) 
				
				) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}

}
