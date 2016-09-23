public class Netflix {
	public static void main(String[] args) {
		Movie FindingDumbo = new Movie("Finding Dumbo",3 );
		Movie StarWars13 = new Movie("Star Wars 13", 3);
		Movie Transformers8 = new Movie("Transformers 8", 2);
		Movie Barbie = new Movie("Barbie Life in the Dream House", 5);
		Movie twilight = new Movie("Twilight", 1);
	
		String dumbo = FindingDumbo.getTicketPrice();
		String transformers = Transformers8.getTicketPrice();
		String twilights = twilight.getTicketPrice();
		System.out.println(twilights);
		System.out.println(dumbo);
		System.out.println(transformers);
		System.out.println();
		System.out.println();

		NetflixQueue net = new NetflixQueue();
	
		net.addMovie(twilight);
		net.addMovie(Barbie);
		net.addMovie(Transformers8);
		net.addMovie(StarWars13);
		net.addMovie(FindingDumbo);
		net.sortMoviesByRating();
		Movie movie = net.getBestMovie();
		net.printMovies();
		System.out.println(movie.getTitle());
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		System.out.println(net.getMovie(1));
	}
}