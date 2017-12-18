import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>friends = new ArrayList<>();
        friends.add("Zsoka");
        friends.add("Pawel");
        friends.add("Ula");
        friends.add("Maciek");


        System.out.println("Moi  Przyjacile ");
        for (String friend: friends)
        {
            System.out.println(friend);
        }
        System.out.println(" Ilosc przyjaciol " + friends.size());

        Slownik slownik = new Slownik();
//slownik.
    }
}
