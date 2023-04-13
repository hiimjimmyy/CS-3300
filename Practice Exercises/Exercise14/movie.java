import java.util.*;

public class movie {
    private Map<Integer, String> MPAARating = new HashMap();
    private String movieTitle;
    private int IDNumber;
    private String ratingOfMovie;

    //constructor
    movie()
    {
        movieTitle = null;
        IDNumber = assignID();
        populateRating();
        ratingOfMovie = getMPAARating();
    }

    //this will assign the movies' ID
    public int assignID() {
        Random randomValue = new Random();
        int randomIDValue = randomValue.nextInt(1000);
        return randomIDValue;
    }

    public void populateRating()
    {
        MPAARating.put(1, "G");
        MPAARating.put(2, "PG");
        MPAARating.put(3, "PG-13");
        MPAARating.put(4, "R");
        MPAARating.put(5, "NC-17");
    }

    public String getMPAARating(Integer userInpuInteger) 
    {
        return MPAARating.get(userInpuInteger);
    }

    public void setMPAARating(Integer userInputInteger)
    {
        this.ratingOfMovie = getMPAARating(userInputInteger);
    }


}


