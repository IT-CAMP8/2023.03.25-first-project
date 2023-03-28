public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < 10; i++) {
            tab[i] = i;
        }

        /*for(int element : tab) {
            element = 5;
        }*/

        /*for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }*/

        for(int element : tab) {
            System.out.println(element);
        }

        System.out.println("----------------------------------------");

        int x = 1000;
        while (x < 100) {
            System.out.println(x);
            x++;
        }

        System.out.println("------------------------------------------");
        int y = 1000;
        do {
            System.out.println(y);
            y++;
        } while (y < 100);

        System.out.println("------------------------------------------");

        while(true) {
            System.out.println("Działa !!");
        }
    }
}
