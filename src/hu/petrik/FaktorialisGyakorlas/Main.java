package hu.petrik.FaktorialisGyakorlas;

public class Main {
    public static void main(String[] args) {
        System.out.println(faktorialis(3));
        System.out.println(hatvany(5, 2));
        int darab = 5;
        int max = 90;
        int[] tomb = new int[darab];
        lotto(tomb, max, darab);
        for (int szam : tomb) {
            System.out.println(szam);
        }
    }

    public static int faktorialis(int n) {
        if (n > 0) {
            return n * (faktorialis(n - 1));
        }
        return 1;
    }

    public static int hatvany(int a, int k) {
        if (k > 0) {
            return a * hatvany(a, k - 1);
        }
        return 1;
    }

    public static void lotto(int[] szamok, int max, int db) {
        if (db > 0) {
            szamok[db - 1] = (int) (Math.random() * max + 1);
            lotto(szamok, max, db - 1);
        }
    }
}

