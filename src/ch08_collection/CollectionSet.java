package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * class Name 	: CollectionSet
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 4.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: Set
 */
public class CollectionSet {
	public static void main(String[] args) {
		Set<String> sets = new HashSet<>();
		sets.add("a");
		sets.add("b");
		sets.add("c");
		sets.add("a");
		System.out.println(sets); // 중복 허용 x
		
		for(String str : sets)
		{
			System.out.println(str);
		}
		
		Set<Integer> myLotto = makeLotto();
		ArrayList<Integer> lotto = new ArrayList<>(myLotto);
		Collections.sort(lotto);
		System.out.println(lotto);
	}
	
	public static Set<Integer> makeLotto()
	{
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() <6)
		{
			int num =(int)((Math.random() * 45)+1);
			lotto.add(num);
		}
		return lotto;
	}
}
