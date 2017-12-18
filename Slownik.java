/*
import java.util.HashMap;
import java.util.Scanner;

public class Slownik
{
HashMap<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("Witam, hello");
    dictionary.put("mama, mother");
    dictionary.put("pies, dog");

    dictionary.put("kot, cat");
    dictionary.put("animal, zwierze");
Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj wyraz po polsku");
    String polishWord = sc.next();

    if ( dictionary.containsKey(polishWord))

    {
        System.out.println( " Po nagiellksu to "+ dictionary.get(polishWord));
    }
    else
    {
        System.out.println("Nie znalziono słowa w slowniku");
    }
}
*/
import java.util.HashMap;
import java.util.Scanner;

public class Slownik {

    public void Slownik(String a, String b)
    {
        // write your code here
        // klucza, wartości Mapa
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("witam","hello");
        dictionary.put("mama","mother");
        dictionary.put("pies","dog");
        dictionary.put("kot","cat");
        dictionary.put("komputer","computer");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz po Polsku");
        String polishWord = scanner.next();

        if ( dictionary.containsKey(polishWord) ){
            System.out.println("Słowo po angielsku to "+dictionary.get(polishWord));
       return;
        }
        else{
            System.out.println("Nie znaleziona słowa w słowniku");
        return;
        }

    }
    public void Slownik setUstaw ()
    {
        System.out.println(" Cos tam");
return Slownik(String a,String b);
    }

}