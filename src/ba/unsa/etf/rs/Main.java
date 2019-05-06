package ba.unsa.etf.rs;

import java.util.function.Function;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void Raspon100 (Function<Double, Double> fun) {
        for (double i=0; i<=100; i++) {
            System.out.println(fun.apply(i));
        }
    }
    public static Integer Suma (Integer x) {
        Integer sumaX=0;
        while (x != 0) {
            sumaX += x%10;
            x /= 10;
        }
        return sumaX;
    }
    public static void main(String[] args) {
        // Zadatak 1: Raspon100(x -> x*x + 2*x + 1);


        System.out.print("Unesite broj elemenata: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt(); int[] niz = new int[n];
        System.out.print("Unesite elemenate: ");
        for (int i=0; i<n; i++) niz[i] = ulaz.nextInt();

        // Zadatak 2: Arrays.sort(niz, ( x, y) -> Suma(x) - Suma(y));
        // Zadatak 3:
        niz = Arrays.stream(niz).boxed().sorted((x, y) -> Suma(x) - Suma(y)).mapToInt(i -> i).toArray();

        for (int el : niz) System.out.print(el + " ");
    }
}
