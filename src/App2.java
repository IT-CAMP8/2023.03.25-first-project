public class App2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int wynik = a % b;
        System.out.println(wynik);

        double c = 10.0;
        double d = 6.8;
        double wynik2 = c % d + 5;
        System.out.println(wynik2);

        String s1 = "Mateusz";
        String s2 = "Bereda";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        boolean wynikLogiczny = a == b;
        System.out.println(wynikLogiczny);

        boolean b1 = true;
        boolean b2 = true;
        boolean result = b1 ^ b2;
        System.out.println(result);
        System.out.println(!b1);
    }
}
