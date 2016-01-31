package movies;
import java.util.ArrayList;
import java.util.List;

import movies.Movie.Genre;
import movies.Person.Gender;
import java.io.*;

public class MovieManager 
{
	
	public static final String filePath = "C:\\Users\\Kristof\\Desktop\\Workspace\\Week_9A\\src\\output.xml";
	public static void main(String[] args) 
	{
		Person me = new Person("Rami","Malek", Gender.MALE, false, true);
		List<Person> persons = new ArrayList<Person>();
		persons.add(me);
		Movie favMovie = new Movie("Mr Robot",Genre.THRILLER,45,9.8,persons);
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(favMovie);
		try
		{
			BufferedWriter writeToXML = new BufferedWriter(new FileWriter(new File(filePath)));
			StringBuffer concatenateText = new StringBuffer();
			concatenateText.append("<movies>");
			concatenateText.append(favMovie.toXMLString());
			concatenateText.append(me.toXMLString());
			concatenateText.append("</movies>");
			writeToXML.write(concatenateText.toString());
			writeToXML.flush();
			writeToXML.close();
			System.out.println("Success!");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		
	}

}
