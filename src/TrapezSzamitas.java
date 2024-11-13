/*
* File: TrapezSzamitas.java
* Author: Tukolicza Péter
* Copyright: 2024, Tukolicza Péter
* Group: Szoft II/1/N
* Date: 2024-11-09
* Github: https://github.com/axiin/
* Licenc: GNU GPL
*/

import java.util.Scanner;



public class TrapezSzamitas {
    public static void main(String[] args) {
        
        System.out.println("Trapez terulet szamitasa");
        System.out.println("Tukolicza Péter, Szoft II-1-N, 2024-11-09");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az 'a' oldal hossza: ");
        double a = scanner.nextDouble();
        System.out.println("Az 'b' oldal hossza: ");
        double b = scanner.nextDouble();
        System.out.println("Az 'c' oldal hossza: ");
        double c = scanner.nextDouble();
        System.out.println("Az 'd' oldal hossza: ");
        double d = scanner.nextDouble();

        Trapez t1 = new Trapez(a, b, c, d);

        System.out.printf("A trapez teruete: %f\n", t1.calculateArea());

    
        scanner.close();
    }
}
