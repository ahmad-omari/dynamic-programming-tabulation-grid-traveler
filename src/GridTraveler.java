/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/22/2022, Saturday
 * @project : dynamic-programming-tabulation-grid-traveler
 **/
public class GridTraveler {

    public static long gridTraveler(int m, int n) {
        long[][] arr = new long[m + 1][n + 1];
        arr[1][1] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                long current = arr[i][j];
                if ((i + 1) < arr.length)
                    arr[i + 1][j] += current;
                if ((j + 1) < arr[i].length)
                    arr[i][j + 1] += current;
            }
        }
        return arr[m][n];
    }

    public static void main(String[] args) {
        System.out.println(gridTraveler(1, 1));
        System.out.println(gridTraveler(2, 3));
        System.out.println(gridTraveler(3, 2));
        System.out.println(gridTraveler(3, 3));
        System.out.println(gridTraveler(18, 18));
    }
}
