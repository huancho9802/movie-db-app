package model.movie;

public class Movie implements Cloneable{
    // fields
    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Actors;
    private String Plot;
    private String Language;
    private String Countries;
    private String Poster;
    private String Metascore;
    private String imdbRating;
    private String imdbID;
    private String type;
    private String BoxOffice;

    // Overriding clone() method of Object class
    public Movie clone(){
        try {
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // equals method
    public Boolean equals(Movie m2) {
        return this.imdbID.equals(m2.getImdbID());
    }

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getRated() {
        return Rated;
    }

    public String getReleased() {
        return Released;
    }

    public String getRuntime() {
        return Runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDirector() {
        return Director;
    }

    public String getActors() {
        return Actors;
    }

    public String getPlot() {
        return Plot;
    }

    public String getLanguage() {
        return Language;
    }

    public String getCountries() {
        return Countries;
    }

    public String getPoster() {
        return Poster;
    }

    public String getMetascore() {
        return Metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return type;
    }

    public String getBoxOffice() {
        return BoxOffice;
    }
}
