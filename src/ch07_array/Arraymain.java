package ch07_array;

import java.net.Socket;

/**
 * class Name 	: Arraymain
 * Author	  	: BoSeok
 * Created Date : 2025. 2. 3.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: array 배열 선언 및 사용
 */
public class Arraymain {
	public static void main(String[] args) {
		String samjang = "삼장";
		String ogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";
		
		String [] seoyugi = new String[4];
		System.out.println(seoyugi.length);
		System.out.println(seoyugi[0]);
		System.out.println(seoyugi);
		
		seoyugi[0] = samjang;
		seoyugi[1] = ogong;
		seoyugi[2] = saojeong;
		seoyugi[3] = palgye;
		System.out.println(seoyugi);
		printArr(seoyugi);
		
		int [] numbers = new int[3];
		System.out.println(numbers[0]);
		boolean [] bools = new boolean[5];
		System.out.println(bools[0]);
		
		for(int i=0; i<seoyugi.length; i++)
		{
			seoyugi[i] = "서유기 " + seoyugi[i];
		}
		printArr(seoyugi);
		
		for(int i=0; i<seoyugi.length; i++)
		{
			//contains - 찾고자 하는 언어 찾기
			//replace - 변경하고자 하는 문자로 기존 문자 변경
			if(seoyugi[i].contains("오공")) seoyugi[i] = seoyugi[i].replace("서유기", "드래곤볼");
		}
		printArr(seoyugi);
		
		String [] students = {"팽수", "길동", "동길", "길수"};
//		String [] students = new String[]{"팽수", "길동", "동길", "길수"};
		printArr(students);
		
		String subjects = "JAVA, DB, JS, HTML";
		String [] subArr = subjects.split(","); // 구분 문자를 활용하여 문자 담
		printArr(subArr);
		
		for(int i=0; i<subArr.length; i++)
		{
			subArr[i] = subArr[i].trim(); //공백제거 함수 
		}
		printArr(subArr);
		
		//shallow copy
		printArr(seoyugi);
		String [] sinSeoyugi = seoyugi;
		printArr(sinSeoyugi);
		sinSeoyugi[0] = "강호동";
		printArr(seoyugi);
		printArr(sinSeoyugi);
		
		//deep copy
		String[] newSeoyugi = seoyugi.clone();
		newSeoyugi[2] = "은지원";
		printArr(seoyugi);
		printArr(newSeoyugi);
		
		//clone 기능이 없을때 복사 방법
		String [] copy = new String[seoyugi.length];
		for(int i=0; i<seoyugi.length; i++)
		{
			copy[i]=seoyugi[i];
		}
		
		int [] oneD = {1, 2, 3};
		System.out.println(oneD[1]);
		
		int [] [] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(twoD[0][1]);
		
		int [] [] [] threeD = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11}}};
		System.out.println(threeD[0][0][1]);
		
		for(int i=0; i<twoD.length; i++) {
			for(int j=0; j<twoD.length; j++) {
				System.out.println(twoD[i][j]);
			}
		}
		
		for(int i=0; i<threeD.length; i++) {
			for(int j=0; j<threeD.length; j++) {
				for(int k=0; k<threeD.length; k++) {
					System.out.println(threeD[i][j][k]);
					System.out.printf("threeD{%d]{%d][%d]=%d\n", i, j, k, threeD[i][j][k]);
				}
			}
		}
	}
	
	public static void printArr(String[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(i<(arr.length-1))	System.out.printf(arr[i] + ", ");
			else if(i==(arr.length-1)) System.out.println(arr[i]);
		}
		/*
		for(int i=0; i<arr.length; i++)
		{
			if(i==arr.length-1)
				System.out.println(arr[i]);
				break;
		}
		*/
	}
}
