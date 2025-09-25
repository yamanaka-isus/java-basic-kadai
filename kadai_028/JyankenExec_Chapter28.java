package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		//Scannerをmainで作成し、mainで閉じる
		Scanner scanner = new Scanner(System.in);
		
		//じゃんけんクラスのインスタンス作成
		Jyanken_Chapter28 jyanChap28 = new Jyanken_Chapter28(scanner);
		
		//自分のじゃんけんの手を入力する
		String user = jyanChap28.getMyChoice();
		
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String computer = jyanChap28.getRandom();
		
		//じゃんけんの結果を出力する
		jyanChap28.playGame(user, computer);
		
		//Scannerを閉じる
		scanner.close();

	}

}