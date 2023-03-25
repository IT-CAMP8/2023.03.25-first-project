public class App5 {
    public static void main(String[] args) {
        int a = 2;
        /*if (a > 5) {
            System.out.println("to jest 6 - 9 !!!");
        } else if (a > 4) {
            System.out.println("to jest 11 - 19 !!!");
        } else if (a > 3) {
            System.out.println("to jest 21 - 29 !!!");
        } else {
            System.out.println("jakas dziwna liczba !!!");
        }*/

        switch(a) {
            case 1:
                System.out.println("to jest 1");
                break;
            case 2:
            case 3:
                System.out.println("to jest 2 lub 3");
                break;
            default:
                System.out.println("to jest dziwna liczba");
                break;
        }

        /*if(a == 1) {

        } else if(a > 2 && a < 10) {

        } else if(a == 3) {

        } else {

        }*/

        System.out.println("koniec programu !!!");
    }
}
