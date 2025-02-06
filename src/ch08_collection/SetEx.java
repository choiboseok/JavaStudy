package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		ArrayList<Set<Integer>> result = happyLotto(cnt);
		
		for(Set<Integer> sets: result)
		{
			ArrayList<Integer> lotto = new ArrayList<>(sets);
			Collections.sort(lotto);
			System.out.println(lotto);
		}
	}
	
	public static ArrayList<Set<Integer>> happyLotto(int size)
	
	{
		ArrayList<Set<Integer>> lottolist = new ArrayList<>();  
				
		for(int i=0; i<size; i++) 
		{
			lottolist.add(makeLotto());
		}
		
		return lottolist;
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
