public class App4 {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Mateusz";
        imiona[1] = "Janusz";
        imiona[2] = "Karol";
        System.out.println(imiona[2]);

        int[] ints = new int[5];
        double[] doubles = new double[5];
        boolean[] booleans = new boolean[5];

        //System.out.println(ints[0]);
        System.out.println(ints[0]);
        System.out.println(doubles[0]);
        System.out.println(booleans[0]);

        String[] imiona2 = {"Mateusz", "Janusz", "Karol"};
        System.out.println(imiona2[1]);

        String wazneImie = "Bogdan";
        imiona2[0] = "Bogdan";

        int[][] ints2D = new int[5][2];
        ints2D[2][1] = 123;

        System.out.println(ints2D[2][1]);

        int x;
        int[] x2 = {1,2,3,4};
        int[][] x3 = {
                {1,2,3},
                {2,3,4},
                {3,4,5},
                {4,5,6,10}
        };
        int[][][] x4 = new int[5][6][2];

        //System.out.println(x3[2][3]);

        int[][] tab = new int[5][5];
        tab[1] = new int[100];

        int[][] tab1;

        int l = 5;
        tab1 = new int[15][l];
        tab1[0] = new int[100];
        tab1[1] = new int[200];
        tab1[2] = new int[10];
        System.out.println(tab1[0][0]);
    }
}
