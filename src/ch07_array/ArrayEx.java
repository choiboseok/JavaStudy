package ch07_array;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] students = { "강지석", "김도래", "김병준", "김서영", "김소연", "김원진", "박정단", 
				              "박종욱", "송은호", "신미정", "이예성", "이예은", "정지나",	"최보석", "한수정" };

		for(int i=0; i<students.length; i++)
		{
			System.out.printf("%d.%s ", (i+1), students[i]);
		}
		System.out.println();
		
		System.out.printf("찾고 싶은 성씨를 입력해주세요:");
		String arr = scan.nextLine();
		
		searchNm(arr, students);
	}
	
	public static void searchNm(String arr1, String[] arr2)
	{
		int cnt=0;
		int cnt1=0;
		// String msg = "";
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i].contains(arr1))
			{
				cnt+=1;
			}
		}
		
		if(cnt==0) 
		{
			System.out.println(arr1 + "씨는 존재하지 않습니다.");
			return;
		}
		
		String Frist [] = new String[cnt];
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i].contains(arr1))
			{
				Frist[cnt1] = arr2[i];
				cnt1+=1;
			}
		}
		
		System.out.printf("%s씨 성을 가진 사람은 총 %d명 있습니다.\n", arr1, cnt);
		for(int i=0; i<Frist.length; i++)
		{
			System.out.println(Frist[i]);
		}
		
		/*
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i].contains(arr1))
			{
				cnt+=1;
				msg+=arr2[i];
			}
		}
		
		System.out.printf("%s씨 성을 가진 사람은 총 %d명 있습니다.\n", arr1, cnt);
		System.out.println(msg);
		*/
		
		
	}
}