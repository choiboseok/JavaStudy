package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class Result03 {
	public static void main(String[] args) {
		String [] userNum = {"2", "12"};
		System.out.println(makeLotto(userNum));
	}
	public static ArrayList<Integer> makeLotto(){ // 자동추첨
		ArrayList<Integer> numbers = new ArrayList<>();
		String [] arr = new String[0];
		numbers = makeLotto(arr);
		return numbers;
		
	}
	public static ArrayList<Integer> makeLotto(String[] arr){ // 입력값이 있는 추첨
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			numbers.add(Integer.parseInt(arr[i]));
		}
		while(numbers.size()<6) {
			int lotto = (int)(Math.random() *45 + 1);
			boolean isEqual = false;
			for(int i=0; i<numbers.size(); i++) {
				if(lotto == numbers.get(i)) {
					isEqual = true;
				}
			}
			if(!isEqual) {
				numbers.add(lotto);
			}
		}
		Collections.sort(numbers);
		return numbers;
	}
}
/*
public class Result03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("행운의 로또 번호 생성기 입니다.");
		System.out.println("입력 값이 있으면 'y', 전체 자동으로 선택하려면 'n'를 선택하세요.");
		String num = scan.nextLine();
		
		if(num.equals("n"))
		{
			//Q1
			ArrayList<Integer> weekLottor = null;
			weekLottor = makeLotto();
			System.out.println("이번주 행운의 번호는");
			System.out.println(weekLottor);
		} 
		else if(num.equals("y"))
		{
			System.out.println("번호를 한칸씩 띄어서 입력해주세요. 최대 6개");
			String str = scan.nextLine();
			String numstr[] = str.split(" ");
			int[] numArr = new int[6];
			System.out.println("선택하신 번호는");
			for(int i=0; i<numstr.length; i++) 
			{
				numArr[i] = Integer.parseInt(numstr[i]);
				System.out.print(numArr[i]);
				if(i==numstr.length-1) {break;}
				System.out.print(",");
			}
			//Q2
			ArrayList<Integer> weekLottoc = null;
			weekLottoc = makeLotto(numArr);
			System.out.println("\n이번주 행운의 번호는");
			System.out.println(weekLottoc.toString());
		}
	}
	}
	public static ArrayList<Integer> makeLotto(int[] strArr)
	{
		HashSet<Integer> select = new HashSet<>();
		
		for(int i=0; i<strArr.length; i++)
		{
			select.add(strArr[i]);
		}
		ArrayList<Integer> lottoList = new ArrayList<>(select);
		
		while(lottoList.size()<6)
		{
			int num =(int)((Math.random() * 45)+1);
			lottoList.add(num);
		}
		Collections.sort(lottoList);
		
		return lottoList;
	}
	
	public static ArrayList<Integer> makeLotto()
	{
		ArrayList<Integer> lottoList = new ArrayList<>();
		
		while(lottoList.size()<6)
		{
			int num =(int)((Math.random() * 45)+1);			
			lottoList.add(num);
		}
		Collections.sort(lottoList);
		
		return lottoList;
	}
}	
*/