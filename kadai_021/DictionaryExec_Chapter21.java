package kadai_021;


import java.util.Arrays;
import java.util.List;


public class DictionaryExec_Chapter21 extends Dictionary_Chapter21{

	public static void main(String[] args) {
		
		List<String> keysToSearch = Arrays.asList("apple","banana","grape","orange"); //String型リストを作成、値を代入
		
		Dictionary_Chapter21 dictChap21 = new Dictionary_Chapter21(); //インスタンス化
		dictChap21.searchByKeys(keysToSearch); //インスタンスdeictChap21のsearchByKeysを呼び出し、リストの値を渡す。

	}

}
