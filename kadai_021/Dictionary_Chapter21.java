package kadai_021;

import java.util.HashMap;
import java.util.List;

public class Dictionary_Chapter21 {

	HashMap<String, String> dic = new HashMap<String, String>();

	public Dictionary_Chapter21() { //要素を追加するメソッド

		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana", "バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscut", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}

	public void searchByKeys(List<String> keys) { //String型のリストをkeysとして受け取る
		for (String key : keys) { //受け取ったkeysをkeyへ代入してループ
			if (dic.containsKey(key)) { //Map(dic)に存在するか判定
				System.out.println(key + "の意味は" + dic.get(key));
			} else {
				System.out.println(key + "は辞書に存在しません");
			}
		}
	}

}