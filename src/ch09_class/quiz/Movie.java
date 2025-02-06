package ch09_class.quiz;

public class Movie {
	private String title;
	private String quotes; //대사
	private String actors; 
	private String word;
	
	// 1. 기본 생성자
	public Movie(String title, String quotes, String actors, String word) {
		super();
		this.title = title;
		this.quotes = quotes;
		this.actors = actors;
		this.word = word;
	}
	public Movie() {}
	
	// 2. getter, setter
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getQuotes() {return quotes;}
	public void setQuotes(String quotes) {this.quotes = quotes;}
	public String getActors() {return actors;}
	public void setActors(String actors) {this.actors = actors;}
	public String getWord() {return word;}
	public void setWord(String word) {this.word = word;}
	
	// 3. toString
	@Override
	public String toString() {
		return "Movie [title=" + title + ", quotes=" + quotes + ", actors=" + actors + ", word=" + word + "]";
	}
	
}
