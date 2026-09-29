package com.langfundamentals.constructors;

public class Favmovie {

	String director;
	String hero;
	String heroine;
	String movieName;
	double budget;

	// now we are calling one arg constructor ,two ,three ...

	Favmovie(String director) { // one-arg constructor
		this.director = director;
	}

	Favmovie(String director, String hero) { // two-arg constructor
		this.director = director;
		this.hero = hero;
	}
	
	Favmovie(String director, String hero,String heroine) { // three-arg constructor
		this.director = director;
		this.hero = hero;
		this.heroine=heroine;
	}
	
	Favmovie(String director, String hero,String heroine,String movieName) { // 4-arg constructor
		this.director = director;
		this.hero = hero;
		this.heroine=heroine;
		this.movieName=movieName;
	}
	
	Favmovie(String director, String hero,String heroine,String movieName,double budget) { // 5-arg constructor
		this.director = director;
		this.hero = hero;
		this.heroine=heroine;
		this.movieName=movieName;
		this.budget=budget;
	}

	public static void main(String[] args) {

		Favmovie m = new Favmovie(" Raghava Lawrence");
		m.movieInfo();

		Favmovie m1 = new Favmovie("Raghava Lawrence", "Prabhas");
		m1.movieInfo();
		
		Favmovie m2 = new Favmovie("Raghava Lawrence", "Prabhas","Tamannaah");
		m2.movieInfo();
		
		Favmovie m3 = new Favmovie("Raghava Lawrence", "Prabhas","Tamannaah","Rebel");
		m3.movieInfo();
		
		Favmovie m4 = new Favmovie("Raghava Lawrence", "Prabhas","Tamannaah","Rebel",40);
		m4.movieInfo();
	}

	void movieInfo() {
		System.out.println("-----------My Fav Movie Info---------");
		System.out.println("Director Name : " + director);
		System.out.println("Hero Name : " + hero);
		System.out.println("Heroine Name : " + heroine);
		System.out.println("Movie Name : " + movieName);
		System.out.println("Budget : " + budget + "cr");
	}

}
