import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i obliczy obwód tego okręgu.
        // Do obliczeń przyjmij najpierw pi = 3.14, a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam
        //stałej pi

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj średnicę: ");
//        float diameter = scanner.nextFloat();
//        float perimeter = (float) (2 * (Math.PI) * (diameter/2));
//        System.out.println(perimeter);
//        ========================================================================================================================

//        Napisz program, obliczający BMI (Body Mass Index) i sprawdzający czy jest ono w normie. Program powinien wczytywać od użytkownika
//        dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int). BMI powinno zostać wyliczone zgodnie z poniższym
//        wzorem: BMI = masa/wzrost^2
//        Optymalny  zakres  BMI  wynosi  od  18.5  do  24.9,  wartości  mniejsze  lub  większe  są wartościami nieoptymalnymi.
//        Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.
//

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj wagę: ");
//        float waga = scanner.nextFloat();
//        System.out.println("Podaj wzrost: ");
//        float wzrost = scanner.nextInt()/100;
//        float BMI = waga/(wzrost*wzrost);
//        System.out.println("BMI wynosi: " + BMI);
//        if (BMI < 18.5 || BMI > 24.9) {
//            System.out.println("BMI nieoptymalne");
//        } else {
//            System.out.println("BMI optymalne");
//        }
//        ============================================================================================================================
//        Napisz  program  służący  do  rozwiązywania  równania  kwadratowego.
//        Program powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania ax^2 + bx + c = 0
//        Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i  zakończ program.
//        Potrzebne wzory:
//        ∆ = b^2 - 4ac
//            x1 = -b - pierwiastek ∆/2a
//            x2 = -b + pierwiastek ∆/2a

//        System.out.println("Podaj trzy liczby całkowite: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        Scanner scanner1 = new Scanner(System.in);
//        int b = scanner1.nextInt();
//        Scanner scanner2 = new Scanner(System.in);
//        int c = scanner2.nextInt();
//
//        int delta = (b*b) - 4*a*c;
//        if (delta < 0) {
//            System.out.println("∆ jest ujemna");
//            return;
//        }
//        double x1 = (-b - Math.sqrt(delta)) / 2*a;
//        double x2 = (-b + Math.sqrt(delta)) / 2*a;
//        System.out.println("x1 = " + x1 + "x2 = " + x2);
//    =======================================================================================================================
//        Napisz  program,  który  pobierze  od  użytkownika  dodatnią  liczbę  (typu int)  i  wypisze wszystkie  liczby  od  1  do  podanej  liczby,
//        każda  w  kolejnej  linijce,  z  następującymi zmianami:
//        ● w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”
//        ● w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”
//        ● jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif, paf”

//        System.out.println("Podaj dodatnią liczbę całkowitą: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println("Pif");
//            } else if (i % 7 == 0) {
//                System.out.println("Paf");
//            } else if (i % 3 == 0) {
//                System.out.println("Pif, paf");
//            } else {
//                System.out.println(i);
//            }
//        }
//        =================================================================================================================

//        Napisz  program,  który  pobierze  od  użytkownika  liczbę  dodatnią  (typu  int)  i  wypisze wszystkie liczby pierwsze,
//                większe od 1 i mniejsze od podanej liczby



    }
}