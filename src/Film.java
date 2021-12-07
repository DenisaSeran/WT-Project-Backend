
public class Film {
    String name;
    String director;
    String date_time;
    int tickets;


    public Film(String name, String director, String date_time, int tickets) {
        this.name = name;
        this.director = director;
        this.date_time = date_time;
        this.tickets=tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", date_time='" + date_time + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
