package movies;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Tools {
	
	public static String toXMLTag(String tagName, String value){
		return "<" + tagName + ">" + value + "</" + tagName + ">";
	}
	
	public static String[] getMovieTitles(ArrayList<Movie> movies)
	{
		String[] getResult = new String[movies.size()];
		for(int i = 0; i < movies.size(); i++)
		{
			getResult[i] = movies.get(i).getTitle();
		}
		return getResult;
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
		HashMap<Person, Integer> moviePerPerson = new HashMap<>();
		for (Movie movie: movies)
		{
			for (Person person: movie.getCast())
			{
				if(moviePerPerson.containsKey(person))
				{
					moviePerPerson.put(person, moviePerPerson.get(person) + 1);
				}
				else
				{
					moviePerPerson.put(person,1);
				}
			}
		}
		return moviePerPerson;
		
	}

}
