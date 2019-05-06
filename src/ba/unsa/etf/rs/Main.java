package ba.unsa.etf.rs;

import java.util.function.Function;

public class Main {

    public static void Raspon100 (Function<Double, Double> fun) {
        for (double i=0; i<=100; i++) {
            System.out.println(fun.apply(i));
        }
    }
    public static void main(String[] args) {
	Raspon100(x -> x*x + 2*x + 1);
    }
}
