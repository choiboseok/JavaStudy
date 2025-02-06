package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	private ArrayList<Movie> movieList = new ArrayList<>();
	public ArrayList<Movie> getMovieList(){return movieList;}

	//생성자
	//1개의 인스턴스를 만드는 방법, 최초 한번만 할당
	//메모리 낭비 방지, 싱글톤 패턴
	private MovieDB()
	{
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "넌 계획이 다 있구나	", "송강호", "ㄱㅅㅊ"));
		movieList.add(new Movie("실미도", "비겁한 변명입니다.", "설경구", "ㅅㅁㄷ"));
		movieList.add(new Movie("친구",  "니가가라 하와이", "장동건", "ㅊㄱ"));
		movieList.add(new Movie("타짜",  "나 이대 나온 여자야!", "김혜수", "ㅌㅉ"));
	}
	
	//static 메소드 외부 사용 가능
	private static MovieDB instance = new MovieDB();
	public static MovieDB getInstance()	{return instance;}
	
	
}
