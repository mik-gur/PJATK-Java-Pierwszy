import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex01();
        Ex02();
        Ex03();
        Ex04();
        Ex05();
        Ex06();
        Ex07();
        Ex08();
        //Ex09();
        Ex10();
        Ex11();
        Ex12();
        Ex13();
    }

    public static void Ex01() {
        Scanner scanner = new Scanner(System.in);
        int sideA;
        int sideB;

        System.out.println("Podaj bok A: ");
        sideA = scanner.nextInt();

        System.out.println("Podaj bok B: ");
        sideB = scanner.nextInt();

        System.out.println("Pole prostokąta wynosi: " + sideA*sideB);
    }







    public static void Ex02() {
        double result = Math.sqrt(Math.PI);
        
        System.out.println("Pierwsiatek kwadratowy z PI wynosi: "+ new DecimalFormat("#.##").format(result));
    }







    public static void Ex03() {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Podaj dwa teksty oddzielone znakiem spacji: ");
        text = scanner.nextLine();
        String[] texts = text.split(" ");
        System.out.println("%" + texts[1] + " " + texts[0] + "%");
    }







    public static void Ex04() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        String text = "Da się zbudować trójkąt";

        System.out.println("Podaj boki trójkąta");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a+b>c)
            System.out.println(text);
        else if (a+c>b)
            System.out.println(text);
        else if (b+c>a)
            System.out.println(text);
        else
            System.out.println("BŁĄD");
    }







    public static void Ex05() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę miesiąca: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("Styczeń 31 dni");
            case 2 -> System.out.println("Luty 28 dni");
            case 3 -> System.out.println("Marzec 31 dni");
            case 4 -> System.out.println("Kwiecień 30 dni");
            case 5 -> System.out.println("Maj 31 dni");
            case 6 -> System.out.println("Czerwiec 30 dni");
            case 7 -> System.out.println("Lipiec 31 dni");
            case 8 -> System.out.println("Sierpień 31 dni");
            case 9 -> System.out.println("Wrzesień 30 dni");
            case 10 -> System.out.println("Październik 31 dni");
            case 11 -> System.out.println("Listopad 30 dni");
            case 12 -> System.out.println("Grudzień 31 dni");
            default -> System.out.println("BŁĄD!");
        }
    }







    public static void Ex06() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj trzy liczby: ");
        double l1 = scanner.nextDouble();
        double l2 = scanner.nextDouble();
        double l3 = scanner.nextDouble();

        double smallestNumber = Math.min(Math.min(l1, l2), l3);
        double biggestNumber = Math.max(Math.max(l1, l2), l3);
        double middleNumber = l1 + l2 + l3 - smallestNumber - biggestNumber;

        System.out.printf("%.6f %.6f %.6f\n", smallestNumber, middleNumber, biggestNumber);
        System.out.printf("%.6f %.6f %.6f\n", biggestNumber, middleNumber, smallestNumber);
    }







    public static void Ex07() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj rozmiary tablic: ");
        int n = input.nextInt();
        int m = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Podaj elementy tablic: ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = input.nextInt();
        }

        if (n != m) {
            System.out.println("BŁĄD");
        } else {
            int product = 0;
            for (int i = 0; i < n; i++) {
                product += A[i] * B[i];
            }
            System.out.println(product);
        }
    }






    public static void Ex08() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Podaj liczbę naturalną n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    isValid = true;
                }
            }
            sc.nextLine();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }






    public static void Ex09() {
        Scanner scanner = new Scanner(System.in);
        char[] word = new char[100];
        int i = 0;
        System.out.println("Podaj tekst, do sprawdzenia, czy jest palindromem: ");
        while (scanner.hasNext()) {
            char c = scanner.next().charAt(0);
            if (c == '\n') {
                break;
            }
            word[i] = c;
            i++;
        }
        boolean isPalindrome = isPalindrome(Arrays.copyOf(word, i));
        if (isPalindrome) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    public static boolean isPalindrome(char[] word) {
        int i = 0;
        int j = word.length - 1;
        while (i < j) {
            if (word[i] != word[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }





    public static void Ex10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiary macierzy");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        int[][] macierz = new int[a][b];

        System.out.println("Podaj liczby do macierzy: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                macierz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }





    public static void Ex11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst do sprawdzenia, czy jest pangramem: ");
        String text = scanner.nextLine();
        boolean isPangram = isPangram(text);
        System.out.println("Czy jest? " + isPangram);
    }
        public static boolean isPangram(String text) {
            text = text.toLowerCase();

            boolean[] alphabet = new boolean[26];

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a'] = true;
                }
            }

            for (boolean b : alphabet) {
                if (!b) {
                    return false;
                }
            }
            return true;
        }




    public static void Ex12() {
        Scanner scanner = new Scanner(System.in);
        Integer earthAge = 31557600;
        Float age;
        String planet;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Podaj wiek w sekundach: ");
        age = scanner.nextFloat();

        System.out.println("Podaj planete dla ktorej obliczyc wiek: ");
        Scanner scanner2 = new Scanner(System.in);
        planet = scanner2.nextLine();

        switch (planet) {
            case "Merkury" -> System.out.println(decimalFormat.format(age/earthAge*0.2408467));
            case "Wenus" -> System.out.println(decimalFormat.format(age/earthAge*0.61519726));
            case "Ziemia" -> System.out.println(decimalFormat.format(age/earthAge));
            case "Mars" -> System.out.println(decimalFormat.format(age/earthAge*1.8808158));
            case "Jowisz" -> System.out.println(decimalFormat.format(age/earthAge*11.862615));
            case "Saturn" -> System.out.println(decimalFormat.format(age/earthAge*29.447498));
            case "Uran" -> System.out.println(decimalFormat.format(age/earthAge*84.016846));
            case "Neptun" -> System.out.println(decimalFormat.format(age/earthAge*164.79132));
            default -> System.out.println("BŁĄD!");
        }
    }





    public static void Ex13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow w tablicy: ");
        int[] tab = new int[scanner.nextInt()];

        System.out.println("Podaj liczby:");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
        System.out.println(findTheBiggestElement(tab));
    }
    public static int findTheBiggestElement(int[] tablica) {
        return findTheBiggestElement(tablica, 0, tablica.length - 1);
    }
    private static int findTheBiggestElement(int[] tab, int first, int last) {
        if (first == last) {
            return tab[first];
        } else {
            int middle = (first + last) / 2;
            int theBiggestFromStart = findTheBiggestElement(tab, first, middle);
            int theBiggestFromEnd = findTheBiggestElement(tab, middle + 1, last);
            return Math.max(theBiggestFromStart, theBiggestFromEnd);
        }
    }
}