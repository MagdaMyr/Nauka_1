public class Krasomowca {
    public static void main(String[] args){

        //trzy grupy slow =, ktore beda wybierane do zadania
        String[] listaSlow1 = {"copywriter", "gleboka woda", "konwersja", "DNA marki", "social media", "specjalista"};

        String[] listaSlow2 = {"SEO", "grownth hacker", "biurko", "aplikacja", "przenikliwosc", "pozycjonowanie", "personalizacja", "wideo"};

        String[] listaSlow3 = {"skoncentrowana na", "podniesiona na wyzszy poziom", "bazujaca na", "zwieksza mozliwosc", "witryna", "strona www"};

        // okreslienie, ile jest slow w kazdej z list
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;

        //generacja trzech losowych slow (lub zwrotow)
        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);

        //stworzenie zdania
        String zdanie = listaSlow1[rnd1] + ", " + listaSlow2[rnd2] + ", " + listaSlow3[rnd3];

        // wyswietlenie zdania
        System.out.println("To jest to, czego nam trzeba: " + zdanie + ".");
    }
}
