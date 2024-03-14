package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	public void dictionary() {
	//HashMapの宣言
	HashMap<String, String> map = new HashMap<String, String>();
	
	
	//要素の追加
	map.put("apple", "りんご");
	map.put("peach","桃");
	map.put("banana","バナナ");
	map.put("lemon","レモン");
	map.put("pear","梨");
	map.put("kiwi","キウイ");
	map.put("strawberry","いちご");
	map.put("grape","ぶどう");
	map.put("muscat","マスカット");
	map.put("cherry","さくらんぼ");
	
	String[] keyword = new String[4];
	keyword[0] = "apple";
	keyword[1] = "banana";
	keyword[2] = "grape";
	keyword[3] = "orange";
	
	
	//辞書を調べる処理
	for(String word : keyword) {
		boolean exist = map.containsKey(word);
		if(exist) {
			System.out.println(word + "の意味は" + map.get(word));
		}
		
		else {
			System.out.println(word + "は辞書に存在しません");
		}
		
		
		
	}
	
	}
	

	//コンストラクタ
	public Dictionary_Chapter21() {
		
	}
}
