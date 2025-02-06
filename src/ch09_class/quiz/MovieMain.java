package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieMain {
	public static void main(String[] args) {
		MovieDB db1 = MovieDB.getInstance();
		MovieDB db2 = MovieDB.getInstance();
		System.out.println(db1);
		System.out.println(db2);//객체 주소 동일
//		MovieDB test = new MovieDB() new 불가능, 싱글톤 패턴
		
		ArrayList<Movie> movieList = db1.getMovieList();
		Collections.shuffle(movieList);
		System.out.println(movieList);
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("영화 맞추기 게임");
		for(int i=0; i<movieList.size(); i++)
		{
			System.out.println(movieList.get(i).getQuotes());
			System.out.print("입력:");
			String answer = scan.nextLine();
			//첫번째
			if(answer.equals(movieList.get(i).getTitle()))
			{
				System.out.println("정답입니다.");
				score+=3;
				continue;
			}
			//두번째
			System.out.println(movieList.get(i).getActors());
			System.out.print("입력:");
			answer = scan.nextLine();
			if(answer.equals(movieList.get(i).getTitle()))
			{
				System.out.println("정답입니다.");
				score+=2;
				continue;
			}
			//세번째
			System.out.println(movieList.get(i).getWord());
			System.out.print("입력:");
			answer = scan.nextLine();
			if(answer.equals(movieList.get(i).getTitle()))
			{
				System.out.println("정답입니다.");
				score+=1;
				continue;
			}			
			System.out.println("틀렸습니다. 다음문제로");
		}
		System.out.println("점수는:" + score);
	}
}
