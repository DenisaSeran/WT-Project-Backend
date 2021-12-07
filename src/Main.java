import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String []args){
        Film f1=new Film("Resident Evil","Ridley Scott","05/12/2021 15:00", 30);
        Film f2=new Film("Eternals","Chloe Zhao","06/12/2021 17:00", 35);
        Film f3=new Film("King Richard","Reinaldo Marcus Green","15/12/2021 16:00", 40);
        Film f4=new Film("Red Notice","Rawson Marshall Thurber","20/12/2021 12:00", 40);
        Film f5=new Film("Specer","Pablo Larraín","21/12/2021 14:00", 30);

        List<Film> movies= new ArrayList<>();
        movies.add(f1);
        movies.add(f2);
        movies.add(f3);
        movies.add(f4);
        movies.add(f5);




    }
}
