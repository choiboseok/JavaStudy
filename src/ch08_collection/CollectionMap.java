package ch08_collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * class Name 	: CollectionMap
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 5.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: Map
 */
public class CollectionMap {
	public static void main(String[] args) {
		// 데이터 구조 중 가장 많이 사용된다.
		// 기준을 가지고 데이터를 정리할경우 Map을 사용
		HashMap<String, String> stuMap = new HashMap<>();
		
		stuMap.put("첫째", "길동");
		stuMap.put("둘째", "동길");
		stuMap.put("셋째", "길수");
		System.out.println(stuMap);
		System.out.println(stuMap.get("둘째"));
		stuMap.put("둘째", "동수");
		System.out.println(stuMap.size());
		System.out.println(stuMap.containsKey("첫째")); //key가 있으면 true
		System.out.println(stuMap.containsValue("동길")); //value가 있으면 true
		
		Set<String> keys = stuMap.keySet();
		System.out.println(keys);
		for(String key: keys)
		{
			System.out.println(stuMap.get(key));
		}
		
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		for(Entry<String, String> entry: entrySet)
		{
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 142872834);
		coinMap.put("이더리움", 3468439);
		
		for(String coin: coinMap.keySet())
		{
			System.out.println(coin + ":" + coinMap.get(coin));
		}
		
	}
}